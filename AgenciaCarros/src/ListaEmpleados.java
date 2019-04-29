import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ListaEmpleados {
	
	private int size, cantidadGerentes;
	private HashTable<String, Empleado> listaEmpleados;
	
	
	public ListaEmpleados() {
		this.size = 0;
		this.cantidadGerentes = 0;
		this.listaEmpleados = new HashTable<String, Empleado>();
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public HashTable<String, Empleado> getListaEmpleados() {
		return listaEmpleados;
	}


	public void setListaEmpleados(HashTable<String, Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}


	public int getCantidadGerentes() {
		return cantidadGerentes;
	}


	public void setCantidadGerentes(int cantidadGerentes) {
		this.cantidadGerentes = cantidadGerentes;
	}
	
	public Empleado despedir(String matricula) {
		this.size--;
		return this.listaEmpleados.delete(matricula);
	}
	
	public void contratar(Empleado empleado) {
		this.listaEmpleados.put(empleado.generaMatricula(this), empleado);
		this.size++;
	}
	
	public Empleado obtener(String matricula) {
		return this.listaEmpleados.get(matricula);
	}
	
	public void almacenarEmpleados() { //crea archivo.dat que almacena todos los datos
		int j;
		FileOutputStream fs;
		ObjectOutputStream os;
		try {
			fs = new FileOutputStream("EmployeeDatabase.bin");
			os = new ObjectOutputStream(fs);
			for (int i = 0; i < this.listaEmpleados.getTabla().length; i++) {
				j = 0;
				if (this.listaEmpleados.getTabla()[i].size() > 0) {
					for (int l = 0; l < this.listaEmpleados.getTabla()[i].size(); l++) {
						Empleado employee = this.listaEmpleados.getTabla()[i].getEn(j).valor;
						j++;
						os.writeObject(employee);
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
	
	public static void main(String[] args) {
		/*ListaEmpleados lista = new ListaEmpleados();
		Empleado pedrito = new Empleado("Pedro", "Díaz", "Pérez", "PDP19374", "Empleado");
		Empleado alfredito = new Empleado("Alfredo", "Martínez", "López", "AML09857", "Empleado");
		Empleado hugo = new Empleado("Hugo", "Masharelli", "Rocha", "HMR12455", "Gerente");
		lista.contratar(pedrito);
		lista.contratar(alfredito);
		lista.contratar(hugo);
		lista.almacenarEmpleados();
		*/
	}
}
