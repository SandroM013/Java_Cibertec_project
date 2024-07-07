package gui;

import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import pClases.ArregloServicio;
import pClases.Empleado;
import pClases.Producto;
import pClases.Servicio;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.time.LocalDate;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.TextArea;

public class Servicios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTable tblServicios;
	private JTextField txtIDS;
	private JTextField txtCliente;
	private JTextField txtCosto;
	private JTextField txtFecha;
	private JComboBox cmbServicio;
	private JButton btnGrabar;
	private JTextField txtEncargado;
	private Servicio objServicio = new Servicio();
	ArregloServicio aServicio = new ArregloServicio();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Servicios frame = new Servicios();
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
	public Servicios() {
		setTitle("Registro de Servicios");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 768, 734);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnOpciones = new JMenu("Opciones");
		menuBar.add(mnOpciones);
		
		JMenuItem mntmGrabar = new JMenuItem("Grabar");
		mntmGrabar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Servicio sr = aServicio.buscarServicio(getID());
				
				if(sr != null) {
					sr = new Servicio(getID(), getEncargado(), getCliente(), getServicio(), getDate(), getCosto());
					aServicio.adicionar(sr);
					aServicio.grabar();
					listar();
				}
				limpiarEspacios();
			}
		});
		mnOpciones.add(mntmGrabar);
		
		JMenuItem mntmCargar = new JMenuItem("Cargar");
		mntmCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aServicio.cargar();
			}
		});
		mnOpciones.add(mntmCargar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane ScrollPane = new JScrollPane();
		ScrollPane.setBounds(35, 213, 691, 184);
		contentPane.add(ScrollPane);
		
		tblServicios = new JTable();
		tblServicios.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"ID_S", "Encargardo", "Cliente", "Servicio", "Fecha", "Costo"
			}
		));
		ScrollPane.setViewportView(tblServicios);
		
		
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				objServicio = new Servicio(getID(), getEncargado(), getCliente(), getServicio(), getDate(), getCosto());
				aServicio.adiciona(objServicio);
				listar();
				
			}
		});
		btnRegistrar.setBounds(609, 12, 105, 27);
		contentPane.add(btnRegistrar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					limpiaTabla();
					int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID que desea buscar"));
					
					int pos = aServicio.buscar(id);
					
					if(pos == -1) {
						JOptionPane.showMessageDialog(null, "El ID ingresado no existe");
					}else {
						tblServicios.setValueAt(aServicio.devolver(pos).getId_S(), 0, 0);
						tblServicios.setValueAt(aServicio.devolver(pos).getEncargado(), 0, 1);
						tblServicios.setValueAt(aServicio.devolver(pos).getCliente(), 0, 2);
						tblServicios.setValueAt(aServicio.devolver(pos).getServicio(), 0, 3);
						tblServicios.setValueAt(aServicio.devolver(pos).getFecha(), 0, 4);
						tblServicios.setValueAt(aServicio.devolver(pos).getCosto(), 0, 5);
					}
				} catch (Exception ex) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Error en la aplicación");
				}
			}
		});
		btnBuscar.setBounds(609, 51, 105, 27);
		contentPane.add(btnBuscar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese ID que desea modificar: "));
				
				int pos = aServicio.buscar(id);
				
				Servicio serv =  aServicio.devolver(pos);
				
				btnGrabar.setVisible(true);
				btnModificar.setVisible(false);
				
				txtIDS.setText(""+id);
				txtIDS.setEditable(false);
				
				txtEncargado.setText(serv.getEncargado());
				txtCliente.setText(serv.getCliente());
				txtCosto.setText(""+serv.getCosto());
				txtFecha.setText(""+serv.getFecha());
			}
		});
		btnModificar.setBounds(609, 90, 105, 27);
		contentPane.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese ID que desea eliminar: "));
					
					aServicio.eliminar(id);
					
					JOptionPane.showMessageDialog(null, "Empleado Eliminado");
					
					listar();
					
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Error al eliminar");
				}
			}
		});
		btnEliminar.setBounds(609, 129, 105, 27);
		contentPane.add(btnEliminar);
		
		JLabel lblIds = new JLabel("ID_S");
		lblIds.setBounds(35, 17, 60, 17);
		contentPane.add(lblIds);
		
		JLabel lblEncargado = new JLabel("Encargado");
		lblEncargado.setBounds(35, 56, 72, 17);
		contentPane.add(lblEncargado);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(35, 95, 60, 17);
		contentPane.add(lblCliente);
		
		JLabel lblTipoDeServicio = new JLabel("Tipo de Servicio");
		lblTipoDeServicio.setBounds(246, 17, 113, 17);
		contentPane.add(lblTipoDeServicio);
		
		JLabel lblFechaDeInicio = new JLabel("Fecha de Inicio");
		lblFechaDeInicio.setBounds(246, 56, 98, 17);
		contentPane.add(lblFechaDeInicio);
		
		JLabel lblCosto = new JLabel("Costo");
		lblCosto.setBounds(246, 95, 60, 17);
		contentPane.add(lblCosto);
		
		txtIDS = new JTextField();
		txtIDS.setBounds(114, 15, 114, 21);
		contentPane.add(txtIDS);
		txtIDS.setColumns(10);
		
		txtCliente = new JTextField();
		txtCliente.setBounds(114, 93, 114, 21);
		contentPane.add(txtCliente);
		txtCliente.setColumns(10);
		
		txtCosto = new JTextField();
		txtCosto.setBounds(355, 93, 114, 21);
		contentPane.add(txtCosto);
		txtCosto.setColumns(10);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(355, 54, 114, 21);
		contentPane.add(txtFecha);
		txtFecha.setColumns(10);
		txtFecha.setText(""+LocalDate.now());
		
		cmbServicio = new JComboBox();
		cmbServicio.setModel(new DefaultComboBoxModel(new String[] {"PCR 16S", "Extracción de ADN", "Conteo CFU"}));
		cmbServicio.setBounds(355, 12, 150, 27);
		contentPane.add(cmbServicio);
		
		txtEncargado = new JTextField();
		txtEncargado.setBounds(114, 54, 114, 21);
		contentPane.add(txtEncargado);
		txtEncargado.setColumns(10);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pos = aServicio.buscar(getID());
				
				Servicio serv = aServicio.devolver(pos);
				
				serv.setEncargado(getEncargado());
				serv.setCliente(getCliente());
				serv.setServicio(getServicio());
				serv.setFecha(getDate());
				serv.setCosto(getCosto());
				
				JOptionPane.showMessageDialog(null, "Empleado actualizado Correctamente", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
				txtIDS.setEditable(true);
				listar();
				
				btnGrabar.setVisible(false);
				btnModificar.setVisible(true);
				
			}
		});
		btnGrabar.setBounds(609, 90, 105, 27);
		contentPane.add(btnGrabar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listar();
			}
		});
		btnListar.setBounds(609, 168, 105, 27);
		contentPane.add(btnListar);
		
		TextArea txtA = new TextArea();
		txtA.setBounds(35, 425, 563, 217);
		contentPane.add(txtA);
		
		JButton btnResultados = new JButton("Resultados");
		btnResultados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtA.setText("El pago recibido total es de: "+aServicio.VentaTotal()+ "soles"+"\n");
				txtA.append("\n");
				txtA.append("El total de servicio para PCR 16S son: "+aServicio.count16S()+"\n");
				txtA.append("\n");
				txtA.append("El total de Extracciones de ADN son: "+aServicio.countExtraccion()+"\n");
				txtA.append("\n");
				txtA.append("El total de Conteos de Colonias son: "+aServicio.countCFU()+"\n");
			}
		});
		btnResultados.setBounds(609, 425, 105, 27);
		contentPane.add(btnResultados);
	}
	
	int getID() {
		return Integer.parseInt(txtIDS.getText());
	}
	
	String getCliente() {
		return txtCliente.getText();
	}
	
	String getServicio() {
		return cmbServicio.getSelectedItem().toString();
	}
	
	String getEncargado() {
		return txtEncargado.getText();
	}
	
	double getCosto() {
		return Double.parseDouble(txtCosto.getText());
	}
	
	LocalDate getDate() {
		return LocalDate.parse(txtFecha.getText());
	}
	
	void limpiaTabla() {
		for(int i=0;i<100;i++) {
			tblServicios.setValueAt("", i, 0);
			tblServicios.setValueAt("", i, 1);
			tblServicios.setValueAt("", i, 2);
			tblServicios.setValueAt("", i, 3);
			tblServicios.setValueAt("", i, 4);
			tblServicios.setValueAt("", i, 5);		
		}
	}
	
	void listar() {
		limpiaTabla();
		for(int i = 0;i<aServicio.getLength();i++) {
			tblServicios.setValueAt(aServicio.devolver(i).getId_S(), i, 0);
			tblServicios.setValueAt(aServicio.devolver(i).getEncargado(), i, 1);
			tblServicios.setValueAt(aServicio.devolver(i).getCliente(), i, 2);
			tblServicios.setValueAt(aServicio.devolver(i).getServicio(), i, 3);
			tblServicios.setValueAt(aServicio.devolver(i).getFecha(), i, 4);
			tblServicios.setValueAt(aServicio.devolver(i).getCosto(), i, 5);
		}
	}
	private void limpiarEspacios() {
		txtIDS.setText("");
		txtEncargado.setText("");
		txtCliente.setText("");
		txtFecha.setText("");
		cmbServicio.setSelectedItem("");
		txtCosto.setText("");
	}
	
}
