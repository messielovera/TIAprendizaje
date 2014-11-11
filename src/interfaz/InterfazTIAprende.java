package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Component;

import javax.swing.Box;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazTIAprende extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPanel panel_1;
	private JPanel panel;
	private JButton btnLogIn;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazTIAprende frame = new InterfazTIAprende();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfazTIAprende() {
		setTitle("TI para el Apoyo en el Aprendizaje - Autenticacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,100);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		panel = new JPanel();
		panel.setAlignmentX(0.0f);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblUsuario = new JLabel("Usuario");
		panel.add(lblUsuario);
		
		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setAlignmentX(0.5f);
		panel.add(lblPassword);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hacerLogin(textField_1.getText(), textField.getText());
			}
		});
		panel_1.add(btnLogIn);
		
	}

	public void hacerLogin(String usuario, String pass)
	{
		//Evaluar la condicion de exito de login
		if(usuario.equals("admin"))
		{
			this.setSize(800,600);
			this.setTitle("TI para el Apoyo en el Aprendizaje - Administrador");
			this.panel_1.setVisible(false);
			this.remove(panel_1);
			this.panel.setVisible(false);
			this.remove(contentPane);
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
			PanelAdmin administrador = new PanelAdmin();
			this.add(administrador);
			this.validate();
			this.repaint();
			
		}
		else if(usuario.equals("user1") || usuario.equals("user2"))
		{
			this.setTitle("TI para el Apoyo en el Aprendizaje - Menu Principal");
			this.panel_1.setVisible(false);
			this.remove(panel_1);
			this.panel.setVisible(false);
			this.remove(contentPane);
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
			PanelHomeUsr homeusr = new PanelHomeUsr(this);
			this.add(homeusr);
			this.validate();
			this.repaint();
		}
		else
		{
			  JOptionPane.showMessageDialog(this, "El nombre de usuario o password no son correctos", "Error de inicio de sesion", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void iniciarActividad()
	{
		
	}
}


