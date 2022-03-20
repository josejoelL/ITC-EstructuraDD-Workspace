package Interfaz;
public class Nodo<T> {
	  private Nodo<T> sig;
	  private T dato;
	
	  public Nodo(T data) {
	    dato = data;
	  }

	  public Nodo(T data, Nodo<T> sig) {
	    dato = data;
	    this.sig = sig;
	  }

	  public void setSiguiente(Nodo<T> sig) {
	    this.sig = sig;
	  }
	  public Nodo<T> getSiguiente() {
	    return sig;
	  }

	  public T getDato() {
	    return dato;
	  }

	}