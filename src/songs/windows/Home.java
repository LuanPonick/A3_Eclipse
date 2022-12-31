package songs.windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import songs.classes.HomeController;

public class Home {

	public JFrame frmSongs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frmSongs.setVisible(true);
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
		frmSongs = new JFrame();
		frmSongs.setResizable(false);
		frmSongs.setTitle("Songs");
		frmSongs.setBounds(100, 100, 850, 461);
		frmSongs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSongs.getContentPane().setLayout(null);
		frmSongs.setLocationRelativeTo(null);
		
		JButton ongs = new JButton("Ongs");
		ongs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmSongs.dispose();
				HomeController.TradeToOngsInformation();
				
			}
		});
		ongs.setFont(new Font("Tahoma", Font.PLAIN, 19));
		ongs.setBounds(82, 259, 236, 97);
		frmSongs.getContentPane().add(ongs);
		
		JButton doador = new JButton("Doador");
		doador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSongs.dispose();
				HomeController.TradeToLoginRegister();
			}
		});
		doador.setFont(new Font("Tahoma", Font.PLAIN, 19));
		doador.setBounds(525, 259, 236, 97);
		frmSongs.getContentPane().add(doador);
		
		JPanel panel = new JPanel();
		panel.setBounds(182, 80, 457, 90);
		frmSongs.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Você é um(a)?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(lblNewLabel, BorderLayout.CENTER);
	}
}
