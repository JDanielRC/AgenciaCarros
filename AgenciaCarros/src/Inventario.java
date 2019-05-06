//Autores:
//Carlos Ernesto Lopez Solano A01633683
//Juan Daniel Rubio Camacho A01633924
//Nombre de la clase: Inventario.java
//Fecha: 05/05/2019
//Comentarios u observaciones.
//------------------------------------------------------------------------------

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Inventario{
	

	private HashTable<String, Carro> inventario; //almacena la llave como string (modelo) y el valor es un objeto de tipo carro
	private int totalCarros; //almacenar n�mero de carros en almac�n, sin importar modelo
	
	public Inventario() { //constructor default, crea un inventario desde cero
		this.inventario = new HashTable<String, Carro>();
		this.totalCarros = 0;
	}
	
	public Carro vender(String llave) {  //se borra el carro y lo regresamos, entonces ya de ahi pueden obtener precios etc.
		return this.inventario.delete(llave);
	}
	
	public void adquirir(Carro carro) {  //insertamos el carro usando la llave como modelo
		this.inventario.put(carro.getModelo(), carro);
		this.totalCarros++;
	}
	
	public void almacenarDatos() { //crea archivo.dat que almacena todos los datos
		int j;
		FileOutputStream fs;
		ObjectOutputStream os;
		try {
			fs = new FileOutputStream("CarDatabase.bin");
			os = new ObjectOutputStream(fs);
			for (int i = 0; i < this.inventario.getTabla().length; i++) {
				j = 0;
				if (inventario.getTabla()[i].size() > 0) {
					for (int l = 0; l < inventario.getTabla()[i].size(); l++) {
						Carro car = inventario.getTabla()[i].getEn(j).valor;
						j++;
						os.writeObject(car);
					}
				}
			}
			os.close();
			fs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Carro[] listaCarros() {
		Carro[] lista = new Carro[this.totalCarros];
		int pos = 0;
		for (int i = 0; i < this.inventario.getTabla().length; i++) {
			if (this.inventario.getTabla()[i].size() > 0) {
				for (int j = 0; j < this.inventario.getTabla()[i].size(); j++) {
					Carro carro = this.inventario.getTabla()[i].getEn(j).valor;
					lista[pos] = carro;
					pos++;
				}
			}
		}
		return lista;
	}
        
        public Carro[] listaCarrosPorModelo(String modelo) {
            Carro[] lista = new Carro[this.totalCarros];;
		for (int i = 0; i < this.inventario.getTabla().length; i++) {
                    if(this.inventario.getTabla()[i].size() > 0) {
			if (this.inventario.getTabla()[i].getEn(0).getValor().getModelo().equals(modelo)) {
                                lista = new Carro[this.inventario.getTabla()[i].size()];
				for (int j = 0; j < this.inventario.getTabla()[i].size(); j++) {
					Carro carro = this.inventario.getTabla()[i].getEn(j).valor;
					lista[j] = carro;
				}
			}
                    }
		}
            System.out.println("Cantidad de autos con ese modelo encontrados: " + lista.length);
            System.out.println();
            System.out.println("-------------------------------------------------------------------------");
            return lista;
	}


	public int getTotalCarros() {
		return totalCarros;
	}
	
	public Carro find(String modelo) {
		return this.inventario.get(modelo);
	}
        
        public boolean containsModelo(String modelo) {
            return this.inventario.containsKey(modelo);
        }
        
    public boolean containsPlaca(String placas) {
    	Carro[] lista = listaCarros();
    	for (int i = 0; i < lista.length; i++) {
    		if (lista[i].getPlacas().equals(placas)) {
    			return true;
    		}
    	}
    	return false;
    }
	
	public double obtainPrice(String modelo) {
		return this.inventario.get(modelo).getPrecio();
	}
	
	public static void main(String [] args) {
		/*Inventario a = new Inventario();
		Carro a2 = new Carro(150000, "Verde", "Grand Cherokee", "Small", 1990, "Toyota");
		Carro a3 = new Carro(20000, "Rojo", "Cherokee", "Medium", 2000, "Toyota");
		Carro a4 = new Carro(120000, "Verde", "Grand Cherokee", "Big", 1990, "Toyota");
		Carro a5 = new Carro(300000, "Negro", "Z5", "Small", 2016, "BMW");
		Carro a6 = new Carro(3000000, "Negro", "Divo", "Medium", 2018, "Bugatti");
		Carro a7 = new Carro(900000, "Negro", "Divo", "Medium", 2018, "Bugatti");
		a.adquirir(a2);
		a.adquirir(a3);
		a.adquirir(a4);
		a.adquirir(a5);
		a.adquirir(a6);
		a.adquirir(a7);
		a.almacenarDatos();
		Carro[] lista = a.listaCarros();
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i].getPrecio());
		}
		*/
	}	
}



//notas, clase de Venta, que registre datos de las ventas
//funcion que regrese un Inventario recibiendo un archivo, de manera que lea todo lo del archivo y te genere un inventario