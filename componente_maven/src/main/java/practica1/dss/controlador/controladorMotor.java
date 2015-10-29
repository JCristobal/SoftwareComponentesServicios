package practica1.dss.controlador;
import practica1.dss.estado.Estado;
import practica1.dss.estado.EstadoApagado;
import practica1.dss.estado.EstadoEncendido;
import practica1.dss.estado.MaquinaEstados;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
/**
 * 
 * @author jcristobal
 * Clase para controlar los estados
 */

@ManagedBean(name="controladorMotor", eager = true)
@SessionScoped
public class controladorMotor{
	
	private MaquinaEstados estadoMotor;
	
	/* Instancia para evitar tener 2 estados a la vez */
	public controladorMotor(){
		estadoMotor = new MaquinaEstados(EstadoApagado.getInstance());
	}
	
	/* Métodos para actualizar los botones */
	public void actualizarBotonOnOff(ActionEvent event){
		estadoMotor.enviarSenial(Estado.SIGNAL_ON_OFF);
	}
	
	public void actualizarBotonAcelerar(ActionEvent event){
		estadoMotor.enviarSenial(Estado.SIGNAL_ACCELERATE);
	}
	
	/* Métodos para obtener datos de los botones*/
	public String getTextoTitulo(){
		return estadoMotor.getEstado().getTextoTitulo();
	}
	
	public String getColorTitulo(){
		return estadoMotor.getEstado().getColorTitulo();
	}

	public String getColorBotonAcelerar() {
		return estadoMotor.getEstado().getColorBotonAcelerar();
	}

	public String getColorBotonOnOff() {
		return estadoMotor.getEstado().getColorBotonOnOff();
	}

	public String getTextoBotonOnOff() {
		return estadoMotor.getEstado().getTextoBotonOnOff();
	}

	
}
