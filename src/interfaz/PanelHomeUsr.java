package interfaz;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelHomeUsr extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3942966160471700292L;
	
	private InterfazTIAprende interfaz;

	/**
	 * Create the panel.
	 */
	public PanelHomeUsr(InterfazTIAprende param) {
		interfaz = param;
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblBienvenidoPorFavor = new JLabel("Bienvenido, por favor espere a los otros miembros");
		panel.add(lblBienvenidoPorFavor, BorderLayout.NORTH);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				interfaz.iniciarActividad();
			}
		});
		panel.add(btnIniciar, BorderLayout.SOUTH);
		
		JLabel lblMiembrosConectados = new JLabel("Miembros conectados");
		panel.add(lblMiembrosConectados, BorderLayout.WEST);
		
		JLabel lblDe = new JLabel("1 de 1");
		panel.add(lblDe, BorderLayout.EAST);

	}

}
