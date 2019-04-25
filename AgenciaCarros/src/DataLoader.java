import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

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
			e.printStackTrace();
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
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
