import java.io.*;


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
		PrintStream pw;
		try {
			pw = new PrintStream("Database.dat");
			for (int i = 0; i < this.inventario.getTabla().length; i++) {
				j = 0;
				if (inventario.getTabla()[i].size() > 0) {
					for (int l = 0; l < inventario.getTabla()[i].size(); l++) {
						Carro car = inventario.getTabla()[i].getEn(j).valor;
						j++;
						String data = car.getMarca() + "," + car.getModelo() + "," + car.getPrecio() + "," + car.getColor() + "," + car.getYear() + "," + car.getSize();
						byte[] b = data.getBytes();
						StringBuilder binary = new StringBuilder();
						for (byte o : b ) {
							int val = o;
							for (int a = 0; a < 8; a++) {
								binary.append((val & 128) == 0 ? 0 : 1);
								val <<= 1;
							}
							binary.append(' ');
						}
						pw.println(binary.toString());
					}
				}
			}
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void test() {
		File inputFile = new File("Car Database.dat");
		byte[] data = new byte[(int) inputFile.length()];
		FileInputStream fis;
		try {
			fis = new FileInputStream(inputFile);
			fis.read(data, 0, data.length);
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
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