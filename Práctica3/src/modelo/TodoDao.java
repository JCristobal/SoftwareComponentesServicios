package modelo;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author jcristobal
 *
 */
public enum TodoDao {
	
	INSTANCE;
	private Map<String, Todo> proveedorContenidos = new HashMap<String, Todo>();
	
	private TodoDao() {
		Todo todo = new Todo("1", "Un yanqui en la corte del rey Arturo");
		todo.setAnio("1889");
		todo.setGenero("Novela");
		todo.setAutor("Mark Twain");
		todo.setSinopsis("Tras intervernir en una pelea y sufrir un golpe en la cabeza, el protagonista, Hank Morgan, es transportado hacia atrás en el tiempo llevando consigo todo el conocimiento tecnológico del siglo XIX y su ideología republicana y protestante al siglo VI en la corte del leyendas artúricas.");
		proveedorContenidos.put("1", todo);
	}
	
	public Map<String, Todo> getModelo(){
		return proveedorContenidos; 
	}
}
