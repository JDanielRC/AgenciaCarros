//Autores:
//Carlos Ernesto Lopez Solano A01633683
//Juan Daniel Rubio Camacho A01633924
//Nombre de la clase: ListaEmpleados.java
//Fecha: 05/05/2019
//Comentarios u observaciones.
//------------------------------------------------------------------------------

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.ImageIcon;

public class ListaEmpleados {
	
	private int size, cantidadGerentes;
        //La llave es la matricula del empleado, la cual almacena al objeto empleado
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
		this.listaEmpleados.put(empleado.getMatricula(), empleado);
		this.size++;
	}
	
	public Empleado obtener(String matricula) {
		return this.listaEmpleados.get(matricula);
	}
        
        public boolean contains(String matricula) {
            return this.listaEmpleados.containsKey(matricula);
        }
        
        public void modificarEmpleado(String matricula, String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno,
                                      String rfc, String cargo, ImageIcon foto) {
            Empleado temporal = this.listaEmpleados.get(matricula);
            temporal.setPrimerNombre(primerNombre);
            temporal.setSegundoNombre(segundoNombre);
            temporal.setApellidoPaterno(apellidoPaterno);
            temporal.setApellidoMaterno(apellidoMaterno);
            temporal.setRfc(rfc);
            temporal.setCargo(cargo);
            temporal.setFoto(foto);
            this.listaEmpleados.delete(matricula);
            this.listaEmpleados.put(matricula, temporal);
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
		ListaEmpleados lista = DataLoader.loadEmployees(new File("EmployeeDatabase.bin"));
		System.out.println(lista.getSize());
		lista.obtener("A0100");
		/*Empleado pedrito = new Empleado("Pedro", "D�az", "P�rez", "PDP19374", "Empleado");
		Empleado alfredito = new Empleado("Alfredo", "Mart�nez", "L�pez", "AML09857", "Empleado");
		Empleado hugo = new Empleado("Hugo", "Masharelli", "Rocha", "HMR12455", "Gerente");
		lista.contratar(pedrito);
		lista.contratar(alfredito);
		lista.contratar(hugo);
		lista.almacenarEmpleados();
		*/
	}
}
