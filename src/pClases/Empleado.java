package pClases;

public class Empleado {
	public int id;
	public String Apellidos;
	public String Nombres;
	public String Cargo;
	public String Contrato;
	public double Sueldo;
	
	public Empleado(int id, String apellidos, String nombres, String cargo, String contrato, double sueldo) {
		super();
		this.id = id;
		Apellidos = apellidos;
		Nombres = nombres;
		Cargo = cargo;
		Contrato = contrato;
		Sueldo = sueldo;
	}
	
	public Empleado() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	public String getContrato() {
		return Contrato;
	}

	public void setContrato(String contrato) {
		Contrato = contrato;
	}

	public double getSueldo() {
		return Sueldo;
	}

	public void setSueldo(double sueldo) {
		Sueldo = sueldo;
	}
	
	
	
	

}
