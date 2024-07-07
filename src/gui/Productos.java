package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

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

import pClases.ArregloProductos;
import pClases.Empleado;
import pClases.Producto;
import pClases.Servicio;

import java.time.*;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.TextArea;

public class Productos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTable tblProducto;
	private JTextField txtProducto;
	private JTextField txtIDP;
	private JTextField txtProveedor;
	private JTextField txtFecha;
	private JTextField txtStock;
	private JTextField txtCosto;
	private Producto objProduct;
	private JButton btnGrabar;
	ArregloProductos aProductos = new ArregloProductos();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Productos frame = new Productos();
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
	public Productos() {
		setTitle("Registro de Productos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 768, 734);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnOpciones = new JMenu("Opciones");
		menuBar.add(mnOpciones);
		
		JMenuItem mntmGrabar = new JMenuItem("Grabar");
		mntmGrabar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Producto pd = aProductos.buscarProduct(getID());
				
				if(pd != null) {
					pd = new Producto(getID(), getProducto(), getProveedor(), getFecha(), getStock(), getCosto());
					aProductos.adicionar(pd);
					aProductos.grabar();
					listar();
				}
				limpiarEspacios();
			}
		});
		mnOpciones.add(mntmGrabar);
		
		JMenuItem mntmCargar = new JMenuItem("Cargar");
		mntmCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aProductos.cargar();
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
		
		tblProducto = new JTable();
		scrollPane.setViewportView(tblProducto);
		tblProducto.setModel(new DefaultTableModel(
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
				"ID_P", "Producto", "Proveedor", "Fecha", "Stock", "Costo"
			}
		));
		
		
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				objProduct = new Producto(getID(), getProducto(), getProveedor(), getFecha(), getStock(), getCosto());
				aProductos.adiciona(objProduct);
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
					
					int pos = aProductos.buscar(id);
					
					if(pos == -1) {
						JOptionPane.showMessageDialog(null, "El ID ingresado no existe");
					}else {
						tblProducto.setValueAt(aProductos.devolver(pos).getId(), 0, 0);
						tblProducto.setValueAt(aProductos.devolver(pos).getProducto(), 0, 1);
						tblProducto.setValueAt(aProductos.devolver(pos).getProveedor(), 0, 2);
						tblProducto.setValueAt(aProductos.devolver(pos).getFecha(), 0, 3);
						tblProducto.setValueAt(aProductos.devolver(pos).getStock(), 0, 4);
						tblProducto.setValueAt(aProductos.devolver(pos).getCosto(), 0, 5);
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
				
				int pos = aProductos.buscar(id);
				
				Producto product =  aProductos.devolver(pos);
				
				btnGrabar.setVisible(true);
				btnModificar.setVisible(false);
				
				txtIDP.setText(""+id);
				txtIDP.setEditable(false);
				
				txtProducto.setText(product.getProducto());
				txtProveedor.setText(product.getProveedor());
				txtCosto.setText(""+product.getCosto());
				txtFecha.setText(""+product.getFecha());
				
			}
		});
		btnModificar.setBounds(609, 90, 105, 27);
		contentPane.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese ID que desea eliminar: "));
					
					aProductos.eliminar(id);
					
					JOptionPane.showMessageDialog(null, "Empleado Eliminado");
					
					listar();
					
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Error al eliminar");
				}
			}
		});
		btnEliminar.setBounds(609, 129, 105, 27);
		contentPane.add(btnEliminar);
		
		JLabel lblProducto = new JLabel("Producto");
		lblProducto.setBounds(34, 63, 60, 17);
		contentPane.add(lblProducto);
		
		txtProducto = new JTextField();
		txtProducto.setBounds(112, 61, 114, 21);
		contentPane.add(txtProducto);
		txtProducto.setColumns(10);
		
		txtIDP = new JTextField();
		txtIDP.setBounds(112, 12, 114, 21);
		contentPane.add(txtIDP);
		txtIDP.setColumns(10);
		
		JLabel lblIdp = new JLabel("ID_P");
		lblIdp.setBounds(34, 17, 60, 17);
		contentPane.add(lblIdp);
		
		JLabel lblProveedor = new JLabel("Proveedor");
		lblProveedor.setBounds(35, 111, 69, 17);
		contentPane.add(lblProveedor);
		
		txtProveedor = new JTextField();
		txtProveedor.setBounds(112, 109, 114, 21);
		contentPane.add(txtProveedor);
		txtProveedor.setColumns(10);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(356, 15, 114, 21);
		contentPane.add(txtFecha);
		txtFecha.setColumns(10);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(278, 17, 60, 17);
		contentPane.add(lblFecha);
		
		JLabel lblStock = new JLabel("Stock");
		lblStock.setBounds(278, 63, 60, 17);
		contentPane.add(lblStock);
		
		txtStock = new JTextField();
		txtStock.setBounds(356, 61, 114, 21);
		contentPane.add(txtStock);
		txtStock.setColumns(10);
		
		JLabel lblCosto = new JLabel("Costo");
		lblCosto.setBounds(278, 111, 60, 17);
		contentPane.add(lblCosto);
		
		txtCosto = new JTextField();
		txtCosto.setBounds(356, 109, 114, 21);
		contentPane.add(txtCosto);
		txtCosto.setColumns(10);
		
		
		txtFecha.setText(""+LocalDate.now());
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listar();
			}
		});
		btnListar.setBounds(609, 168, 105, 27);
		contentPane.add(btnListar);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pos = aProductos.buscar(getID());
				
				Producto product = aProductos.devolver(pos);
				
				product.setCosto(getCosto());
				product.setProducto(getProducto());
				product.setFecha(getFecha());
				product.setProveedor(getProveedor());
				product.setStock(getStock());
				
				JOptionPane.showMessageDialog(null, "Empleado actualizado Correctamente", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
				txtIDP.setEditable(true);
				listar();
				
				btnGrabar.setVisible(false);
				btnModificar.setVisible(true);
				
			}
		});
		btnGrabar.setBounds(609, 90, 105, 27);
		contentPane.add(btnGrabar);
		
		TextArea txtA = new TextArea();
		txtA.setBounds(35, 434, 563, 217);
		contentPane.add(txtA);
		
		JButton btnResultados = new JButton("Resultados");
		btnResultados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtA.setText("El pago efectuado total es de: "+aProductos.CostoTotal()+ "soles"+"\n");
				txtA.append("\n");
				txtA.append("La cantidad de Glicerol adquirido es: "+aProductos.countGlicerol()+"\n");
				txtA.append("\n");
				txtA.append("La cantidad de Polimerasa adquirido es: "+aProductos.countPolyTaq()+"\n");
				txtA.append("\n");
				txtA.append("La cantidad de Primers adquiridos es: "+aProductos.countPrimers()+"\n");
			}
		});
		btnResultados.setBounds(609, 434, 105, 27);
		contentPane.add(btnResultados);
	}
	
	int getID() {
		return Integer.parseInt(txtIDP.getText());
	}
	
	String getProducto() {
		return txtProducto.getText();
	}
	
	String getProveedor() {
		return txtProveedor.getText();
	}
	
	LocalDate getFecha() {
		return LocalDate.parse(txtFecha.getText());
	}
	
	int getStock() {
		return Integer.parseInt(txtStock.getText());
	}
	
	double getCosto() {
		return Integer.parseInt(txtCosto.getText());
	}
	
	void limpiaTabla() {
		for(int i=0;i<100;i++) {
			tblProducto.setValueAt("", i, 0);
			tblProducto.setValueAt("", i, 1);
			tblProducto.setValueAt("", i, 2);
			tblProducto.setValueAt("", i, 3);
			tblProducto.setValueAt("", i, 4);
			tblProducto.setValueAt("", i, 5);		
		}
	}
	
	void listar() {
		limpiaTabla();
		for(int i = 0;i<aProductos.getLength();i++) {
			tblProducto.setValueAt(aProductos.devolver(i).getId(), i, 0);
			tblProducto.setValueAt(aProductos.devolver(i).getProducto(), i, 1);
			tblProducto.setValueAt(aProductos.devolver(i).getProveedor(), i, 2);
			tblProducto.setValueAt(aProductos.devolver(i).getFecha(), i, 3);
			tblProducto.setValueAt(aProductos.devolver(i).getStock(), i, 4);
			tblProducto.setValueAt(aProductos.devolver(i).getCosto(), i, 5);
		}
	}
	
	private void limpiarEspacios() {
		txtIDP.setText("");
		txtProducto.setText("");
		txtProveedor.setText("");
		txtFecha.setText("");
		txtStock.setText("");
		txtCosto.setText("");
	}
}
