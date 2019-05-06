//Autores:
//Carlos Ernesto Lopez Solano A01633683
//Juan Daniel Rubio Camacho A01633924
//Nombre de la clase: ListaVentas.java
//Fecha: 05/05/2019
//Comentarios u observaciones.
//------------------------------------------------------------------------------

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

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
		this.size--;
		return this.listaVentas.delete(placas);
	}
	
	public Carro realizarVenta(ReporteVenta reporte) {
		this.listaVentas.put(reporte.placas, reporte);
		this.size++;
		return reporte.carroVendido;
	}
	
	public void almacenarDatos() {
		int j;
		FileOutputStream fs;
		ObjectOutputStream os;
		try {
			fs = new FileOutputStream("VentasDatabase.bin");
			os = new ObjectOutputStream(fs);
			for (int i = 0; i < this.listaVentas.getTabla().length; i++) {
				j = 0;
				if (listaVentas.getTabla()[i].size() > 0) {
					for (int l = 0; l < listaVentas.getTabla()[i].size(); l++) {
						ReporteVenta reporte = listaVentas.getTabla()[i].getEn(j).valor;
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
