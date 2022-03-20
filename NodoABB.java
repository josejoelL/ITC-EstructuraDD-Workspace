package arboles;

public class NodoABB<T> {
	private NodoABB<T> SubIzq;
	public T Info;
	private NodoABB<T> SubDer;
	
	public NodoABB(T dato){
		Info=dato;
		SubIzq=SubDer=null;
	}

	public NodoABB<T> getSubIzq() {
		return SubIzq;
	}

	public void setSubIzq(NodoABB<T> si) {
		SubIzq = si;
	}

	public NodoABB<T> getSubDer() {
		return SubDer;
	}

	public void setSubDer(NodoABB<T> sd) {
		SubDer = sd;
	}
	
}
