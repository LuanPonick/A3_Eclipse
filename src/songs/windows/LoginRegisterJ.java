package songs.windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import javax.swing.JLabel;
import java.awt.TextField;
import javax.swing.JPasswordField;
import java.awt.Button;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.FlowLayout;

public class LoginRegisterJ extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginRegisterJ frame = new LoginRegisterJ();
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
	public LoginRegisterJ() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 764, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel TtiloArea = new JPanel();
		TtiloArea.setBounds(187, 11, 347, 45);
		contentPane.add(TtiloArea);
		TtiloArea.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Ache a sua ong do coração");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		TtiloArea.add(lblNewLabel_1, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(24, 93, 253, 209);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel LoginArea = new JPanel();
		LoginArea.setBounds(10, 67, 237, 131);
		panel.add(LoginArea);
		LoginArea.setLayout(null);
		
		Label label = new Label("Email");
		label.setBounds(10, 5, 38, 22);
		LoginArea.add(label);
		
		TextField textField = new TextField();
		textField.setColumns(20);
		textField.setBounds(60, 5, 166, 22);
		LoginArea.add(textField);
		
		Label label_1 = new Label("Senha");
		label_1.setBounds(10, 32, 45, 22);
		LoginArea.add(label_1);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(20);
		passwordField.setBounds(60, 33, 166, 20);
		LoginArea.add(passwordField);
		
		Button Login = new Button("Login");
		Login.setFont(new Font("Dialog", Font.PLAIN, 16));
		Login.setActionCommand("Login");
		Login.setBounds(73, 90, 97, 31);
		LoginArea.add(Login);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(10, 29, 237, 25);
		panel.add(panel_2_1);
		panel_2_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2_1.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(468, 93, 253, 209);
		contentPane.add(panel_1);
		
		Label label_4_1 = new Label("Cadastrar");
		label_4_1.setBounds(10, 20, 237, 25);
		panel_1.add(label_4_1);
		label_4_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_4_1.setAlignment(Label.CENTER);
		
		JPanel CadastroArea = new JPanel();
		CadastroArea.setBounds(10, 67, 237, 131);
		panel_1.add(CadastroArea);
		CadastroArea.setLayout(null);
		
		Label label_5 = new Label("Email");
		label_5.setBounds(10, 5, 38, 22);
		CadastroArea.add(label_5);
		
		JLabel label_2_1 = new JLabel("");
		label_2_1.setBounds(65, 16, 0, 0);
		CadastroArea.add(label_2_1);
		
		TextField textField_1 = new TextField();
		textField_1.setColumns(20);
		textField_1.setBounds(60, 5, 166, 22);
		CadastroArea.add(textField_1);
		
		Label label_1_1 = new Label("Senha");
		label_1_1.setBounds(10, 32, 45, 22);
		CadastroArea.add(label_1_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setColumns(20);
		passwordField_1.setBounds(60, 33, 166, 20);
		CadastroArea.add(passwordField_1);
		
		Button Login_1 = new Button("Cadastrar-se");
		Login_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		Login_1.setActionCommand("Login");
		Login_1.setBounds(65, 89, 106, 31);
		CadastroArea.add(Login_1);
		
		JLabel label_3_1 = new JLabel("");
		label_3_1.setBounds(156, 70, 0, 0);
		CadastroArea.add(label_3_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setColumns(20);
		passwordField_2.setBounds(60, 63, 166, 20);
		CadastroArea.add(passwordField_2);
		
		Label label_1_1_1 = new Label("Senha");
		label_1_1_1.setBounds(10, 62, 45, 22);
		CadastroArea.add(label_1_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 20, 237, 25);
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
	}
}
