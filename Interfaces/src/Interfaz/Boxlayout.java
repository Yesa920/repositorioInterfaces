package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;

public class Boxlayout extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Boxlayout frame = new Boxlayout();
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
	public Boxlayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JButton btnNewButton = new JButton("Uno");
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Dos");
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Tres");
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Cuatro");
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Cinco");
		contentPane.add(btnNewButton_4);
	}

}
