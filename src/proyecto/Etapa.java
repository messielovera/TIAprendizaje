package proyecto;



/**
 * @author a.lovera822
 * @version 1.0
 * @created 23-oct-2014 12:35:20 p.m.
 */
public class Etapa {

	/**
	 * Identificador de la etapa, puede ser 1 o 2
	 */
	private int identificador;
	
	/**
	 * Una ronda tiene varias etapas de tiempo
	 */
	public Ronda[] rondas;

	public Etapa(int identificador, int numRondas){
		this.identificador = identificador;
		rondas = new Ronda[numRondas];
	}

	/**
	 * Identificador de la etapa, puede ser 1 o 2
	 */
	public int getidentificador(){
		return identificador;
	}

	/**
	 * Identificador de la etapa, puede ser 1 o 2
	 * 
	 * @param newVal
	 */
	public void setidentificador(int newVal){
		identificador = newVal;
	}
}//end Etapa