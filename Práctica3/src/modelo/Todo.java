package modelo;

import javax.xml.bind.annotation.XmlRootElement;
/**
 * 
 * @author jcristobal
 * Clase con los métodos de inserción y consulta de datos
 *
 */
@XmlRootElement
public class Todo{
	
	// Campos de cada libro
	
	private String id;
	private String titulo;
	private String anio;
	private String genero;
	private String autor;
	private String sinopsis;
	//La imagen se añadirá mediante un link (métodos sin desarrollar)
	private String img;
	
	/**
	 * Constructor vacío
	 */
	public Todo(){
	}
	/**
	 * 
	 * @param id del libro
	 * @param titulo del libro
	 */
	public Todo (String id, String titulo){
		this.id = id;
		this.titulo = titulo;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAnio() {
		return anio;
	}

	public String getGenero() {
		return genero;
	}

	public String getAutor() {
		return autor;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
	
	
}