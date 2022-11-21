package songs.windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.TextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Home {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBackground(Color.CYAN);
		frame.setBounds(100, 100, 584, 304);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton Ongs = new JButton("Ongs");
		Ongs.setFont(new Font("Tahoma", Font.PLAIN, 19));
		Ongs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		Ongs.setBounds(51, 128, 166, 72);
		frame.getContentPane().add(Ongs);
		
		JButton doador = new JButton("Doador");
		doador.setFont(new Font("Tahoma", Font.PLAIN, 19));
		doador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginRegister login = new LoginRegister();
			}
		});
		doador.setBounds(350, 128, 166, 72);
		frame.getContentPane().add(doador);
		
		JPanel panel = new JPanel();
		panel.setBounds(143, 11, 268, 70);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Você é um(a)?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		panel.add(lblNewLabel);
	}
}
