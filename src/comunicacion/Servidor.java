package comunicacion;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	private ServerSocket s;
	private int contador;
	
	public Servidor(){
		 
	}
	
	public void main(String[] args){
		int portNumber = Integer.parseInt(args[0]);
		contador=0;
		try{ 
	            s = new ServerSocket(portNumber);
	            Socket clientSocket = s.accept();
	            Conexion c= new Conexion(clientSocket, contador);
	            c.run();
	            contador++;
	            
	        } catch (IOException e) {
	            System.out.println("Ocurrió un problema al escuchar por el puerto "
	                + portNumber + " o al esperar por una conexión.");
	            System.out.println(e.getMessage());
	        }
	}
}
