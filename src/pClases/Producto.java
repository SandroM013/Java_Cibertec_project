package pClases;

import java.time.LocalDate;

public class Producto {
	
	public int id;
	public String Producto;
	public String Proveedor;
	public LocalDate Fecha;
	public int Stock;
	public double Costo;
	
	
	public Producto(int id, String producto, String proveedor, LocalDate fecha, int stock, double costo) {
		super();
		this.id = id;
		Producto = producto;
		Proveedor = proveedor;
		Fecha = fecha;
		Stock = stock;
		Costo = costo;
	}
	public Producto() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProducto() {
		return Producto;
	}
	public void setProducto(String producto) {
		Producto = producto;
	}
	public String getProveedor() {
		return Proveedor;
	}
	public void setProveedor(String proveedor) {
		Proveedor = proveedor;
	}
	public LocalDate getFecha() {
		return Fecha;
	}
	public void setFecha(LocalDate fecha) {
		Fecha = fecha;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}
	public double getCosto() {
		return Costo;
	}
	public void setCosto(double costo) {
		Costo = costo;
	}
	
	

}
