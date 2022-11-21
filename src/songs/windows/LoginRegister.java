package songs.windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.TextField;
import java.awt.Label;
import javax.swing.JPasswordField;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;

public class LoginRegister {

	private JFrame LoginRegister;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	public JFrame teste;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginRegister window = new LoginRegister();
					window.LoginRegister.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginRegister() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		LoginRegister = new JFrame();
		LoginRegister.setResizable(false);
		LoginRegister.setTitle("Sistema de busca de ongs\r\n");
		LoginRegister.setBounds(100, 100, 593, 343);
		LoginRegister.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		LoginRegister.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(160, 11, 221, 45);
		LoginRegister.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("SEJA UM DOADOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setLabelFor(panel);
		lblNewLabel.setToolTipText("");
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 113, 237, 131);
		LoginRegister.getContentPane().add(panel_1);
		
		Label label = new Label("Email");
		label.setBounds(10, 5, 38, 22);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(65, 16, 0, 0);
		
		TextField textField = new TextField();
		textField.setBounds(60, 5, 166, 22);
		textField.setColumns(20);
		
		Label label_1 = new Label("Senha");
		label_1.setBounds(10, 32, 45, 22);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(60, 33, 166, 20);
		passwordField.setColumns(20);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(156, 70, 0, 0);
		panel_1.setLayout(null);
		panel_1.add(label);
		panel_1.add(label_2);
		panel_1.add(textField);
		panel_1.add(label_1);
		panel_1.add(passwordField);
		
		Button Login = new Button("Login");
		Login.setFont(new Font("Dialog", Font.PLAIN, 16));
		Login.setActionCommand("Login");
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Login.setBounds(73, 73, 97, 31);
		panel_1.add(Login);
		panel_1.add(label_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 88, 237, 25);
		LoginRegister.getContentPane().add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		Label label_4 = new Label("Entrar");
		label_4.setAlignment(Label.CENTER);
		label_4.setFont(new Font("Dialog", Font.PLAIN, 15));
		panel_2.add(label_4);
		
		Label label_4_1 = new Label("Cadastrar");
		label_4_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_4_1.setAlignment(Label.CENTER);
		label_4_1.setBounds(330, 88, 237, 25);
		LoginRegister.getContentPane().add(label_4_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(330, 113, 237, 131);
		LoginRegister.getContentPane().add(panel_1_1);
		
		Label label_5 = new Label("Email");
		label_5.setBounds(10, 5, 38, 22);
		panel_1_1.add(label_5);
		
		JLabel label_2_1 = new JLabel("");
		label_2_1.setBounds(65, 16, 0, 0);
		panel_1_1.add(label_2_1);
		
		TextField textField_1 = new TextField();
		textField_1.setColumns(20);
		textField_1.setBounds(60, 5, 166, 22);
		panel_1_1.add(textField_1);
		
		Label label_1_1 = new Label("Senha");
		label_1_1.setBounds(10, 32, 45, 22);
		panel_1_1.add(label_1_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setColumns(20);
		passwordField_1.setBounds(60, 33, 166, 20);
		panel_1_1.add(passwordField_1);
		
		Button Login_1 = new Button("Cadastrar-se");
		Login_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		Login_1.setActionCommand("Login");
		Login_1.setBounds(79, 90, 106, 31);
		panel_1_1.add(Login_1);
		
		JLabel label_3_1 = new JLabel("");
		label_3_1.setBounds(156, 70, 0, 0);
		panel_1_1.add(label_3_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setColumns(20);
		passwordField_2.setBounds(60, 63, 166, 20);
		panel_1_1.add(passwordField_2);
		
		Label label_1_1_1 = new Label("Senha");
		label_1_1_1.setBounds(10, 62, 45, 22);
		panel_1_1.add(label_1_1_1);
	}
}
