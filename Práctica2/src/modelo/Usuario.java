package modelo;
/**
 * 
 * @author jcristobal
 *
 */
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long idUsuario;
	private String nombre;
	private String apellido;
	private String email;

	/**
	 * Constructor de un usuario vacío
	 */
	public Usuario(){
		
	}
	/**
	 * Constructor de usuario según 3 parámetros
	 * @param email correo electrónico del usuario
	 * @param nombre nombre del usuario
	 * @param apellido apellidos del usuario
	 */
	public Usuario(String nombre, String apellido, String email){
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	};
	/**
	 * Constructor de copia
	 * @param us usuario a copiar
	 */
	public Usuario(Usuario us){
		this.nombre = us.nombre;
		this.apellido = us.apellido;
		this.email = us.email;
	}

	/**
	 * @return identificador del usuario
	 */
	public long getIdUsuario(){
		return idUsuario;
	}
	
	/**
	 * @param cambia el identificador del usuario
	 */
	public void setIdUsuario(long idUsuario){
		this.idUsuario = idUsuario;
	}
	
	/**
	 * @return correo electrónico del usuario
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param cambia el correo electrónico del usuario
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return nombre del usuario
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param cambia el nombre del usuario
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return  apellidos del usuario
	 */
	public String getApellido() {
		return apellido;
	}
	
	/**
	 * @param  cambia apellidos del usuario
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	/**
	 * 
	 * @return datos del usuario: nombre, apellido y email
	 */
	@Override
	public String toString(){
		return nombre + " " + apellido + " " + email;
	}
	
}
