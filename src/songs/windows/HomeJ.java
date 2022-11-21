package songs.windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomeJ extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeJ frame = new HomeJ();
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
	public HomeJ() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 381);
		getContentPane().setLayout(null);
		
		JButton ongs = new JButton("Ongs");
		ongs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ongs.setFont(new Font("Tahoma", Font.PLAIN, 19));
		ongs.setBounds(92, 157, 166, 72);
		getContentPane().add(ongs);
		
		JButton doador = new JButton("Doador");
		doador.setFont(new Font("Tahoma", Font.PLAIN, 19));
		doador.setBounds(428, 157, 166, 72);
		getContentPane().add(doador);
		
		JPanel panel = new JPanel();
		panel.setBounds(200, 11, 286, 90);
		getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Você é um(a)?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(lblNewLabel);
	}

}
