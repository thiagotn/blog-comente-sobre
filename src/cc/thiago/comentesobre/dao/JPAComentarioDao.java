package cc.thiago.comentesobre.dao;

import java.util.List;

import br.com.caelum.vraptor.ioc.Component;

import cc.thiago.comentesobre.modelo.Comentario;

@Component
public class JPAComentarioDao implements ComentarioDao {

	@Override
	public List<Comentario> lista(String assunto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object[]> listaAssuntos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void salva(Comentario comentario) {
		// TODO Auto-generated method stub
		
	}

}
