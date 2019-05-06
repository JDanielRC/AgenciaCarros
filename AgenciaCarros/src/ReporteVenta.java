//Autores:
//Carlos Ernesto Lopez Solano A01633683
//Juan Daniel Rubio Camacho A01633924
//Nombre de la clase: ReporteVenta.java
//Fecha: 05/05/2019
//Comentarios u observaciones.
//------------------------------------------------------------------------------

import java.io.Serializable;

public class ReporteVenta implements Serializable {
	
	private static final long serialVersionUID = -3575569461442192316L;
	Carro carroVendido;
	double precio;
	String fecha, placas;
	
	public ReporteVenta(Carro carro, String fecha, String placas) {
		this.carroVendido = carro;
		this.precio = carro.getPrecio();
		this.fecha = fecha;
		this.placas = placas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Carro getCarroVendido() {
		return carroVendido;
	}
	
	public String getPlacas() {
		return placas;
	}

	public void setPlacas(String placas) {
		this.placas = placas;
	}
	
	
}
