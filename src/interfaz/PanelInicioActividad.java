package interfaz;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Label;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.Component;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

public class PanelInicioActividad extends JPanel {

	private InterfazTIAprende interfaz;
	/**
	 * Create the panel.
	 */
	public PanelInicioActividad(InterfazTIAprende param) 
	{
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblInicio = new JLabel("Inicio:");
		panel.add(lblInicio, BorderLayout.NORTH);
		
		JLabel lblRol = new JLabel("Rol:");
		panel.add(lblRol, BorderLayout.WEST);
		
		JLabel lblInserterol = new JLabel("InserteRol");
		panel.add(lblInserterol, BorderLayout.EAST);
		
		JLabel lblLeaElEnunciado = new JLabel("Lea el enunciado y marque la decision a tomar");
		panel.add(lblLeaElEnunciado, BorderLayout.SOUTH);
		
		JScrollPane panel_1 = new JScrollPane();
		add(panel_1, BorderLayout.CENTER);
		
		JTextArea txtrEstaEsUna = new JTextArea();
		txtrEstaEsUna.setLineWrap(true);
		txtrEstaEsUna.setWrapStyleWord(true);
		txtrEstaEsUna.setText("La empresa Thai Utensils vende juegos de cubiertos. El SKU corresponde a un juego de cubiertos. Los históricos de ventas muestran que la demanda del producto es estacionaria y puede aproximarse a una distribución normal ND. \n- La demanda que no se cubre en un periodo puede cubrirse en periodos subsiguientes. El inventario inicial es de 150 SKUs. El precio de venta es de $15/SKU. \n- Cualquier orden de producción toma 1 mes en producirse (si hay la capacidad) independientemente de las cantidades ordenadas. No se puede adquirir producto de fuentes externas. \n- Inicialmente hay 15 trabajadores disponibles en la fábrica. La tasa de producción de un trabajador es de 10 unidades/mes. Un trabajador en la planta nunca está inactivo y por lo tanto produce todo el tiempo. No pueden tenerse más de 20 trabajadores ni menos de 5 en ningún periodo.  En el proceso de toma de decisiones intervienen 3 personas: Una persona del Departamento Financiero, una del Departamento de Producción y otra del Departamento de Ventas.  Al Departamento Financiero se le mide por el costo de las existencias + el de faltantes; al Departamento de Producción se le mide por los costos de producción + los costos de los trabajadores (salarios + contratación + despido) + costo de faltantes; y al Departamento de Ventas se le mide por los ingresos generados (ventas – costo de faltantes) y se le penaliza por exceso de inventario.  En cada mes una de las 3 personas decide sobre la cantidad a producir. La persona de ventas empieza en el mes 1; luego la de financiero en el mes 2 y luego la de producción en el mes 3. El ciclo se repite hasta terminar los 9 meses.  La idea de cada jugador es maximizar sus ganancias o minimizar sus costos según sea el caso.  \n");
		panel_1.add(txtrEstaEsUna);
		
		JPanel panel_2 = new JPanel();
		add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblSeleccioneLaDecisin = new JLabel("Seleccione la decisión que desea tomar");
		panel_2.add(lblSeleccioneLaDecisin, BorderLayout.NORTH);
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JRadioButton rdbtnDeseoContinuarCon = new JRadioButton("Deseo continuar con la iteracion");
		panel_3.add(rdbtnDeseoContinuarCon);
		
		JRadioButton rdbtnDeseoNoContinuar = new JRadioButton("Deseo no continuar con la iteracion");
		panel_3.add(rdbtnDeseoNoContinuar);
		
		JRadioButton rdbtnEntiendoQueDebo = new JRadioButton("Entiendo que debo ingresar la decision aca");
		panel_3.add(rdbtnEntiendoQueDebo);
		
		JButton btnEnviar = new JButton("Enviar");
		panel_2.add(btnEnviar, BorderLayout.SOUTH);
		interfaz = param;

	}

}
