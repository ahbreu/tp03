package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuLeitor frame = new MenuLeitor();
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
	public MenuLeitor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MENU DO LEITOR");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 11, 218, 31);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Autores");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new MenuAutor().setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBounds(10, 377, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Temas");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new MenuTema().setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1.setBounds(109, 377, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Menu principal");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new MenuPrincipal().setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_3.setBounds(307, 377, 117, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Editar dados");
		btnNewButton_4.setBounds(319, 85, 105, 31);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_4 = new JLabel("Livros cadastrados");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(10, 190, 168, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_4_1 = new JButton("Cadastrar livro novo");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new CadastroLivro().setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_4_1.setBounds(95, 150, 188, 23);
		contentPane.add(btnNewButton_4_1);
		
		JList list = new JList();
		list.setBounds(10, 215, 414, 151);
		contentPane.add(list);
		
		Choice choice = new Choice();
		choice.setFont(new Font("Arial", Font.PLAIN, 12));
		choice.setBounds(242, 192, 182, 20);
		contentPane.add(choice);
		
		JButton btnNewButton_1_1 = new JButton("Livros");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new MenuLivro().setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1_1.setBounds(208, 377, 89, 23);
		contentPane.add(btnNewButton_1_1);
		
		textField = new JTextField();
		textField.setBounds(73, 53, 239, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(73, 85, 239, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(73, 119, 239, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setBounds(10, 53, 77, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("E-mail:");
		lblNewLabel_1_1.setBounds(10, 85, 77, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Apelido:");
		lblNewLabel_1_2.setBounds(10, 119, 77, 20);
		contentPane.add(lblNewLabel_1_2);
	}
}
