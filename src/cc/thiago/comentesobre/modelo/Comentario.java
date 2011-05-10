package cc.thiago.comentesobre.modelo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.google.appengine.api.datastore.Key;

@Entity
public class Comentario {

	@Id @GeneratedValue
	private Key key;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar data;
	
	private String assunto;
	
	private String email;
	
	@Lob
	private String comentario;

	public Comentario() {
		
	}
	
	public Comentario(Key key, Calendar data, String assunto, String email,
			String comentario) {
		super();
		this.key = key;
		this.data = data;
		this.assunto = assunto;
		this.email = email;
		this.comentario = comentario;
	}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
}
