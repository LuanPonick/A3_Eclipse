package songs.windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import songs.classes.HomeController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home {

	public JFrame frame;

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
		frame.setBounds(100, 100, 647, 437);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton ongs = new JButton("Ongs");
		ongs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				HomeController.TradeToOngsInformation();
				
			}
		});
		ongs.setFont(new Font("Tahoma", Font.PLAIN, 19));
		ongs.setBounds(76, 207, 166, 72);
		frame.getContentPane().add(ongs);
		
		JButton doador = new JButton("Doador");
		doador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				HomeController.TradeToLoginRegister();
			}
		});
		doador.setFont(new Font("Tahoma", Font.PLAIN, 19));
		doador.setBounds(412, 207, 166, 72);
		frame.getContentPane().add(doador);
		
		JPanel panel = new JPanel();
		panel.setBounds(184, 61, 286, 90);
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Você é um(a)?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(lblNewLabel, BorderLayout.CENTER);
	}
}
