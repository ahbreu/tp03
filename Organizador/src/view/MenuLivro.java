package view;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import controle.*;

public class MenuLivro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuLivro frame = new MenuLivro();
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
	public MenuLivro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Livros cadastrados");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(10, 53, 168, 14);
		contentPane.add(lblNewLabel_4);
		
		JList list = new JList();
		list.setBounds(10, 78, 414, 288);
		contentPane.add(list);
		
			
		
		JLabel lblNewLabel = new JLabel("LIVROS");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 11, 218, 31);
		contentPane.add(lblNewLabel);
		
		JButton btnAutores = new JButton("Autores");
		btnAutores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new MenuAutor().setVisible(true);
				dispose();
				
			}
		});
		btnAutores.setBounds(10, 377, 89, 23);
		contentPane.add(btnAutores);
		
		JButton btnMenuPrincipal = new JButton("Menu principal");
		btnMenuPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new MenuPrincipal().setVisible(true);
				dispose();
				
			}
		});
		btnMenuPrincipal.setBounds(303, 377, 121, 23);
		contentPane.add(btnMenuPrincipal);
		
		JButton btnTemas = new JButton("Temas");
		btnTemas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new MenuTema().setVisible(true);
				dispose();
				
			}
		});
		btnTemas.setBounds(109, 377, 89, 23);
		contentPane.add(btnTemas);
		
		JButton btnTemas_1 = new JButton("Leitor");
		btnTemas_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new MenuLeitor().setVisible(true);
				dispose();
				
			}
		});
		btnTemas_1.setBounds(208, 377, 89, 23);
		contentPane.add(btnTemas_1);
		
	}

}
