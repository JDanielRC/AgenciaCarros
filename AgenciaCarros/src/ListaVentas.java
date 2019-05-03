
public class ListaVentas {
	
	private HashTable<String, ReporteVenta> listaVentas;
	int size;
	
	public ListaVentas() {
		this.listaVentas = new HashTable<String, ReporteVenta>();
		this.size = 0;
	}

	
	public ReporteVenta encontrar(String placas) {
		return this.listaVentas.get(placas);
	}
	
	public ReporteVenta eliminarRegistro(String placas) {
		return this.listaVentas.delete(placas);
	}
	
	public void realizarVenta(ReporteVenta reporte) {
		this.listaVentas.put(reporte.placas, reporte);
		this.size++;
	}
	
	public HashTable<String, ReporteVenta> getLista() {
		return listaVentas;
	}

	public void setLista(HashTable<String, ReporteVenta> lista) {
		this.listaVentas = lista;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
	
	
}
