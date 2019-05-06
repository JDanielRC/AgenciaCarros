//Autores:
//Carlos Ernesto Lopez Solano A01633683
//Juan Daniel Rubio Camacho A01633924
//Nombre de la clase: ListaCompras.java
//Fecha: 05/05/2019
//Comentarios u observaciones.
//------------------------------------------------------------------------------

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

	public Carro realizarCompra(ReporteCompra compra) {
		this.listaCompras.put(compra.getPlacas(), compra);
		this.size++;
		return compra.carroComprado;
	}
	
	public ReporteCompra encontrar(String placas) {
		return this.listaCompras.get(placas);
	}
	
	public ReporteCompra eliminarRegistro(String placas) {
		this.size--;
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
