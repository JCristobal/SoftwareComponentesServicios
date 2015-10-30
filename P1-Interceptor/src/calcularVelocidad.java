/**
 * 
 * @author jcristobal
 * Clase perteneciente al patrón arquitectónico “Interceptor”
 * Permite calcular la velocidad actual
 */
public class calcularVelocidad implements Filtro{
	int revolAnt =0;
	public double ejecutar(int o){
		
		int revoluciones= o;
		
		double distancia=o;
		double velocidad=distancia*3600/(INTERVALO);
		revolAnt=revoluciones;
		return velocidad;
		
	}
}
