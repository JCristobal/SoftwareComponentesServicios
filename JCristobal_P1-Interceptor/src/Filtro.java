/**
 * 
 * @author jcristobal
 * Interfaz perteneciente al patrón arquitectónico “Interceptor”
 */
public interface Filtro {
	
	double RADIO=0;
	int revolAnt=0;
	double INTERVALO=0;
	
	public double ejecutar(int o);
	
}
