package proyecto;

import comunicacion.Protocolo;

/**
 * @author a.lovera822
 * @version 1.0
 * @created 23-oct-2014 12:35:07 p.m.
 */
public class Administrador {

	/**
	 * Contiene los comandos para manejar el protocolo de comunicación con el servidor.
	 */
	private Protocolo p;
	
	private String identificador;

	public Administrador(String identificador){
		this.identificador = identificador;
	}
	
	public String getidentificador(){
		return identificador;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setidentificador(String newVal){
		identificador = newVal;
	}
}//end Administrador