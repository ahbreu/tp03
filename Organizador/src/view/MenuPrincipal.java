package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Livros");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new MenuLivro().setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBounds(62, 48, 125, 46);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("ORGANIZADOR DE LIVROS");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 364, 26);
		contentPane.add(lblNewLabel);
		
		JList list = new JList();
		list.setBounds(10, 165, 177, 185);
		contentPane.add(list);
		
		JList list_1 = new JList();
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
				
				new MenuLeitor().setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1.setBounds(197, 95, 125, 46);
		contentPane.add(btnNewButton_1);
		
		JButton btnTemas = new JButton("Temas");
		btnTemas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new MenuTema().setVisible(true);
				dispose();
				
			}
		});
		btnTemas.setBounds(197, 48, 125, 46);
		contentPane.add(btnTemas);
		
		JButton btnMenuDosAutores = new JButton("Autores");
		btnMenuDosAutores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new MenuAutor().setVisible(true);
				dispose();
				
			}
		});
		btnMenuDosAutores.setBounds(62, 95, 125, 46);
		contentPane.add(btnMenuDosAutores);
	}

}
