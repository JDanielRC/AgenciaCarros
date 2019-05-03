import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ListaCompras {
	
	private HashTable<String, ReporteCompra> listaCompras;
	int size;
	
	public ListaCompras() {
		this.listaCompras = new HashTable<String, ReporteCompra>();
		this.size = 0;
	}

	public void realizarCompra(ReporteCompra compra) {
		this.listaCompras.put(compra.getPlacas(), compra);
	}
	
	public ReporteCompra encontrar(String placas) {
		return this.listaCompras.get(placas);
	}
	
	public ReporteCompra eliminarRegistro(String placas) {
		return this.listaCompras.delete(placas);
	}
	
	public void almacenarDatos() { 
		int j;
		FileOutputStream fs;
		ObjectOutputStream os;
		try {
			fs = new FileOutputStream("ComprasDatabase.bin");
			os = new ObjectOutputStream(fs);
			for (int i = 0; i < this.listaCompras.getTabla().length; i++) {
				j = 0;
				if (listaCompras.getTabla()[i].size() > 0) {
					for (int l = 0; l < listaCompras.getTabla()[i].size(); l++) {
						ReporteCompra reporte = listaCompras.getTabla()[i].getEn(j).valor;
						j++;
						os.writeObject(reporte);
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
	
	public HashTable<String, ReporteCompra> getLista() {
		return listaCompras;
	}

	public void setLista(HashTable<String, ReporteCompra> lista) {
		this.listaCompras = lista;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
}
