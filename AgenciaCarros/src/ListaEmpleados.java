
public class ListaEmpleados {
	
	private int size;
	private HashTable<String, Empleado> listaEmpleados;
	
	
	public ListaEmpleados() {
		this.size = 0;
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

}
