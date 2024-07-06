package pClases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class ArregloEmpleado {
	private Empleado aEmp[];
	private int index;
	
	
	public ArregloEmpleado() {
		aEmp = new Empleado[100];
		index = 0;
	}
	
	public void adiciona(Empleado objEmpleado) {
		aEmp[index] = objEmpleado;
		index++;
	}
	
	public void adicionar(Empleado objEmpleado) {
		aEmp[index] = objEmpleado;
	}
	
	public Empleado devolver(int pos) {
		return aEmp[pos];
	}
	
	public int getLength() {
		return index;
	}
	
	public int buscar (int id) {
		for(int i = 0; i<getLength();i++) {
			if(id == aEmp[i].getId()) {
				return i;
			}
			
		}
		return -1;
	}
	
	public Empleado buscarEmp(int id) {
		for(int i = 0; i<getLength();i++) {
			if(id == aEmp[i].getId()) {
				return aEmp[i];
			}
			
		}
		return null;
	}
	
	public void eliminar (int id) {
		int suj = buscar(id);
		for (int i =suj; i<getLength();i++) {
			aEmp[i]=aEmp[i+1];
		}
		index--;
	}
	
	public void grabar() {
		try {
			PrintWriter pw = new PrintWriter(new FileWriter("Empleados.txt"));
			
			for (int i = 0; i < getLength();i++) {
				pw.println(devolver(i).getId()+","+devolver(i).getApellidos()+","+devolver(i).getNombres()+","+devolver(i).getCargo()
						+","+devolver(i).getContrato()+","+devolver(i).getSueldo());
			}
			pw.close();
			JOptionPane.showMessageDialog(null, "Guardado exitoso");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Guardado exitoso", "Aviso", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void cargar() {
		try {
			File archivo = new File("Empleados.txt");
			
			if(archivo.exists()) {
				BufferedReader br = new BufferedReader(new FileReader("Empleados.txt"));
				String linea;
				while((linea=br.readLine()) != null) {
					StringTokenizer st = new StringTokenizer(linea,",");
					int ID = Integer.parseInt(st.nextToken().trim());
					String Apellidos = st.nextToken().trim();
					String Nombres = st.nextToken().trim();
					String Cargo = st.nextToken().trim();
					String Cont =st.nextToken().trim();
					double Sueldo = Double.parseDouble(st.nextToken().trim());
					
					Empleado empNew = new Empleado(ID, Apellidos, Nombres, Cargo, Cont, Sueldo);
					adiciona(empNew);
				}
				br.close();
			}else {
				JOptionPane.showMessageDialog(null, "El archivo no existe");
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Se produjo un error"+e);
		}
	}
	
	
	
	public double SueldoTotal() {
		double sueldoT = 0;
		for(int i=0; i < getLength();i++) {
			sueldoT += aEmp[i].getSueldo();
		}
		return sueldoT;
	}
	
	public String countTesistas() {
		int count = 0;
		double Sueldo = 0;
		for(int i=0; i < getLength();i++) {
			String Cargo = aEmp[i].getCargo();
			double SueldoInvs = aEmp[i].getSueldo();
			if (Cargo.equals("Tesista")) {
				count++;
				Sueldo += SueldoInvs;
			}
		}
		return ""+count +"\n"
		+"El pago total para los Tesistas es: "+Sueldo +" soles";
	}
	
	public String countPracticante() {
		int count = 0;
		double Sueldo = 0;
		for(int i=0; i < getLength();i++) {
			String Cargo = aEmp[i].getCargo();
			double SueldoInvs = aEmp[i].getSueldo();
			if (Cargo.equals("Prácticante")) {
				count++;
				Sueldo += SueldoInvs;
			}
		}
		return ""+count +"\n"
		+"El pago total para los Practicantes es: "+Sueldo +" soles";
	}
	
	public String countInvestigador() {
		int count = 0;
		double Sueldo = 0;
		for(int i=0; i < getLength();i++) {
			String Cargo = aEmp[i].getCargo();
			double SueldoInvs = aEmp[i].getSueldo();
			if (Cargo.equals("Investigador")) {
				count++;
				Sueldo += SueldoInvs;
			}
		}
		return ""+count +"\n"
		+"El pago total para los Investigadores es: "+Sueldo +" soles";
	}
	
	
	
	
}
