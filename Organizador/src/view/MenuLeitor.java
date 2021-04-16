package view;
/*
 * Interface que possibilita o usuario cadastrar dados pessoais para uso do programa
 * E tambem por essa classe que se acessa a classe de cadastro de livros
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.Principal;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JSpinner;
import java.awt.Font;
import java.awt.Choice;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuLeitor extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtApelido;

	/**
	 * Create the frame.
	 */
	
	public DefaultListModel<String> model = new DefaultListModel<>();
	
	public MenuLeitor(Principal p, CadastroLivro cadliv, MenuLivro mlv) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel menu = new JLabel("MENU DO LEITOR");
		menu.setFont(new Font("Arial Black", Font.BOLD, 20));
		menu.setBounds(10, 11, 218, 31);
		contentPane.add(menu);
			
		JButton botaoMp = new JButton("Menu principal");
		botaoMp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				p.visivel();
				setVisible(false);
				
			}
		});
		botaoMp.setBounds(307, 377, 117, 23);
		contentPane.add(botaoMp);
		
		
		JLabel livrosCad = new JLabel("Livros cadastrados");
		livrosCad.setFont(new Font("Arial", Font.PLAIN, 16));
		livrosCad.setBounds(10, 190, 168, 14);
		contentPane.add(livrosCad);
		
		JButton botaoCadastrar = new JButton("Cadastrar livro novo");
		botaoCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cadliv.setVisible(true);
				setVisible(false);
				
			}
		});
		botaoCadastrar.setBounds(95, 150, 188, 23);
		contentPane.add(botaoCadastrar);
		
		JList<String> listaLivros = new JList<>( model );
		listaLivros.setBounds(10, 215, 414, 151);
		contentPane.add(listaLivros);
		
		Choice filtro = new Choice();
		filtro.setFont(new Font("Arial", Font.PLAIN, 12));
		filtro.setBounds(242, 192, 182, 20);
		contentPane.add(filtro);
		
		JButton botaoLivroMenu = new JButton("Livros");
		botaoLivroMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mlv.setVisible(true);
				setVisible(false);
				
			}
		});
		botaoLivroMenu.setBounds(208, 377, 89, 23);
		contentPane.add(botaoLivroMenu);
		
		txtNome = new JTextField();
		txtNome.setBounds(73, 53, 239, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(73, 85, 239, 20);
		contentPane.add(txtEmail);
		
		txtApelido = new JTextField();
		txtApelido.setColumns(10);
		txtApelido.setBounds(73, 119, 239, 20);
		contentPane.add(txtApelido);
		
		JLabel nomeLeitor = new JLabel("Nome:");
		nomeLeitor.setBounds(10, 53, 77, 20);
		contentPane.add(nomeLeitor);
		
		JLabel emailLeitor = new JLabel("E-mail:");
		emailLeitor.setBounds(10, 85, 77, 20);
		contentPane.add(emailLeitor);
		
		JLabel apelidoLeitor = new JLabel("Apelido:");
		apelidoLeitor.setBounds(10, 119, 77, 20);
		contentPane.add(apelidoLeitor);
	}
}
