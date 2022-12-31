package songs.windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import songs.classes.PrincipalController;

import javax.swing.border.BevelBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.security.Principal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;

import com.mysql.cj.xdevapi.DbDoc;

import bancodedados.CRUDONGS;
import bancodedados.ClasseDeConexao;
import net.proteanit.sql.DbUtils;

import java.awt.Color;
import javax.swing.JScrollPane;

public class PrincipalWindowJ extends JFrame {

	private JPanel contentPane;
	private JTable tabela;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalWindowJ frame = new PrincipalWindowJ("CODE", "CODE");
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
	public PrincipalWindowJ(String nome,String email) {
		setTitle("Songs");
		
		
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 774, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(21, 11, 727, 31);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("O melhor sistema de busca de ongs de todos os tempos");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(588, 75, 160, 333);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 30, 30));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel name = new JLabel(nome);
		name.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(name);
		
		JPanel panel_2_1 = new JPanel();
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(new BorderLayout(0, 0));
		
		JLabel EMAIL = new JLabel(email);
		EMAIL.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2_1.add(EMAIL);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setToolTipText("");
		panel_1.add(panel_2_2);
		
		JButton btnNewButton = new JButton("Lougout");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PrincipalController.TradeToLoginRegister();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnNewButton.setBounds(10, 11, 141, 37);
		panel_2_2.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(73, 75, 456, 330);
		contentPane.add(scrollPane);
		
		tabela = new JTable();
		scrollPane.setViewportView(tabela);
		tabela.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		JButton btnNewButton_1 = new JButton("CARREGAR INFOS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conexao = null;
				Statement comando = null;
				ResultSet result = null;
				
				try {
					conexao = ClasseDeConexao.Conectar();
					String sql = "SELECT `nome da instituiçao`, `intuito`,`descricao`,`site de pagamento` FROM `ongs`";
					comando = conexao.createStatement();
					result = comando.executeQuery(sql);
					tabela.setModel(DbUtils.resultSetToTableModel(result));
			
				}catch(SQLException e2) {
					e2.printStackTrace();
					
				}
				finally {
					ClasseDeConexao.FexarConexao(conexao);
					try {
						comando.close();
					}
					catch(SQLException e2) {
						e2.printStackTrace();
					}
				}//AULA DO DIA 22 DE SETEMPRO 1:49:30
			}
		});
		btnNewButton_1.setBounds(231, 404, 160, 31);
		contentPane.add(btnNewButton_1);
	}
}
