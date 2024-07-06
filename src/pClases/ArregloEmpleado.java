package pClases;

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
	
	public void eliminar (int id) {
		int suj = buscar(id);
		for (int i =suj; i<getLength();i++) {
			aEmp[i]=aEmp[i+1];
		}
		index--;
	}
}
