package proyecto;

import comunicacion.Protocolo;

/**
 * @author a.lovera822
 * @version 1.0
 * @created 23-oct-2014 12:34:37 p.m.
 */
public class Jugador {
	
	/**
	 * Contiene los comandos para manejar el protocolo de comunicación con el servidor.
	 */
	private Protocolo p;
	
	/**
	 * Atributo que representa el identificador del jugador. Código o Usuario
	 */
	private String identificador;
	
	/**
	 * Puntaje obtenido por el jugador durante la etapa 1
	 */
	private int puntaje1;
	
	/**
	 * Puntaje obtenido por el jugador durante la etapa 2
	 */
	private int puntaje2;
	
	/**
	 * Atributo que representa el puntaje obtenido por el jugador de manera acumulada
	 */
	private int puntajeTotal;
	
	/**
	 * Cada jugador tiene un rol
	 */
	public Rol rol;
	
	/**
	 * Cada jugador tiene un grupo al cual está asignado
	 */
	public Grupo grupo;

	public Jugador(String identificador){
		this.identificador = identificador;
	}

	
	public void asignarRol(Rol nuevo){
		rol = nuevo;
	}
	
	public void asignarGrupo(Grupo nuevo){
		grupo = nuevo;
	}
	
	
	/**
	 * //Atributo que representa el identificador del jugador. Código o Usuario
	 */
	public String getidentificador(){
		return identificador;
	}

	/**
	 * //Atributo que representa el identificador del jugador. Código o Usuario
	 * 
	 * @param newVal
	 */
	public void setidentificador(String newVal){
		identificador = newVal;
	}

	/**
	 * //Puntaje obtenido por el jugador durante la etapa 1
	 */
	public int getpuntaje1(){
		return puntaje1;
	}

	/**
	 * //Puntaje obtenido por el jugador durante la etapa 1
	 * 
	 * @param newVal
	 */
	public void setpuntaje1(int newVal){
		puntaje1 = newVal;
	}

	/**
	 * //Puntaje obtenido por el jugador durante la etapa 2
	 */
	public int getpuntaje2(){
		return puntaje2;
	}

	/**
	 * //Puntaje obtenido por el jugador durante la etapa 2
	 * 
	 * @param newVal
	 */
	public void setpuntaje2(int newVal){
		puntaje2 = newVal;
	}

	/**
	 * //Atributo que representa el puntaje obtenido por el jugador de manera acumulada
	 */
	public int getpuntajeTotal(){
		return puntajeTotal;
	}

	/**
	 * //Atributo que representa el puntaje obtenido por el jugador de manera
	 * acumulada
	 * 
	 * @param newVal
	 */
	public void setpuntajeTotal(){
		puntajeTotal = getpuntaje1()+getpuntaje2();
	}
	
}//end Jugador