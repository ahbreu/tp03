package view;

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
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class CadastroLivro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroLivro frame = new CadastroLivro();
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
	public CadastroLivro() {
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
		
		textField = new JTextField();
		textField.setBounds(95, 53, 329, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(95, 84, 329, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(129, 115, 295, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(129, 146, 295, 20);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("Cadastrar livro");
		btnNewButton.setBounds(10, 235, 121, 23);
		contentPane.add(btnNewButton);
		
		JButton btnEditarLivro = new JButton("Editar livro");
		btnEditarLivro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEditarLivro.setBounds(141, 235, 121, 23);
		contentPane.add(btnEditarLivro);
		
		JButton btnExcluirLivro = new JButton("Excluir livro");
		btnExcluirLivro.setBounds(272, 235, 121, 23);
		contentPane.add(btnExcluirLivro);
		
		JLabel lblNewLabel_1 = new JLabel("T\u00EDtulo:");
		lblNewLabel_1.setBounds(7, 56, 88, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Autor:");
		lblNewLabel_1_1.setBounds(7, 87, 88, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Data de publica\u00E7\u00E3o:");
		lblNewLabel_1_2.setBounds(7, 118, 99, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Tema:");
		lblNewLabel_1_3.setBounds(7, 149, 88, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Lido");
		rdbtnNewRadioButton.setBounds(170, 180, 45, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNoLido = new JRadioButton("N\u00E3o lido");
		rdbtnNoLido.setBounds(300, 180, 63, 23);
		contentPane.add(rdbtnNoLido);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 284, 242, 116);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Descri\u00E7\u00E3o do livro");
		lblNewLabel_2.setBounds(10, 269, 240, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Menu principal");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new MenuPrincipal().setVisible(true);
				dispose();
				
				
			}
		});
		btnNewButton_1.setBounds(315, 377, 109, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Menu do leitor");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new MenuLeitor().setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1_1.setBounds(315, 343, 109, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Autores");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new MenuAutor().setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1_2.setBounds(315, 309, 109, 23);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Livros");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new MenuLivro().setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1_3.setBounds(315, 275, 109, 23);
		contentPane.add(btnNewButton_1_3);
	}
}
