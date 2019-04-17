
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
	
	public static void main(String[] args) {
		ListaEmpleados lista = new ListaEmpleados();
		Empleado pedrito = new Empleado("Pedro", "Díaz", "Pérez", "PDP19374", "Empleado");
		Empleado alfredito = new Empleado("Alfredo", "Martínez", "López", "AML09857", "Empleado");
		Empleado hugo = new Empleado("Hugo", "Masharelli", "Rocha", "HMR12455", "Gerente");
		lista.contratar(pedrito);
		System.out.println(pedrito.getMatricula());
		lista.contratar(alfredito);
		System.out.println(alfredito.getMatricula());
		lista.contratar(hugo);
		System.out.println(hugo.getMatricula());
	}
}
