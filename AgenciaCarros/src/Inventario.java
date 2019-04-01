import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Inventario{
	
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
		ObjectOutputStream os;
		try {
			fs = new FileOutputStream("Database.bin");
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
	
	
	public void loadDatabase(File database) {
		try {
			FileInputStream fs = new FileInputStream(database);
			ObjectInputStream os = new ObjectInputStream(fs);
			ListaEnlazada<Carro> al = new ListaEnlazada<Carro>();
			while(fs.available() > 0) {
				Object objeto = os.readObject();
				Carro car = (Carro) objeto;
				al.insertarFin(car);
			}
			for (int i = 0; i < al.size(); i++) {
				System.out.println(al.getEn(i).getPrecio());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		Carro a2 = new Carro(150000, "Verde", "Grand Cherokee", "Small", 1990, "Toyota");
		Carro a3 = new Carro(20000, "Rojo", "Cherokee", "Medium", 2000, "Toyota");
		Carro a4 = new Carro(120000, "Verde", "Grand Cherokee", "Big", 1990, "Toyota");
		Carro a5 = new Carro(300000, "Negro", "Z5", "Small", 2016, "BMW");
		a.adquirir(a2);
		a.adquirir(a3);
		a.adquirir(a4);
		a.adquirir(a5);
		a.almacenarDatos();
		File database = new File("Database.bin");
		a.loadDatabase(database);
	}	
}



//notas, clase de Venta, que registre datos de las ventas
//funcion que regrese un Inventario recibiendo un archivo, de manera que lea todo lo del archivo y te genere un inventario