/**
 * 
 * @author jcristobal
 * Clase perteneciente al patrón arquitectónico “Interceptor”
 * Los servicios se activarán automáticamente cuando se llame a enviarPeticion()
 * 
 */
public class Cliente {

	void setGestorFiltros(GestorFiltros gestor){};
	void setPeticion(double peticion){};
	void enviarPeticion(int peticion){};
	
}
