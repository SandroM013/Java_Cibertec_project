package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField txtpwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Gestion de Recursos BIOTECOOP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 915, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUser = new JTextField();
		txtUser.setBounds(149, 273, 114, 21);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Dialog", Font.BOLD, 16));
		lblUsuario.setBounds(12, 273, 108, 17);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setFont(new Font("Dialog", Font.BOLD, 16));
		lblContrasea.setBounds(12, 342, 132, 17);
		contentPane.add(lblContrasea);
		
		txtpwd = new JPasswordField();
		txtpwd.setBounds(149, 342, 114, 21);
		contentPane.add(txtpwd);
		
		JLabel lblBiotecoop = new JLabel("BIOTECOOP");
		lblBiotecoop.setFont(new Font("Dialog", Font.BOLD, 40));
		lblBiotecoop.setBounds(453, 12, 250, 58);
		contentPane.add(lblBiotecoop);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/home/sandro/Escritorio/Java_Scripts/GUI_Practica/proyecto_final_FA/Imagenes/file.png"));
		lblNewLabel.setBounds(-6, 12, 283, 249);
		contentPane.add(lblNewLabel);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String User = txtUser.getText();
				String PWD = txtpwd.getText();
				
				if (User.equals("admin") && PWD.equals("admin")) {
					System.out.println("Entra");
					Panel_de_Control PDC = new Panel_de_Control();
					PDC.setVisible(true);
					setVisible(false);
				}else {
					JOptionPane.showMessageDialog(null, "Contraseña o Usuario Incorrecto", "Aviso", JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		btnEntrar.setBounds(15, 383, 105, 27);
		contentPane.add(btnEntrar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(149, 383, 105, 27);
		contentPane.add(btnSalir);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/home/sandro/Escritorio/Java_Scripts/GUI_Practica/proyecto_final_FA/Imagenes/Empresa.jpg"));
		label.setBounds(-6, 0, 1335, 444);
		contentPane.add(label);
	}
}
