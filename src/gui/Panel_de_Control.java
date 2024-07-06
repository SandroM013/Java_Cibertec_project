package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import pClases.ArregloEmpleado;
import pClases.Empleado;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextArea;
import java.time.LocalDate;


public class Panel_de_Control extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuItem mntmEmpleados;
	private JMenuItem mntmProductos;
	private JTextArea txtArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_de_Control frame = new Panel_de_Control();
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
	public Panel_de_Control() {
		setTitle("Gestion de Recursos BIOTECOOP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 915, 792);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mntmEmpleados = new JMenuItem("Empleados");
		mntmEmpleados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Empleados FRMEmpleados = new Empleados();
				FRMEmpleados.setVisible(true);
               
            }
        });
		menuBar.add(mntmEmpleados);
		
		mntmProductos = new JMenuItem("Productos");
		mntmProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Productos FRMProducto = new Productos();
				FRMProducto.setVisible(true);
			}
		});
		menuBar.add(mntmProductos);
		
		JMenuItem mntmVentas = new JMenuItem("Ventas");
		mntmVentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Servicios FRMServicios = new Servicios();
				FRMServicios.setVisible(true);
			}
		});
		menuBar.add(mntmVentas);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/home/sandro/Escritorio/Java_Scripts/GUI_Practica/proyecto_final_FA/Imagenes/BIOTECOOP.png"));
		lblNewLabel.setBounds(391, 12, 512, 105);
		contentPane.add(lblNewLabel);
		
		JLabel lblBien = new JLabel("Bienvenido, Dr. Cueva");
		lblBien.setFont(new Font("Dialog", Font.BOLD, 30));
		lblBien.setBounds(12, 60, 346, 42);
		contentPane.add(lblBien);
		
		txtArea = new JTextArea();
		txtArea.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtArea.setBounds(411, 129, 480, 235);
		contentPane.add(txtArea);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("/home/sandro/Escritorio/Java_Scripts/GUI_Practica/proyecto_final_FA/Imagenes/Lab1.png"));
		lblNewLabel_1.setBounds(0, 114, 915, 626);
		contentPane.add(lblNewLabel_1);
		SetText("|------------------- "+fecha+" -------------------|");
		SetText("");
		SetText("Recuerde revisar el Stock de Productos");
		SetText("");
		SetText("Etiquete claramente todos los reactivos y productos\nquímicos.");
		SetText("");
		SetText("Realiza un chequeo de equipo regularmente\npara asegurar su correcto funcionamiento.");
	}
	
	LocalDate fecha = LocalDate.now();
	
	
	private void SetText(String Cad) {
		txtArea.append(Cad + "\n");
	}
	
}
