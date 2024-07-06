package pClases;

import java.time.LocalDate;
import java.util.Date;

public class Servicio{
	
	int id_S;
	String encargado;
	String cliente;
	String servicio;
	LocalDate fecha;
	double costo;
	
	
	
	public Servicio(int id_S, String encargado, String cliente, String servicio, LocalDate localDate, double costo) {
		super();
		this.id_S = id_S;
		this.encargado = encargado;
		this.cliente = cliente;
		this.servicio = servicio;
		this.fecha = localDate;
		this.costo = costo;
	}
	
	
	
	
	public Servicio() {
		super();
	}




	public int getId_S() {
		return id_S;
	}
	public void setId_S(int id_S) {
		this.id_S = id_S;
	}
	public String getEncargado() {
		return encargado;
	}
	public void setEncargado(String encargado) {
		this.encargado = encargado;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getServicio() {
		return servicio;
	}
	public void setServicio(String servicio) {
		this.servicio = servicio;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	
	
	}
	
	
