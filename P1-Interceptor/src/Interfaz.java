import java.io.IOException;
/**
 * Clase perteneciente al patrón arquitectónico “Interceptor”
 * Procesará la petición que se envía desde el cliente.
 */
import java.net.URISyntaxException;

public class Interfaz {
/**
 * 
 * @param peticion
 * @throws IOException
 * @throws URISyntaxException
 */
	void ejecutar(double peticion) throws IOException, URISyntaxException{
		/**
		 * Ejecutamos el "componente"
		 */
		java.awt.Desktop.getDesktop().browse(new java.net.URI("http://localhost:8080/componente_maven-0.1/faces/home.xhtml"));

	}
}
