package modelo;


public class Usuario {

	private static final long serialVersionUID = 1L;
	private long idUsuario;
	private String email;
	private String nombre;
	private String apellido;	
	
	public Usuario (){
		email = "";
		nombre = "";
		apellido = "";
	}
	
	public Usuario (String email, String nombre, String apellido){
		this.email = email;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Usuario(String email, String nombre, String apellido, long idUsuario) {
		this.email = email;
		this.nombre = nombre;
		this.apellido = apellido;
		this.idUsuario = idUsuario;
	}

	/**
	 * @return 
	 */
	public long getIdUsuario() {
		return idUsuario;
	}

	/**
	 * @param 
	 */
	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	/**
	 * @return 
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param 
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return 
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * @param nombre 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return 
	 */
	public String getApellido() {
		return apellido;
	}
	
	/**
	 * @param 
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
}
