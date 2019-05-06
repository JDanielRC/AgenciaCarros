//Autores:
//Carlos Ernesto Lopez Solano A01633683
//Juan Daniel Rubio Camacho A01633924
//Nombre de la clase: TestContinuidad.java
//Fecha: 05/05/2019
//Comentarios u observaciones.
//------------------------------------------------------------------------------

import java.io.File;

public class TestContinuidad {
	
	
	
	public static void main(String[] args) {
		DataLoader.createEmptyEmployeesFile();
		DataLoader.createEmptyInventoryFile();
		Inventario chidote = DataLoader.loadInventory(new File("CarDatabase.bin"));
		ListaEmpleados lista = DataLoader.loadEmployees(new File("EmployeeDatabase.bin"));
		System.out.println(chidote.getTotalCarros());
		System.out.println(lista.getSize());
	}
	
}
