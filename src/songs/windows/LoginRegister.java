package songs.windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.TextField;
import javax.swing.JPasswordField;
import java.awt.Button;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import bancodedados.CRUDUSUARIO;
import songs.classes.LoginRegisterController;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;

public class LoginRegister extends JFrame {

	public JPanel contentPane;
	private JPasswordField PasswordL;
	private JPasswordField Senha1C;
	private JPasswordField Senha2C;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginRegister frame = new LoginRegister();
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
	public LoginRegister() {
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
		
		TextField EmailL = new TextField();
		EmailL.setColumns(20);
		EmailL.setBounds(60, 5, 166, 22);
		LoginArea.add(EmailL);
		
		Label label_1 = new Label("Senha");
		label_1.setBounds(10, 32, 45, 22);
		LoginArea.add(label_1);
		
		PasswordL = new JPasswordField();
		PasswordL.setColumns(20);
		PasswordL.setBounds(60, 33, 166, 20);
		LoginArea.add(PasswordL);
		
		Button Login = new Button("Login");
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result = LoginRegisterController.TryToLogin(EmailL.getText(),PasswordL.getText());
				if(result.equals("LOGIN"))
				{
					dispose();
					CRUDUSUARIO crudusuario = new CRUDUSUARIO();
					String nome = crudusuario.GetName(EmailL.getText(),PasswordL.getText());
					JOptionPane.showMessageDialog(Login, nome);
					
					LoginRegisterController.TradeToPrincipal(nome,EmailL.getText());
				}else
				{
					JOptionPane.showMessageDialog(null, result);
				}
			}
		});
		Login.setFont(new Font("Dialog", Font.PLAIN, 16));
		Login.setActionCommand("Login");
		Login.setBounds(73, 100, 97, 31);
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
		CadastroArea.setBounds(10, 51, 237, 147);
		panel_1.add(CadastroArea);
		CadastroArea.setLayout(null);
		
		Label label_5 = new Label("Email");
		label_5.setBounds(10, 32, 38, 22);
		CadastroArea.add(label_5);
		
		JLabel label_2_1 = new JLabel("");
		label_2_1.setBounds(65, 16, 0, 0);
		CadastroArea.add(label_2_1);
		
		TextField EmailC = new TextField();
		EmailC.setColumns(20);
		EmailC.setBounds(60, 32, 166, 22);
		CadastroArea.add(EmailC);
		
		Label label_1_1 = new Label("Senha");
		label_1_1.setBounds(10, 59, 45, 22);
		CadastroArea.add(label_1_1);
		
		Senha1C = new JPasswordField();
		Senha1C.setToolTipText("");
		Senha1C.setColumns(20);
		Senha1C.setBounds(60, 60, 166, 20);
		CadastroArea.add(Senha1C);
		
		JLabel label_3_1 = new JLabel("");
		TextField UserC = new TextField();
		UserC.setBounds(60, 4, 166, 22);
		
		Senha2C = new JPasswordField();
		Senha2C.setToolTipText("");
		Senha2C.setColumns(20);
		Senha2C.setBounds(60, 90, 166, 20);
		CadastroArea.add(Senha2C);
		Button Login_1 = new Button("Cadastrar-se");
		Login_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result =LoginRegisterController.TryToRegister(UserC.getText(),EmailC.getText(), Senha1C.getText(),Senha2C.getText());
				if(result.equals("Logar")) {
					JOptionPane.showMessageDialog(Login_1, "Login confere seja bem-vindo");
					dispose();
					LoginRegisterController.TradeToPrincipal(UserC.getText(),EmailC.getText());
				}
			}
		});
		Login_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		Login_1.setActionCommand("Login");
		Login_1.setBounds(70, 116, 106, 31);
		CadastroArea.add(Login_1);
		
		
		CadastroArea.add(UserC);
		UserC.setColumns(20);
		label_3_1.setBounds(156, 70, 0, 0);
		CadastroArea.add(label_3_1);
		
		
		
		Label label_1_1_1 = new Label("Senha");
		label_1_1_1.setBounds(10, 89, 45, 22);
		CadastroArea.add(label_1_1_1);
		
		
		
		Label label_5_1 = new Label("Usuario");
		label_5_1.setBounds(10, 4, 49, 22);
		CadastroArea.add(label_5_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 20, 237, 25);
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("<------");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				LoginRegisterController.TradeToHome();
			}
		});
		btnNewButton.setBounds(10, 349, 73, 29);
		contentPane.add(btnNewButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(287, 119, 171, 147);
		contentPane.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel teste = new JLabel("<html><center>O email tem que ser valido e a senha tem que conter no minimo <u><strong>6</strong></u> caracteres</center></html>");
		teste.setFont(new Font("Tahoma", Font.PLAIN, 20));
		teste.setHorizontalAlignment(SwingConstants.CENTER);
		teste.setAlignmentX(Component.CENTER_ALIGNMENT);
		teste.setAlignmentY(Component.TOP_ALIGNMENT);
		teste.setAutoscrolls(true);
		teste.setLabelFor(panel_3);
		panel_3.add(teste, BorderLayout.CENTER);
		
		
	}
}
