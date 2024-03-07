package main.java;

import java.util.Random;

public class Recibo {

	private double cantidad;
	private String nombre;

	public Recibo(double cantidad, String nombre) {
		super();
		this.cantidad = cantidad;
		this.nombre = nombre;

	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	static boolean tocaPagarRecibos() {
		
		Random rnd = new Random();
		int probabilidad = rnd.nextInt(4);

		if (probabilidad == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Recibo [Nombre=" + getNombre() + ", Cantidad=" + getCantidad() + "]";
	}

//	public boolean pagarRecibos() {
//		Random rnd = new Random();
//		int numero = rnd.nextInt(4) + 1;
//
//		if (numero == 1) {
//			return true;
//		} else {
//			return false;
//		}
//
//	}

}
