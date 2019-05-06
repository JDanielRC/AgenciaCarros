import java.io.Serializable;

public class ReporteCompra implements Serializable {
	

	private static final long serialVersionUID = -7270818489739963732L;
	Carro carroComprado;
	double costo;
	String fecha, placas;
	
	public ReporteCompra(int precio, String color, String modelo, String size, int year, String marca, String fecha, String fechaCompra, String placas) {
		this.carroComprado = new Carro(placas, precio, color, modelo, size, year, marca);
		this.costo = this.carroComprado.getPrecio();
		 this.fecha = fechaCompra;
		 this.placas = placas;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Carro getCarroComprado() {
		return carroComprado;
	}

	public String getPlacas() {
		return placas;
	}

	public void setPlacas(String placas) {
		this.placas = placas;
	}
	
	
}
