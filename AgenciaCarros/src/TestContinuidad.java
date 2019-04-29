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
