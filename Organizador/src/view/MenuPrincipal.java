package view;
/*
 * Nessa interface podem ser acessados os outros menus
 * E possivel visualizar frases de livros e tambem os livros cadastrados
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;
	
	public DefaultListModel<String> model = new DefaultListModel<>();
	public DefaultListModel<String> model_1 = new DefaultListModel<>();
	public JList<String> list = new JList<>( model_1 );
	public JList<String> list_1 = new JList<>( model );
	public MenuPrincipal(CadastroLivro cadliv, MenuLeitor ml, MenuLivro mlv) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Livros");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mlv.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton.setBounds(62, 64, 125, 46);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("ORGANIZADOR DE LIVROS");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 364, 26);
		contentPane.add(lblNewLabel);
		
		list.setBounds(10, 165, 177, 185);
		contentPane.add(list);
		
		
		list_1.setBounds(197, 165, 177, 185);
		contentPane.add(list_1);
		
		JLabel lblNewLabel_1 = new JLabel("Descri\u00E7\u00F5es de livros cadastrados");
		lblNewLabel_1.setBounds(10, 152, 177, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ranking dos livros cadastrados");
		lblNewLabel_2.setBounds(197, 152, 177, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Menu do leitor");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ml.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton_1.setBounds(197, 64, 125, 46);
		contentPane.add(btnNewButton_1);
	}
}
