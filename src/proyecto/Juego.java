package proyecto;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author a.lovera822
 * @version 1.0
 * @created 23-oct-2014 12:34:27 p.m.
 */
public class Juego {

	private final String ROL_FINANCIERO = "FIN";
	private final String ROL_INVENTARIO = "INV";
	private final String ROL_PRODUCCION = "PRO";
	public ArrayList<Jugador> jugadores;
	public ArrayList<Etapa> etapas;
	public ArrayList<Grupo> grupos;
	public Administrador admin;
	public ArrayList<Rol> roles;

	public Juego(){
		jugadores = new ArrayList<Jugador>();
		etapas = new ArrayList<Etapa>();
		grupos = new ArrayList<Grupo>();
		roles = new ArrayList<Rol>();
		Rol financiero = new Rol(ROL_FINANCIERO, ""); 
		Rol inventario = new Rol(ROL_INVENTARIO, ""); 
		Rol produccion = new Rol(ROL_PRODUCCION, "");
		roles.add(financiero);
		roles.add(inventario);
		roles.add(produccion);
	}

	/**
	 * 
	 * @param jugadores
	 */
	public ArrayList<Grupo> generarGrupos(){
		//Crear Rangos o sea ArrayList jugadores
		//Seleccionar jugadores al azar
		//Crear grupo
		//Agregar grupo a lista
		return null;
	}

	/**
	 * 
	 * @param datos
	 */
	public boolean establecerValores(String[] datos){
		return false;
	}

	/**
	 * 
	 * @param titulo
	 * @param informacion
	 */
	public void agregarRoles(String titulo, String informacion){
		Rol nuevo = new Rol(titulo, informacion);
		roles.add(nuevo);
	}

	/**
	 * 
	 * @param grupos
	 */
	public void asignarRoles(ArrayList<Grupo> grupos){
		//Tomar cada jugador por grupo
		//Asignar Rol
	}

	/**
	 * 
	 * @param identificador
	 */
	public void crearJugador(String identificador){
		Jugador nuevo = new Jugador(identificador);
	}

	/**
	 * 
	 * @param jugador3
	 * @param jugador2
	 * @param jugador1
	 */
	public void crearGrupo(Jugador jugador3, Jugador jugador2, Jugador jugador1){
		Grupo nuevo = new Grupo(grupos.size(), jugador1, jugador2, jugador3);
		jugador1.asignarGrupo(nuevo);
		jugador2.asignarGrupo(nuevo);
		jugador3.asignarGrupo(nuevo);
		grupos.add(nuevo);
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		
	}
}//end Juego