package songs.windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import songs.classes.OngsInformationController;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class OngsInformation extends JFrame {

	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OngsInformation frame = new OngsInformation();
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
	public OngsInformation() {
		setResizable(false);
		setTitle("Songs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 657, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("<----------");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				OngsInformationController.TradeToHome();
			}
		});
		btnNewButton.setBounds(10, 379, 186, 47);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 29, 621, 244);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("<html>\r\n\t<h1>Ola queriada ong :D</h1>\r\n\t<h3>Seja muito mais que bem vinda ao Sistema\r\n de ongs ou para os mais intimos SOngs  <br>\r\nnos somos um sitemas 100% gratuito com um unico intuito de faculitar o encontro<br>\r\nde ongs para possiveis doadores.<br>\r\nMas como fazer para cadastrar a sua ong? <br>\r\nE super simples apenas entre em contato com o meu\r\nemail o telefone</h3><br>\r\n<strong>luanponick.sz@gmail.com</strong><br>\r\n<strong>+55 47 9 9699-4179</strong>\r\n</html>");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
	}
}
