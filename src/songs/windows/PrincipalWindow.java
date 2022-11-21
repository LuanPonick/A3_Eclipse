package songs.windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollBar;
import java.awt.GridBagLayout;
import javax.swing.JList;
import javax.swing.JTable;

public class PrincipalWindow {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalWindow window = new PrincipalWindow();
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
	public PrincipalWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 687, 365);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 651, 31);
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("O melhor buscador de ongs de todos os tempos");
		lblNewJgoodiesLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewJgoodiesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewJgoodiesLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(486, 53, 160, 266);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(3, 1, 1, 30));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Name.user");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel);
		
		JPanel panel_2_1 = new JPanel();
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNameemail = new JLabel("Name.email");
		lblNameemail.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2_1.add(lblNameemail, BorderLayout.CENTER);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setToolTipText("");
		panel_1.add(panel_2_2);
		panel_2_2.setLayout(null);
		
		JButton btnNewButton = new JButton("Lougout");
		btnNewButton.setBounds(10, 11, 141, 37);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel_2_2.add(btnNewButton);
		
		table = new JTable();
		table.setBounds(83, 53, 261, 201);
		frame.getContentPane().add(table);
	}
}
