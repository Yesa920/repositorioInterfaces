package Interfaz;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login_Ultimo_ejercio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Ultimo_ejercio frame = new Login_Ultimo_ejercio();
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
	public Login_Ultimo_ejercio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 566, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Nombre de la empresa");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBounds(334, 228, 208, 36);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("Nueva empresa");
		lblNewLabel_5.setIcon(new ImageIcon(Login_Ultimo_ejercio.class.getResource("/iM/logo.png")));
		lblNewLabel_5.setBounds(355, 38, 156, 215);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(26, 151, 90, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("LOGO");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setIcon(new ImageIcon(Login_Ultimo_ejercio.class.getResource("/iM/favicon.png")));
		lblNewLabel_2.setBounds(26, 35, 133, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Contraseña");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(26, 222, 108, 13);
		contentPane.add(lblNewLabel_3);
		
		String usuario= "Surviv";
		String contrasena= "skiper";
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btnNewButton = new JButton("Aceptar");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (textField.getText().equalsIgnoreCase(usuario)
								&& passwordField.getText().equalsIgnoreCase(contrasena)) {
							JOptionPane.showMessageDialog(null, "USUARIO Y PASSWORD CORRECTOS");
						} else if (!textField.getText().equalsIgnoreCase(usuario))
							JOptionPane.showMessageDialog(null, "USUARIO INCORRECTOS");
						else if (!passwordField.getText().equalsIgnoreCase(contrasena))
							JOptionPane.showMessageDialog(null, "PASSWORD INCORRECTO");
					}
				});
			}
		});
		btnNewButton.setBorderPainted(false);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(26, 286, 118, 36);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("INICIAR SESIÓN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(27, 86, 210, 13);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(26, 262, 176, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(26, 193, 176, 2);
		contentPane.add(separator_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBounds(26, 176, 176, 19);
		contentPane.add(textField);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(Login_Ultimo_ejercio.class.getResource("/iM/city.png")));
		lblNewLabel_4.setBounds(280, 10, 272, 341);
		contentPane.add(lblNewLabel_4);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(26, 245, 176, 19);
		contentPane.add(passwordField);
	}
}
