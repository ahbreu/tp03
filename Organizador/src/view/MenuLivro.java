package view;
/**
 * Por essa interface e possivel ver quais são os livros cadastrados no programa
 * @author Pedro Abreu
 * @version 1.0 (Abr 2021)
 *
 */
import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import controle.*;

public class MenuLivro extends JFrame {

	private JPanel contentPane;
	public DefaultListModel<String> model = new DefaultListModel<>();
	public MenuLivro(Principal p) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel livrosCad = new JLabel("Livros cadastrados");
		livrosCad.setFont(new Font("Arial", Font.PLAIN, 16));
		livrosCad.setBounds(10, 53, 168, 14);
		contentPane.add(livrosCad);
		
		JList<String> listaLivros = new JList<>( model );
		listaLivros.setBounds(10, 78, 414, 288);
		contentPane.add(listaLivros);
		
		JLabel menu = new JLabel("LIVROS");
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
		botaoMp.setBounds(303, 377, 121, 23);
		contentPane.add(botaoMp);		
	}

}
