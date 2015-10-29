package practica1.dss.estado;
/**
 * 
 * @author jcristobal
 * Clase para cambiar entre estados
 * 
 */
public class MaquinaEstados {
	
	private Estado estado;
	/**
	 * 
	 * @param nuevoEstado cambio a nuevo estado desde la maquina de estados
	 */
	public MaquinaEstados(Estado nuevoEstado){
		estado = nuevoEstado;
	}
	/**
	 * 
	 * @param nuevoEstado estado al que queremos cambiar
	 */
	public void cambiarEstado(Estado nuevoEstado){
		estado = nuevoEstado;
	}
	/**
	 * 
	 * @return Estado actual
	 */
	public Estado getEstado(){
		return estado;
	}
	/**
	 * 
	 * @param senial que recibe
	 * @return el estado al que cambia según el que está y quiere cambiar
	 */
	public boolean enviarSenial(int senial){
		
		if(estado == EstadoApagado.getInstance() ){
			if(estado.procesarSenial(this, senial)){
				cambiarEstado(EstadoEncendido.getInstance());
			}
		}
		else if(estado == EstadoEncendido.getInstance()){
			if(estado.procesarSenial(this, senial)){
				cambiarEstado(EstadoApagado.getInstance());
			}
			else
				cambiarEstado(EstadoAcelerar.getInstance());
		}
		else{
			if(estado.procesarSenial(this, senial)){
				cambiarEstado(EstadoApagado.getInstance());
			}
		}
		
		return true;
	}

}
