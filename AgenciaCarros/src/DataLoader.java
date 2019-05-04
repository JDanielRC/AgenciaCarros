import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DataLoader {
	
	
	
	public static Inventario loadInventory(File archivo) {
		try {
			FileInputStream fs = new FileInputStream(archivo);
			ObjectInputStream os = new ObjectInputStream(fs);
			Inventario a = new Inventario();
			while(fs.available() > 0) {
				Object objeto = os.readObject();
				Carro car = (Carro) objeto;
				a.adquirir(car);;
			}
			os.close();
			return a;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("No se encontro archivo con inventario. Se creará uno vacio");
                        System.out.println();
                        System.out.println("---------------------------------------------------------");
                        DataLoader.createEmptyInventoryFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static ListaCompras loadCompras(File archivo) {
		try {
			FileInputStream fs = new FileInputStream(archivo);
			ObjectInputStream os = new ObjectInputStream(fs);
			ListaCompras lista = new ListaCompras();
			while(fs.available() > 0) {
				Object objeto = os.readObject();
				ReporteCompra reporte = (ReporteCompra) objeto;
				lista.realizarCompra(reporte);
			}
			os.close();
			return lista;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static ListaVentas loadVentas(File archivo) {
		try {
			FileInputStream fs = new FileInputStream(archivo);
			ObjectInputStream os = new ObjectInputStream(fs);
			ListaVentas lista = new ListaVentas();
			while(fs.available() > 0) {
				Object objeto = os.readObject();
				ReporteVenta reporte = (ReporteVenta) objeto;
				lista.realizarVenta(reporte);
			}
			os.close();
			return lista;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static ListaEmpleados loadEmployees(File archivo) {
		try {
			FileInputStream fs = new FileInputStream(archivo);
			ObjectInputStream os = new ObjectInputStream(fs);
			ListaEmpleados b = new ListaEmpleados();
			while(fs.available() > 0) {
				Object objeto = os.readObject();
				Empleado employee = (Empleado) objeto;
				b.contratar(employee);
			}
			os.close();
			return b;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
                        System.out.println("No se encontro archivo con empleados. Se creará uno vacio");
                        System.out.println();
                        System.out.println("---------------------------------------------------------");
                        DataLoader.createEmptyEmployeesFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static DatosEmpresa loadCompany(File archivo) {
		try {
			FileInputStream fs = new FileInputStream(archivo);
			ObjectInputStream os = new ObjectInputStream(fs);
			DatosEmpresa company = null;;
			while(fs.available() > 0) {
				Object objeto = os.readObject();
				company = (DatosEmpresa) objeto;
			}
			os.close();
			return company;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
                        System.out.println("No se encontro archivo con empleados. Se creará uno vacio");
                        System.out.println();
                        System.out.println("---------------------------------------------------------");
                        DataLoader.createEmptyEmployeesFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static void createEmptyCompanyFile() {
		FileOutputStream fs;
		ObjectOutputStream os;
		try {
			fs = new FileOutputStream("CompanyInformation.bin");
			os = new ObjectOutputStream(fs);
			os.close();
			fs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void createEmptyEmployeesFile() {
		FileOutputStream fs;
		ObjectOutputStream os;
		try {
			fs = new FileOutputStream("EmployeeDatabase.bin");
			os = new ObjectOutputStream(fs);
			os.close();
			fs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void createEmptyInventoryFile() {
		FileOutputStream fs;
		ObjectOutputStream os;
		try {
			fs = new FileOutputStream("CarDatabase.bin");
			os = new ObjectOutputStream(fs);
			os.close();
			fs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static void createEmptyListaVentas() {
		FileOutputStream fs;
		ObjectOutputStream os;
		try {
			fs = new FileOutputStream("VentasDatabase.bin");
			os = new ObjectOutputStream(fs);
			os.close();
			fs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static void createEmptyListaCompras() {
		FileOutputStream fs;
		ObjectOutputStream os;
		try {
			fs = new FileOutputStream("ComprasDatabase.bin");
			os = new ObjectOutputStream(fs);
			os.close();
			fs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
