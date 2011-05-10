package cc.thiago.comentesobre.dao;

import java.util.List;

import cc.thiago.comentesobre.modelo.Comentario;

public interface ComentarioDao {

	List<Comentario> lista(String assunto);

	List<Object[]> listaAssuntos();
	
	void salva(Comentario comentario);
	
}
