package comunicacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Conexion implements Runnable
{
	private Socket socket;
	private PrintWriter out;
	private BufferedReader in;
	
	private Protocolo p;
	private int id;
	
	public Conexion(Socket s, int n){
		socket =s;
		id=n;
		p = new Protocolo();
	}
	
	public void run() {
		// TODO Auto-generated method stub
		try {
			out = new PrintWriter(socket.getOutputStream(), true);
	        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	        String inputLine;
	        
	        while ((inputLine = in.readLine()) != null) {
	            String[] line=inputLine.split(" ");
	        	if(line[0].equals(p.CONEXION))
	            	out.print(p.ACK);
	            else if(line[0].equals(p.LOGIN)){
	            	if(validarUsuario(line[1])){
	            		out.print(p.ACEPTADO);
	            		darInfoDisponible(line[1]);
	            	}
	            }
	            else if(inputLine.equals(p.LA_DECISION)){
	            	out.print(p.ACK);
	            	//almacenar respuesta del usuario
	            	//hacer los cálculos de acuerdo con la decisión del usuario
	            	//enviar resultados
	            }
	            if (inputLine.equals(p.DESCONEXION))
	                break;
	        }
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private void darInfoDisponible(String string) {
		// identifica el rol del usuario y envía la información asignada al rol.
		
	}

	private boolean validarUsuario(String usuario) {
		// TODO Auto-generated method stub
		return true;
	}
	
	public int getId(){
		return id;
	}
}
