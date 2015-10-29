import java.io.IOException;
import java.net.URISyntaxException;
/**
 * 
 * @author jcristobal
 * Clase perteneciente al patrón arquitectónico “Interceptor”
 * Crea la cadena de filtros y  los gestiona. Provoca que cada uno ejecute la petición del cliente y también el objetivo.
 */
public class GestorFiltros {
	
	public GestorFiltros(Interfaz i) throws IOException, URISyntaxException{
		i.ejecutar(2);
	};
	
	void gestorFiltros(Interfaz objetivo){};
	void setFiltro(Filtro f){};
	void peticionFiltro(double peticion){};
	
}


