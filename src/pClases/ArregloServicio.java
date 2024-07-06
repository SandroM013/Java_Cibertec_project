package pClases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class ArregloServicio {
	
	private Servicio aServ[];
	private int index;
	
	
	public ArregloServicio() {
		aServ = new Servicio[100];
		index = 0;
	}
	
	public void adiciona(Servicio objServicio) {
		aServ[index] = objServicio;
		index++;
	}
	
	public Servicio devolver(int pos) {
		return aServ[pos];
	}
	
	public int getLength() {
		return index;
	}
	
	public int buscar (int id) {
		for(int i = 0; i<getLength();i++) {
			if(id == aServ[i].getId_S()) {
				return i;
			}
			
		}
		return -1;
	}
	
	public void eliminar (int id) {
		int suj = buscar(id);
		for (int i =suj; i<getLength();i++) {
			aServ[i]=aServ[i+1];
		}
		index--;
	}
	
	public void grabar() {
		try {
			PrintWriter pw = new PrintWriter(new FileWriter("Servicios.txt"));
			
			for (int i = 0; i < getLength();i++) {
				pw.println(devolver(i).getId_S()+","+devolver(i).getEncargado()+","+devolver(i).getCliente()+","+devolver(i).getServicio()
						+","+devolver(i).getFecha()+","+devolver(i).getCosto());
			}
			pw.close();
			JOptionPane.showMessageDialog(null, "Guardado exitoso");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Guardado exitoso", "Aviso", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void adicionar(Servicio objServ) {
		aServ[index] = objServ;
	}
	
	public Servicio buscarServicio(int id) {
		for(int i = 0; i<getLength();i++) {
			if(id == aServ[i].getId_S()) {
				return aServ[i];
			}
			
		}
		return null;
	}
	
	public void cargar() {
		try {
			File archivo = new File("Servicios.txt");
			
			if(archivo.exists()) {
				BufferedReader br = new BufferedReader(new FileReader("Servicios.txt"));
				String linea;
				while((linea=br.readLine()) != null) {
					StringTokenizer st = new StringTokenizer(linea,",");
					int ID = Integer.parseInt(st.nextToken().trim());
					String Encargado = st.nextToken().trim();
					String Cliente = st.nextToken().trim();
					String Servicio = st.nextToken().trim();
					LocalDate Fecha = LocalDate.parse(st.nextToken().trim());
					double Costo = Double.parseDouble(st.nextToken().trim());
					
					Servicio servNew = new Servicio(ID, Encargado, Cliente, Servicio, Fecha, Costo);
					adiciona(servNew);
				}
				br.close();
			}else {
				JOptionPane.showMessageDialog(null, "El archivo no existe");
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Se produjo un error"+e);
		}
}
	
	
	public double VentaTotal() {
		double VentaT = 0;
		for(int i=0; i < getLength();i++) {
			VentaT += aServ[i].getCosto();
		}
		return VentaT;
	}
	
	public String countCFU() {
		int count = 0;
		double Costo = 0;
		for(int i=0; i < getLength();i++) {
			String Servicio = aServ[i].getServicio();
			double CostoInvs = aServ[i].getCosto();
			if (Servicio.equals("Conteo CFU")) {
				count++;
				Costo += CostoInvs;
			}
		}
		return ""+count +"\n"
		+"El pago total por los conteos de colonias (CFU) es: "+Costo +" soles";
	}
	
	public String count16S() {
		int count = 0;
		double Costo = 0;
		for(int i=0; i < getLength();i++) {
			String Servicio = aServ[i].getServicio();
			double CostoInvs = aServ[i].getCosto();
			if (Servicio.equals("PCR 16S")) {
				count++;
				Costo += CostoInvs;
			}
		}
		return ""+count +"\n"
		+"El pago total por las PCR 16S es: "+Costo +" soles";
	}
	
	public String countExtraccion() {
		int count = 0;
		double Costo = 0;
		for(int i=0; i < getLength();i++) {
			String Servicio = aServ[i].getServicio();
			double CostoInvs = aServ[i].getCosto();
			if (Servicio.equals("Extracción de ADN")) {
				count++;
				Costo += CostoInvs;
			}
		}
		return ""+count +"\n"
		+"El pago total por las Extracciones de ADN es: "+Costo +" soles";
	}
	}
