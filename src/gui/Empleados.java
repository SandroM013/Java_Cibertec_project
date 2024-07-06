package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import pClases.ArregloEmpleado;
import pClases.Empleado;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.TextArea;

public class Empleados extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tblEmpleados;
	private JTextField txtIDE;
	private JTextField txtApellidos;
	private JTextField txtNombres;
	private JTextField txtSueldo;
	private JButton btnGrabar;
	private JTextField txtContrato;
	private JComboBox cmbCargo;
	private TextArea txtR;
	private Empleado objEmp;
	ArregloEmpleado aEmpleados = new ArregloEmpleado();
	/**
	 * Launch the application.
	 */
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empleados frame = new Empleados();
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
	public Empleados() {
		setTitle("Registro de Empleados");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 768, 734);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnOpciones = new JMenu("Opciones");
		menuBar.add(mnOpciones);
		
		JMenuItem mntmGrabarl = new JMenuItem("GrabarL");
		mntmGrabarl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Empleado ep = aEmpleados.buscarEmp(getID());
				
				if(ep != null) {
					ep = new Empleado(getID(), getApelldios(), getNombres(), getCargo(), getContrato(), getSueldo() );
					aEmpleados.adicionar(ep);
					aEmpleados.grabar();
					listar();
				}
				limpiarEspacios();
			}
		});
		mnOpciones.add(mntmGrabarl);
		
		JMenuItem mntmCargar = new JMenuItem("Cargar");
		mntmCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aEmpleados.cargar();
			}
		});
		mnOpciones.add(mntmCargar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 213, 691, 184);
		contentPane.add(scrollPane);
		
		tblEmpleados = new JTable();
		tblEmpleados.setModel(new DefaultTableModel(
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
				"ID_E", "Apellidos", "Nombres", "Cargo", "Contrato", "Sueldo"
			}
		));
		scrollPane.setViewportView(tblEmpleados);
		
		JLabel lblIde = new JLabel("ID_E");
		lblIde.setBounds(35, 24, 60, 17);
		contentPane.add(lblIde);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(35, 119, 60, 17);
		contentPane.add(lblApellidos);
		
		JLabel lblNombres = new JLabel("Nombres");
		lblNombres.setBounds(35, 68, 60, 17);
		contentPane.add(lblNombres);
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setBounds(302, 29, 60, 17);
		contentPane.add(lblCargo);
		
		JLabel lblContrato = new JLabel("Contrato");
		lblContrato.setBounds(302, 70, 60, 17);
		contentPane.add(lblContrato);
		
		JLabel lblSueldo = new JLabel("Sueldo");
		lblSueldo.setBounds(302, 117, 60, 17);
		contentPane.add(lblSueldo);
		
		txtIDE = new JTextField();
		txtIDE.setBounds(108, 22, 114, 21);
		contentPane.add(txtIDE);
		txtIDE.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(108, 117, 114, 21);
		contentPane.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		txtNombres = new JTextField();
		txtNombres.setColumns(10);
		txtNombres.setBounds(108, 66, 114, 21);
		contentPane.add(txtNombres);
		
		txtSueldo = new JTextField();
		txtSueldo.setColumns(10);
		txtSueldo.setBounds(375, 117, 114, 21);
		contentPane.add(txtSueldo);
		
		txtContrato = new JTextField();
		txtContrato.setColumns(10);
		txtContrato.setBounds(375, 68, 114, 21);
		contentPane.add(txtContrato);
		
		cmbCargo = new JComboBox();
		cmbCargo.setModel(new DefaultComboBoxModel(new String[] {"", "Tesista", "Investigador", "Prácticante"}));
		cmbCargo.setBounds(375, 24, 114, 26);
		contentPane.add(cmbCargo);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				objEmp = new Empleado(getID(), getApelldios(), getNombres(), getCargo(), getContrato(), getSueldo());
				aEmpleados.adiciona(objEmp);
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
					
					int pos = aEmpleados.buscar(id);
					
					if(pos == -1) {
						JOptionPane.showMessageDialog(null, "El ID ingresado no existe");
					}else {
						tblEmpleados.setValueAt(aEmpleados.devolver(pos).getId(), 0, 0);
						tblEmpleados.setValueAt(aEmpleados.devolver(pos).getApellidos(), 0, 1);
						tblEmpleados.setValueAt(aEmpleados.devolver(pos).getNombres(), 0, 2);
						tblEmpleados.setValueAt(aEmpleados.devolver(pos).getCargo(), 0, 3);
						tblEmpleados.setValueAt(aEmpleados.devolver(pos).getContrato(), 0, 4);
						tblEmpleados.setValueAt(aEmpleados.devolver(pos).getSueldo(), 0, 5);
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
				
				int pos = aEmpleados.buscar(id);
				
				Empleado emp = aEmpleados.devolver(pos);
				
				btnGrabar.setVisible(true);
				btnModificar.setVisible(false);
				
				txtIDE.setText(""+id);
				txtIDE.setEditable(false);
				
				txtApellidos.setText(emp.getApellidos());
				txtNombres.setText(emp.getNombres());
				txtSueldo.setText(""+emp.getSueldo());
				txtContrato.setText(""+emp.getContrato());
			}
		});
		btnModificar.setBounds(609, 90, 105, 27);
		contentPane.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese ID que desea eliminar: "));
					
					aEmpleados.eliminar(id);
					
					JOptionPane.showMessageDialog(null, "Empleado Eliminado");
					
					listar();
					
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Error al eliminar");
				}
			}
		});
		btnEliminar.setBounds(609, 168, 105, 27);
		contentPane.add(btnEliminar);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pos = aEmpleados.buscar(getID());
				
				Empleado emp = aEmpleados.devolver(pos);
				
				emp.setApellidos(getApelldios());
				emp.setNombres(getNombres());
				emp.setSueldo(getSueldo());
				emp.setCargo(getCargo());
				emp.setContrato(getContrato());
				
				JOptionPane.showMessageDialog(null, "Empleado actualizado Correctamente", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
				
				listar();
				
				txtIDE.setEditable(true);
				
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
		btnListar.setBounds(609, 129, 105, 27);
		contentPane.add(btnListar);
		
		txtR = new TextArea();
		txtR.setBounds(35, 435, 572, 213);
		contentPane.add(txtR);
		
		JButton btnResultado = new JButton("Resultado");
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtR.setText("El pago total para los trabajadores es de: "+aEmpleados.SueldoTotal()+"\n");
				txtR.append("\n");
				txtR.append("El total de Tesistas son: "+aEmpleados.countTesistas()+"\n");
				txtR.append("\n");
				txtR.append("El total de Prácticantes son: "+aEmpleados.countPracticante()+"\n");
				txtR.append("\n");
				txtR.append("El total de Investigadores son: "+aEmpleados.countInvestigador()+"\n");
			}
		});
		btnResultado.setBounds(621, 445, 105, 27);
		contentPane.add(btnResultado);
		
	}
	
	int getID() {
		return Integer.parseInt(txtIDE.getText());
	}
	
	String getApelldios() {
		return txtApellidos.getText();
	}
	
	String getNombres() {
		return txtNombres.getText();
	}
	
	String getCargo() {
		return cmbCargo.getSelectedItem().toString();
	}
	
	String getContrato() {
		return txtContrato.getText();
	}
	
	double getSueldo() {
		return Double.parseDouble(txtSueldo.getText());
	}
	
	private void limpiaTabla() {
		for(int i=0;i<6;i++) {
			tblEmpleados.setValueAt("", i, 0);
			tblEmpleados.setValueAt("", i, 1);
			tblEmpleados.setValueAt("", i, 2);
			tblEmpleados.setValueAt("", i, 3);
			tblEmpleados.setValueAt("", i, 4);
			tblEmpleados.setValueAt("", i, 5);		
		}
	}
	
	private void listar() {
		limpiaTabla();
		for(int i = 0;i<aEmpleados.getLength();i++) {
			tblEmpleados.setValueAt(aEmpleados.devolver(i).getId(), i, 0);
			tblEmpleados.setValueAt(aEmpleados.devolver(i).getApellidos(), i, 1);
			tblEmpleados.setValueAt(aEmpleados.devolver(i).getNombres(), i, 2);
			tblEmpleados.setValueAt(aEmpleados.devolver(i).getCargo(), i, 3);
			tblEmpleados.setValueAt(aEmpleados.devolver(i).getContrato(), i, 4);
			tblEmpleados.setValueAt(aEmpleados.devolver(i).getSueldo(), i, 5);
		}
	}
	
	private void limpiarEspacios() {
		txtIDE.setText("");
		txtApellidos.setText("");
		txtNombres.setText("");
		txtContrato.setText("");
		txtSueldo.setText("");
		cmbCargo.setSelectedItem("");
	}
}
