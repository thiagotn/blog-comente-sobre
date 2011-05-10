/***
 * Copyright (c) 2009 Caelum - www.caelum.com.br/opensource
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 * 	http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License. 
 */
package cc.thiago.comentesobre.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import cc.thiago.comentesobre.dao.ComentarioDao;
import cc.thiago.comentesobre.modelo.Comentario;
import cc.thiago.comentesobre.util.StringUtil;

import com.google.common.base.Strings;

@Resource
public class IndexController {

	private ComentarioDao comentarioDao;
	private Result result;

	public IndexController(ComentarioDao comentarioDao, Result result) {
		this.comentarioDao = comentarioDao;
		this.result = result;
	}
	
	@Path("/")
	public void index() {
	
	}
	
	@Post @Path("/{comentario.assunto}")
	public void form(Comentario comentario) {
		String assunto = comentario.getAssunto();
		try {
			assunto = URLDecoder.decode(assunto,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		comentario.setAssunto(assunto);
		result.include("comentario", comentario);
		listaTopAssuntos();	
	}
	
	@Post
	public void salva(Comentario comentario) {
		String assunto = comentario.getAssunto();
		comentario.setData(Calendar.getInstance());
		assunto = StringUtil.converteStringParaUri(assunto);
		if((!Strings.isNullOrEmpty(comentario.getComentario())) && (!Strings.isNullOrEmpty(comentario.getEmail()))) {
			comentario.setAssunto(assunto);
			comentarioDao.salva(comentario);
		}
		result.redirectTo(IndexController.class).lista(assunto);
	}
	
	@Get @Path("/comentarios/sobre/{assunto}")
	public void lista(String assunto) {
		List<Comentario> comentarios = new ArrayList<Comentario>();
		comentarios = comentarioDao.lista(assunto);
		result.include("comentarios", comentarios);
		result.include("assunto", assunto);
		listaTopAssuntos();	
	}
	
	public void listaTopAssuntos() {
//		List<Object[]> assuntos = comentarioDao.listaAssuntos();
//		result.include("assuntos", assuntos);
	}
	
}
