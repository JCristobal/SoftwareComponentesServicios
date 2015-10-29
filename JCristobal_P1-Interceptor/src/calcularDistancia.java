/**
 * 
 * @author jcristobal
 * Clase perteneciente al patrón arquitectónico “Interceptor”
 * Permite calcular la distancia recorrida(equivalente) al número de vueltas del eje
 *
 */
public class calcularDistancia implements Filtro{

	public double ejecutar(int o){
		
		double revoluciones=o;
		double distancia=(revoluciones-revolAnt)*(2*RADIO*3.1416);
		return distancia;
	}
	
	
}
