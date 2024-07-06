package pClases;

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
}
