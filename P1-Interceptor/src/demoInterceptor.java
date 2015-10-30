import java.io.IOException;
import java.net.URISyntaxException;
/**
 * 
 * @author jcristobal
 * Clase principal del patrón arquitectónico “Interceptor”
 * 
 */
public class demoInterceptor {

	public static void main(String[] args) throws IOException, URISyntaxException{
		GestorFiltros gestorFiltros = new GestorFiltros(new Interfaz());
		gestorFiltros.setFiltro(new calcularVelocidad());
		Cliente cliente = new Cliente();
		cliente.setGestorFiltros(gestorFiltros);
		cliente.enviarPeticion(500); 
			
	}
	
}

