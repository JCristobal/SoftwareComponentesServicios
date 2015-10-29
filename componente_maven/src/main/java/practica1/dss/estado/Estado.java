package practica1.dss.estado;
/**
 * 
 * @author jcristobal
 * Interfaz para los distintos estados del componente
 * 
 */
public interface Estado {
	
	static final int SIGNAL_ON_OFF = 0;
	static final int SIGNAL_ACCELERATE = 1;
	
	static final String COLOR_RED = "red";
	static final String COLOR_BLUE = "blue";
	static final String COLOR_GREEN = "green";

	static final String TEXT_OFF = "Apagado";
	static final String TEXT_ON = "Encendido";
	static final String TEXT_ACCELERATING = "Acelerando";
	static final String TEXT_ACCELERATE = "Acelerar";
	static final String TEXT_ACTIVATE = "Encender";
	static final String TEXT_STOP = "Apagar";
	/**
	 * 
	 * @return string con el contenido del título
	 */
	public String getTextoTitulo();
	/**
	 * 
	 * @return string con el color del título
	 */
	public String getColorTitulo();
	/**
	 * 
	 * @return string con el texto del botón de Encender/Apagar
	 */
	public String getTextoBotonOnOff();
	/**
	 * 
	 * @return string con el color del botón de Encender/Apagar
	 */
	public String getColorBotonOnOff();
	/**
	 * 
	 * @return string con el color del botón de Acelerar
	 */
	public String getColorBotonAcelerar();
	/**
	 * 
	 * @param m
	 * @param senial
	 * @return booleano que nos indica si podemos procesar la señal actual
	 */
	public boolean procesarSenial(MaquinaEstados m, int senial);
}
