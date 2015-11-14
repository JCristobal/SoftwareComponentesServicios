package modelo;
/**
 * 
 * @author jcristobal
 *
 */

public class Usuario {

	private static final long serialVersionUID = 1L;
	private long idUsuario;
	private String email;
	private String nombre;
	private String apellido;	
	
	/**
	 * Constructor de un usuario vacío
	 */
	public Usuario (){
		email = "";
		nombre = "";
		apellido = "";
	}
	/**
	 * Constructor de usuario según 3 parámetros
	 * @param email correo electrónico del usuario
	 * @param nombre nombre del usuario
	 * @param apellido apellidos del usuario
	 */
	public Usuario (String email, String nombre, String apellido){
		this.email = email;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	/**
	 * Constructor del usuario seǵun 4 parámetros
	 * @param email correo electrónico del usuario
	 * @param nombre nombre del usuario
	 * @param apellido apellidos del usuario
	 * @param idUsuario identificador del usuario
	 */
	public Usuario(String email, String nombre, String apellido, long idUsuario) {
		this.email = email;
		this.nombre = nombre;
		this.apellido = apellido;
		this.idUsuario = idUsuario;
	}

	/**
	 * @return identificador del usuario
	 */
	public long getIdUsuario() {
		return idUsuario;
	}

	/**
	 * @param cambia el identificador del usuario
	 */
	public void setIdUsuario(long idUsuario) {
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
	
	
}
