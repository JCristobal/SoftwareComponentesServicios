package practica1.dss.estado;
/**
 * 
 * @author jcristobal
 * EstadoApagado que implementa "Estado"
 * Documentado en "Estado"
 */
public class EstadoApagado implements Estado{
	
	private static EstadoApagado instance;

	private EstadoApagado(){
	}
	
	public static EstadoApagado getInstance(){
		if(instance == null) {
	         instance = new EstadoApagado();
	      }
	      return instance;
	}
	
	/* Métodos para obtener datos de los botones*/
	public String getTextoTitulo() {
		return Estado.TEXT_OFF;
	}

	public String getColorTitulo() {
		return Estado.COLOR_RED;
	}
	
	public String getTextoBotonOnOff() {
		return Estado.TEXT_ACTIVATE;
	}

	public String getColorBotonOnOff() {
		return Estado.COLOR_GREEN;
	}

	public String getColorBotonAcelerar() {
		return Estado.COLOR_RED;
	}

	public boolean procesarSenial(MaquinaEstados m, int senial) {			
		if( senial == Estado.SIGNAL_ON_OFF)
			return true;

		return false;
	}



}
