package proyecto;


/**
 * @author a.lovera822
 * @version 1.0
 * @created 23-oct-2014 12:33:37 p.m.
 */
public class Grupo {

	/**
	 * //Identificador asociado al grupo. identificador in {0..*}
	 */
	private int identificador;
	
	/**
	 * //Puntaje adquirido por el grupo durante la primera etapa
	 */
	private int puntaje1;
	
	/**
	 * //Puntaje acumulado adquirido por el grupo durante la etapa 2
	 */
	private int puntaje2;
	
	/**
	 * //Suma puntaje1 y puntaje 2
	 */
	private int puntajeTotal;
	
	
	public Jugador[] integrantes;

	public Grupo(int identificador, Jugador jugador1, Jugador jugador2, Jugador jugador3){
		this.identificador = identificador;
		integrantes = new Jugador[3];
		integrantes[0] = jugador1;
		integrantes[1] = jugador2;
		integrantes[2] = jugador3;
	}

	/**
	 * //Identificador asociado al grupo. identificador in {0..*}
	 */
	public int getidentificador(){
		return identificador;
	}

	/**
	 * //Identificador asociado al grupo. identificador in {0..*}
	 * 
	 * @param newVal
	 */
	public void setidentificador(int newVal){
		identificador = newVal;
	}

	/**
	 * //Puntaje adquirido por el grupo durante la primera etapa
	 */
	public int getpuntaje1(){
		return puntaje1;
	}

	/**
	 * //Puntaje adquirido por el grupo durante la primera etapa
	 * 
	 * @param newVal
	 */
	public void setpuntaje1(int newVal){
		puntaje1 = newVal;
	}

	/**
	 * //Puntaje acumulado adquirido por el grupo durante la etapa 2
	 */
	public int getpuntaje2(){
		return puntaje2;
	}

	/**
	 * //Puntaje acumulado adquirido por el grupo durante la etapa 2
	 * 
	 * @param newVal
	 */
	public void setpuntaje2(int newVal){
		puntaje2 = newVal;
	}

	/**
	 * //Suma puntaje1 y puntaje 2
	 */
	public int getpuntajeTotal(){
		return puntajeTotal;
	}

	/**
	 * //Suma puntaje1 y puntaje 2
	 * 
	 * @param newVal
	 */
	public void setpuntajeTotal(int newVal){
		puntajeTotal = getpuntaje1()+getpuntaje2();
	}
}//end Grupo