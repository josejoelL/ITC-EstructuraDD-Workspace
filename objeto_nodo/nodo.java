package objeto_nodo;


public class nodo{
	private int clave;
	private int edad;
	private String nombre;
	private String sexo;
	protected nodo sig;
	protected nodo ant;
	public nodo(int clave) {
	
		this.clave = clave;
	}
	public nodo(int clave, String nombre) {
		super();
		this.clave = clave;
		this.nombre = nombre;
	}

	public nodo(int clave, int edad, String nombre, String sexo) {
		super();
		this.clave = clave;
		this.edad = edad;
		this.nombre = nombre;
		this.sexo = sexo;
		
	}
	public int getClave() {
		return clave;
	}
	public void setClave(int clave) {
		this.clave = clave;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return " clave : " + clave + "\n edad : " + edad + "\n nombre : " + nombre + "\n sexo : " + sexo + " ";
	}
	
	public void setSig(nodo sig) {
		this.sig = sig;
	}
	public nodo getSig() {
		return sig;
	}

	public void setAnt(nodo ant) {
		this.ant = ant;
		
	}
	public nodo getAnt() {
		return ant;
	}

	
	
}




