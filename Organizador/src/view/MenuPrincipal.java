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
	public JList<String> listaDesc = new JList<>( model_1 );
	public JList<String> listaRanking = new JList<>( model );
	public MenuPrincipal(CadastroLivro cadliv, MenuLeitor ml, MenuLivro mlv) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botaoLivros = new JButton("Livros");
		botaoLivros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mlv.setVisible(true);
				setVisible(false);
				
			}
		});
		botaoLivros.setBounds(62, 64, 125, 46);
		contentPane.add(botaoLivros);
		
		JLabel menuNome = new JLabel("ORGANIZADOR DE LIVROS");
		menuNome.setFont(new Font("Arial Black", Font.BOLD, 20));
		menuNome.setHorizontalAlignment(SwingConstants.CENTER);
		menuNome.setBounds(10, 11, 364, 26);
		contentPane.add(menuNome);
		
		listaDesc.setBounds(10, 165, 177, 185);
		contentPane.add(listaDesc);
		
		
		listaRanking.setBounds(197, 165, 177, 185);
		contentPane.add(listaRanking);
		
		JLabel descLivrosCad = new JLabel("Descri\u00E7\u00F5es de livros cadastrados");
		descLivrosCad.setBounds(10, 152, 177, 14);
		contentPane.add(descLivrosCad);
		
		JLabel rankingLivrosCad = new JLabel("Ranking dos livros cadastrados");
		rankingLivrosCad.setBounds(197, 152, 177, 14);
		contentPane.add(rankingLivrosCad);
		
		JButton botaoMenuLeitor = new JButton("Menu do leitor");
		botaoMenuLeitor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ml.setVisible(true);
				setVisible(false);
				
			}
		});
		botaoMenuLeitor.setBounds(197, 64, 125, 46);
		contentPane.add(botaoMenuLeitor);
	}
}
