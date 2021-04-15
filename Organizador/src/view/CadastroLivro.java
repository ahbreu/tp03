package view;
/*
 * Interface que possibilita o cadastro de novos livros
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
		
		JLabel lblNewLabel = new JLabel("CADASTRAR/EDITAR LIVROS");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 11, 335, 31);
		contentPane.add(lblNewLabel);
		
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
		
		JButton btnNewButton = new JButton("Cadastrar livro");
		btnNewButton.setBounds(10, 143, 121, 23);
		btnNewButton.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e ) {
				p.cadastrar(new Livro(tituloLivro.getText(), Integer.parseInt(dataPubliLivro.getText()), descLivro.getText(), dataCadastro));
				p.mp.model.addElement(tituloLivro.getText());
				p.mlv.model.addElement(tituloLivro.getText());
				p.ml.model.addElement(tituloLivro.getText());
				p.mp.model_1.addElement(descLivro.getText());
			}
		});
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("T\u00EDtulo:");
		lblNewLabel_1.setBounds(7, 56, 88, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Autor:");
		lblNewLabel_1_1.setBounds(7, 87, 88, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Data de publica\u00E7\u00E3o(DDMMAAA):");
		lblNewLabel_1_2.setBounds(7, 118, 243, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2 = new JLabel("Descri\u00E7\u00E3o do livro");
		lblNewLabel_2.setBounds(10, 177, 240, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Menu principal");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				p.visivel();
				setVisible(false);
				
				
			}
		});
		btnNewButton_1.setBounds(315, 329, 109, 23);
		contentPane.add(btnNewButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Lido");
		chckbxNewCheckBox.setBounds(327, 142, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
//		JButton btnNewButton_1_1 = new JButton("Menu do leitor");
//		btnNewButton_1_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//				new MenuLeitor().setVisible(true);
//				dispose();
//				
//			}
//		});
//		btnNewButton_1_1.setBounds(315, 343, 109, 23);
//		contentPane.add(btnNewButton_1_1);
//		
//		JButton btnNewButton_1_2 = new JButton("Autores");
//		btnNewButton_1_2.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//				new MenuAutor().setVisible(true);
//				dispose();
//				
//			}
//		});
//		btnNewButton_1_2.setBounds(315, 309, 109, 23);
//		contentPane.add(btnNewButton_1_2);
//		
//		JButton btnNewButton_1_3 = new JButton("Livros");
//		btnNewButton_1_3.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//				new MenuLivro().setVisible(true);
//				dispose();
//				
//			}
//		});
//		btnNewButton_1_3.setBounds(315, 275, 109, 23);
//		contentPane.add(btnNewButton_1_3);
	}
}
