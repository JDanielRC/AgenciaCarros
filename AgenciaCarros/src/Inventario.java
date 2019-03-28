import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;


public class Inventario {
	
	private HashTable<String, Carro> inventario; //almacena la llave como string (modelo) y el valor es un objeto de tipo carro
	private int totalCarros; //almacenar número de carros en almacén, sin importar modelo
	
	public Inventario() { //constructor default, crea un inventario desde cero
		this.inventario = new HashTable<String, Carro>();
		this.totalCarros = 0;
	}
	
	public Carro vender(String llave) {  //se borra el carro y lo regresamos, entonces ya de ahi pueden obtener precios etc.
		return this.inventario.deleteQueue(llave);
	}
	
	public void adquirir(Carro carro) {  //insertamos el carro usando la llave como modelo
		this.inventario.put(carro.getModelo(), carro);
		this.totalCarros++;
	}
	
	public void almacenarDatos() { //crea archivo.dat que almacena todos los datos
		int j;
		FileOutputStream fs;
		try {
			fs = new FileOutputStream("Database.bin");
			for (int i = 0; i < this.inventario.getTabla().length; i++) {
				j = 0;
				if (inventario.getTabla()[i].size() > 0) {
					for (int l = 0; l < inventario.getTabla()[i].size(); l++) {
						Carro car = inventario.getTabla()[i].getEn(j).valor;
						j++;
						String data = car.getMarca() + "," + car.getModelo() + "," + car.getPrecio() + "," + car.getColor() + "," + car.getYear() + "," + car.getSize();
						byte[] b = data.getBytes();
						fs.write(b);
						fs.flush();
					}
				}
			}
			fs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void loadDatabase(File database) {
		BufferedReader in;
		if (database != null) {
			try {
				in = new BufferedReader(new FileReader(database));
				String linea = in.readLine();
				while(linea != null){
					linea = in.readLine();
				}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	
	
	public int getTotalCarros() {
		return totalCarros;
	}
	
	public Carro find(String modelo) {
		return this.inventario.get(modelo);
	}
	
	public double obtainPrice(String modelo) {
		return this.inventario.get(modelo).getPrecio();
	}
	
	public static void main(String [] args) {
		Inventario a = new Inventario();
		Carro a2 = new Carro(120000, "Verde", "Grand Cherokee", "Small", 1990, "Toyota");
		Carro a3 = new Carro(20000, "Rojo", "Cherokee", "Medium", 2000, "Toyota");
		Carro a4 = new Carro(120000, "Verde", "Grand Cherokee", "Big", 1990, "Toyota");
		a.adquirir(a2);
		a.adquirir(a3);
		a.adquirir(a4);
		a.almacenarDatos();
		//a.test();
	}	
}



//notas, clase de Venta, que registre datos de las ventas
//funcion que regrese un Inventario recibiendo un archivo, de manera que lea todo lo del archivo y te genere un inventario