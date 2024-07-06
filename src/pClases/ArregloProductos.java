package pClases;

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
	
	
}
