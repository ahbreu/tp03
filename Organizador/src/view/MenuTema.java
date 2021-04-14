package view;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MenuTema extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuTema frame = new MenuTema();
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
	public MenuTema() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TEMAS");
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
		
		JButton btnNewButton_1 = new JButton("Livros");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new MenuLivro().setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1.setBounds(109, 377, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("Temas cadastrados");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(10, 53, 168, 14);
		contentPane.add(lblNewLabel_4);
		
		JList list = new JList();
		list.setBounds(10, 78, 414, 288);
		contentPane.add(list);
		
		Choice choice = new Choice();
		choice.setFont(new Font("Arial", Font.PLAIN, 12));
		choice.setBounds(242, 53, 182, 20);
		contentPane.add(choice);
		
		JButton btnNewButton_1_1 = new JButton("Menu principal");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new MenuPrincipal().setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1_1.setBounds(313, 377, 111, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Leitor");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new MenuLeitor().setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1_2.setBounds(208, 377, 89, 23);
		contentPane.add(btnNewButton_1_2);
		
	}


}
