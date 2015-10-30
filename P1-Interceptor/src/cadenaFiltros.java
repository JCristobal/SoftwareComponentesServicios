import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
/**
 * 
 * @author jcristobal
 * Clase perteneciente al patrón arquitectónico “Interceptor”
 * Proporcionará varios filtros a la instancia de GestorFiltros
 * 
 */
public class cadenaFiltros {

	private ArrayList<Filtro> filtros;
	private Interfaz objetivo;

	public void addFiltro(Filtro filtro){
		filtros.add(filtro);
	}
	
	public void ejecutar (int peticion) throws IOException, URISyntaxException{
		for(Filtro filtro:filtros){
			System.out.println("Nueva velocidad (m/s)"+filtro.ejecutar(peticion));
		}
		objetivo.ejecutar(peticion);
	}
	
	public void setObjetivo(Interfaz objetivo){
		this.objetivo=objetivo;
	}

}