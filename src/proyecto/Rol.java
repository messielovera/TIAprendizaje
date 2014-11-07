package proyecto;


/**
 * @author a.lovera822
 * @version 1.0
 * @created 23-oct-2014 12:34:55 p.m.
 */
public class Rol {

	/**
	 * //Informaci�n disponible para el rol
	 */
	private String informacion;
	/**
	 * //Nombre/t�tulo del rol a asignar a un jugador
	 */
	private String titulo;

	public Rol(String info, String tit){
		informacion = info;
		tit = titulo;
	}

	/**
	 * //Informaci�n disponible para el rol
	 */
	public String getinformacion(){
		return informacion;
	}

	/**
	 * //Informaci�n disponible para el rol
	 * 
	 * @param newVal
	 */
	public void setinformacion(String newVal){
		informacion = newVal;
	}

	/**
	 * //Nombre/t�tulo del rol a asignar a un jugador
	 */
	public String gettitulo(){
		return titulo;
	}

	/**
	 * //Nombre/t�tulo del rol a asignar a un jugador
	 * 
	 * @param newVal
	 */
	public void settitulo(String newVal){
		titulo = newVal;
	}
}//end Rol