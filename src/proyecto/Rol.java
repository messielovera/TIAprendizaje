package proyecto;


/**
 * @author a.lovera822
 * @version 1.0
 * @created 23-oct-2014 12:34:55 p.m.
 */
public class Rol {

	/**
	 * //Información disponible para el rol
	 */
	private String informacion;
	/**
	 * //Nombre/título del rol a asignar a un jugador
	 */
	private String titulo;

	public Rol(String info, String tit){
		informacion = info;
		tit = titulo;
	}

	/**
	 * //Información disponible para el rol
	 */
	public String getinformación(){
		return informacion;
	}

	/**
	 * //Información disponible para el rol
	 * 
	 * @param newVal
	 */
	public void setinformación(String newVal){
		informacion = newVal;
	}

	/**
	 * //Nombre/título del rol a asignar a un jugador
	 */
	public String gettitulo(){
		return titulo;
	}

	/**
	 * //Nombre/título del rol a asignar a un jugador
	 * 
	 * @param newVal
	 */
	public void settitulo(String newVal){
		titulo = newVal;
	}
}//end Rol