import java.util.NoSuchElementException;

public class ListaEnlazada<E> {
	
	private NodoLE<E> inicio, fin;
	private int size;
		
	public ListaEnlazada() {
		this.inicio = this.fin = null;
		this.size = 0;
	}
		
	public ListaEnlazada(E[] datos) {
		for (int i = 0; i < datos.length; i++) {
			if (i == 0) {
				insertarInicio(datos[i]);
				i++;
			}
			NodoLE<E> nvo = new NodoLE<E>(datos[i], this.fin);
			this.fin.setNext(nvo);
			this.fin = nvo;
			size++;
		}
		
	}
	
	public E inicio() {
		try {
			return this.inicio.getDato();
		} catch (NullPointerException e) {
			throw new NoSuchElementException("No se puede regresar el primer elemento de una lista enlazada vacía");
		}

	}
	
	public E fin() {
		try {
			return this.fin.getDato();
		} catch (NullPointerException e) {
			throw new NoSuchElementException("No se puede regresar el último elemento de una lista enlazada vacía");
		}
	}
	
	public boolean estaVacia() {
		return this.size == 0;
	}
	
	public int size() {
		return this.size;
	}
	
	public void insertarInicio(E dato) {
		NodoLE<E> nvo = new NodoLE(dato, this.inicio);
		this.inicio = nvo;
		if (this.estaVacia()) {
			this.fin = nvo;
		}
		this.size++;
	}
	
	public void insertarFin(E dato) {
		if (this.estaVacia()) {
			this.insertarInicio(dato);
		} else {
			NodoLE<E> nvo = new NodoLE<E>(dato);
			this.fin.setNext(nvo);
			this.fin = nvo;
			this.size++;
		}
	}
	
	public E borrarInicio() {
		try {
			E res = this.inicio();
			this.inicio= this.inicio.getNext();
			this.size--;
			if (this.size == 0) {
				this.fin = null;
			}
			return res;
		} catch (NullPointerException|NoSuchElementException e) {
			throw new IndexOutOfBoundsException("No puedes borrar el inicio de una lista vacía");
		}
	}
	
	public E borrarFin() {
		if (this.size > 1) {
			E dato = this.fin();
			NodoLE<E> current = this.inicio;
			for(int i = 0; i < this.size-2; i++) {
				current = current.getNext();
			}
			current.setNext(null);
			this.fin = current;
			this.size--;
			return dato;
		} else {
			try {
				return this.borrarInicio();
			} catch(IndexOutOfBoundsException e) {
				throw new IndexOutOfBoundsException("No se puede borrar el fin de una lista vacía");
			}
		}
	}
	
	public void flush() {
		this.inicio = this.fin = null;
		this.size = 0;
		System.gc();
	}
	
	public E getEn(int pos) {
		if (pos > this.size || pos < 0) {
			throw new NoSuchElementException("Posición Inválida");
		} else if (pos == this.size-1) {
			return this.fin();
		}
		NodoLE<E> current = this.inicio;
		for (int i = 0; i < pos; i++) {
			current = current.getNext();
		}
		return current.getDato();
	}
	
	public void setEn(E dato, int pos) {
		if (pos > this.size || pos < 0) {
			throw new NoSuchElementException("Posición Inválida");
		}
		NodoLE<E> current = this.inicio;
		for (int i = 0; i < pos; i++) {
			current = current.getNext();
		}
		current.setDato(dato);
	}
	
	public E borrarEn(int pos) {
		if (pos > size-1 || pos<0) {
			throw new IndexOutOfBoundsException("Index incorrecto");
		} else if (pos == 0) {
			return borrarInicio();
		} else if (pos == this.size){
			return borrarFin();
		} else {
			NodoLE<E> current = this.inicio;
			for (int i = 0; i < pos-1; i++) {
				current = current.getNext();
			}
			E dato = current.getNext().getDato();
			current.setNext(current.getNext().getNext());
			size--;
			return dato;
		}
	}
	
	public String toString() {
		String res = "";
		NodoLE<E> current = this.inicio;
		for (int i = 0; i < size; i++) {
			res += current.getDato() + ", ";
			current = current.getNext();
		}
		return res;
	}
	
	public void insertarEn(E dato, int pos) throws IndexOutOfBoundsException {
		int cont = 0;
		if (pos > this.size || pos<0) {
			throw new IndexOutOfBoundsException("La posición ingresada excede el tamaño del arreglo.");
		}
		if (estaVacia()) {
			insertarInicio(dato);
		} else if(pos == 0) {
			insertarInicio(dato);
		} else {
			NodoLE<E> nvo = new NodoLE<E>(dato, this.inicio); //creamos el nodo al principio y ahi lo dejamos ahorita
			NodoLE<E> current = this.inicio; //nodo que se va a ir moviendo de lugar
			while (cont < pos-1) {
				cont++;
				current = current.getNext(); //current va cambiando de nodo, avanzando hasta uno antes de la posicion que quiero
			}
			nvo.setNext(current.getNext());
			current.setNext(nvo);
		}
		size++;
	}
}

	class NodoLE <E>{
		private E dato;
		private NodoLE<E> next;
	
	public NodoLE(E dato, NodoLE<E> next) {
		super();
		this.dato = dato;
		this.next = next;
	}
	
	public NodoLE(E dato) {
		this(dato, null);
	}

	public void setDato(E dato) {
		this.dato = dato;
	}

	public void setNext(NodoLE<E> next) {
		this.next = next;
	}

	public E getDato() {
		return dato;
	}

	public NodoLE<E> getNext() {
		return next;
	}
	
}