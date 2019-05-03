
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
