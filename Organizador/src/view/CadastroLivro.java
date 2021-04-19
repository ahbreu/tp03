package view;
/**
 * Interface que possibilita o cadastro de novos livros
 * @author Pedro Abreu
 * @version 1.0 (Abr 2021)
 *
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JTree;
import javax.swing.JMenuBar;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

import view.*;
import controle.*;

import modelo.*;
import javax.swing.JCheckBox;
public class CadastroLivro extends JFrame {

	private JPanel contentPane;
	private JTextField tituloLivro;
	private JTextField autorLivro;
	private JTextField dataPubliLivro;
	private JTextField temaLivro;
	private JTextField descLivro;
	SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
	String dataCadastro = data.format(new Date());

	public CadastroLivro(Principal p) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel menu = new JLabel("CADASTRAR/EDITAR LIVROS");
		menu.setFont(new Font("Arial Black", Font.BOLD, 20));
		menu.setBounds(10, 11, 335, 31);
		contentPane.add(menu);
		
		tituloLivro = new JTextField();
		tituloLivro.setBounds(95, 53, 329, 20);
		contentPane.add(tituloLivro);
		tituloLivro.setColumns(10);
		
		autorLivro = new JTextField();
		autorLivro.setColumns(10);
		autorLivro.setBounds(95, 84, 329, 20);
		contentPane.add(autorLivro);
		
		dataPubliLivro = new JTextField();
		dataPubliLivro.setColumns(10);
		dataPubliLivro.setBounds(276, 115, 148, 20);
		contentPane.add(dataPubliLivro);
		
		descLivro = new JTextField();
		descLivro.setBounds(10, 202, 414, 116);
		contentPane.add(descLivro);
		descLivro.setColumns(10);
		
		JButton botaoCadastrar = new JButton("Cadastrar livro");
		botaoCadastrar.setBounds(10, 143, 121, 23);
		botaoCadastrar.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e ) {
				p.cadastrar(new Livro(tituloLivro.getText(), Integer.parseInt(dataPubliLivro.getText()), descLivro.getText(), dataCadastro));
				p.mp.model.addElement(tituloLivro.getText());
				p.mlv.model.addElement(tituloLivro.getText());
				p.ml.model.addElement(tituloLivro.getText());
				p.mp.model_1.addElement(descLivro.getText());
			}
		});
		contentPane.add(botaoCadastrar);
		
		JLabel titulo = new JLabel("T\u00EDtulo:");
		titulo.setBounds(7, 56, 88, 14);
		contentPane.add(titulo);
		
		JLabel autor = new JLabel("Autor:");
		autor.setBounds(7, 87, 88, 14);
		contentPane.add(autor);
		
		JLabel dataPubli = new JLabel("Data de publica\u00E7\u00E3o(DDMMAAA):");
		dataPubli.setBounds(7, 118, 243, 14);
		contentPane.add(dataPubli);
		
		JLabel descricao = new JLabel("Descri\u00E7\u00E3o do livro");
		descricao.setBounds(10, 177, 240, 14);
		contentPane.add(descricao);
		
		JButton botaoMp = new JButton("Menu principal");
		botaoMp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				p.visivel();
				setVisible(false);
				
				
			}
		});
		botaoMp.setBounds(315, 329, 109, 23);
		contentPane.add(botaoMp);
		
		JCheckBox checkLido = new JCheckBox("Lido");
		checkLido.setBounds(327, 142, 97, 23);
		contentPane.add(checkLido);
		
	}
}
