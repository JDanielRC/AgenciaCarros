import java.io.File;

public class TestContinuidad {
	
	
	
	public static void main(String[] args) {
		Inventario chidote = DataLoader.loadInventory(new File("Database.bin"));
		System.out.println(chidote.getTotalCarros());
	}
	
}
