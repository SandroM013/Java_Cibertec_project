package pClases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;
import java.time.LocalDate;
public class ArregloProductos {
	
	private Producto aProduc[];
	private int index;
	
	
	public ArregloProductos(){
		aProduc = new Producto[100];
		index = 0;
	}
	
	public void adiciona(Producto objProducto) {
		aProduc[index] = objProducto;
		index++;
	}
	
	public Producto devolver(int pos) {
		return aProduc[pos];
	}
	
	public int getLength() {
		return index;
	}
	
	public int buscar (int id) {
		for(int i = 0; i<getLength();i++) {
			if(id == aProduc[i].getId()) {
				return i;
			}
			
		}
		return -1;
	}
	
	public void eliminar (int id) {
		int suj = buscar(id);
		for (int i =suj; i<getLength();i++) {
			aProduc[i]=aProduc[i+1];
		}
		index--;
	}
	
	public void adicionar(Producto objProduct) {
		aProduc[index] = objProduct;
	}
	
	public Producto buscarProduct(int id) {
		for(int i = 0; i<getLength();i++) {
			if(id == aProduc[i].getId()) {
				return aProduc[i];
			}
			
		}
		return null;
	}
	
	public void grabar() {
		try {
			PrintWriter pw = new PrintWriter(new FileWriter("Productos.txt"));
			
			for (int i = 0; i < getLength();i++) {
				pw.println(devolver(i).getId()+","+devolver(i).getProducto()+","+devolver(i).getProveedor()+","+devolver(i).getFecha()
						+","+devolver(i).getStock()+","+devolver(i).getCosto());
			}
			pw.close();
			JOptionPane.showMessageDialog(null, "Guardado exitoso");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Guardado exitoso", "Aviso", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void cargar() {
		try {
			File archivo = new File("Productos.txt");
			
			if(archivo.exists()) {
				BufferedReader br = new BufferedReader(new FileReader("Productos.txt"));
				String linea;
				while((linea=br.readLine()) != null) {
					StringTokenizer st = new StringTokenizer(linea,",");
					int ID = Integer.parseInt(st.nextToken().trim());
					String Producto = st.nextToken().trim();
					String Proveedor = st.nextToken().trim();
					LocalDate Fecha = LocalDate.parse(st.nextToken().trim());
					int Stock = Integer.parseInt(st.nextToken().trim());
					double Costo = Double.parseDouble(st.nextToken().trim());
					
					Producto prodNew = new Producto(ID, Producto, Proveedor, Fecha, Stock, Costo);
					adiciona(prodNew);
				}
				br.close();
			}else {
				JOptionPane.showMessageDialog(null, "El archivo no existe");
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Se produjo un error"+e);
		}
	
	
	}
	
	public double CostoTotal() {
		double sueldoT = 0;
		for(int i=0; i < getLength();i++) {
			sueldoT += aProduc[i].getCosto();
		}
		return sueldoT;
	}
	
	public String countGlicerol() {
		int count = 0;
		double Costo = 0;
		for(int i=0; i < getLength();i++) {
			String Cargo = aProduc[i].getProducto();
			double CostoPT = aProduc[i].getCosto();
			if (Cargo.equals("Glicerol")) {
				count++;
				Costo += CostoPT;
			}
		}
		return ""+count +"\n"
		+"El pago total para el Glicerol es: "+Costo +" soles";
	}
	
	public String countPrimers() {
		int count = 0;
		double Costo = 0;
		for(int i=0; i < getLength();i++) {
			String Cargo = aProduc[i].getProducto();
			double CostoPT = aProduc[i].getCosto();
			if (Cargo.equals("Primers 16S")) {
				count++;
				Costo += CostoPT;
			}
		}
		return ""+count +"\n"
		+"El pago total para los Primers es: "+Costo +" soles";
	}
	
	public String countPolyTaq() {
		int count = 0;
		double Costo = 0;
		for(int i=0; i < getLength();i++) {
			String Cargo = aProduc[i].getProducto();
			double CostoPT = aProduc[i].getCosto();
			if (Cargo.equals("PolyTaq")) {
				count++;
				Costo += CostoPT;
			}
		}
		return ""+count +"\n"
		+"El pago total para las Polimerasas es: "+Costo +" soles";
	}
}
