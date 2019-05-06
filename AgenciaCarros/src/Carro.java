//Autores:
//Carlos Ernesto Lopez Solano A01633683
//Juan Daniel Rubio Camacho A01633924
//Nombre de la clase: Carro.java
//Fecha: 05/05/2019
//Comentarios u observaciones.
//------------------------------------------------------------------------------

import java.io.Serializable;

public class Carro implements Serializable {

	private static final long serialVersionUID = -1278727701768916994L;
	private String placa, color, modelo, size, marca;
	private int year, precio;
	
	public Carro(String placa, int precio, String color, String modelo, String size, int year, String marca) {
		this.placa = placa;
                this.precio = precio;
		this.color = color;
		this.modelo = modelo;
		this.size = size;
		this.year = year;
		this.marca = marca;
	}
        
        public String getPlaca() {
            return this.placa;
        }
        
        public void setPlaca(String placa) {
            this.placa = placa;
        }

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	
}

