package LISTA_SENCILLA;

public class NODO {
	private int clave;
	 int edad;
	 String nombre;
	 String sexo;
	NODO sig;
	
	public NODO(int clave, String nombre) {
		super();
		this.clave = clave;
		this.nombre = nombre;
	}
	public NODO(int clave, int edad, String nombre, String sexo) {
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
		return "NODO [clave=" + clave + ", edad=" + edad + ", nombre=" + nombre + ", sexo=" + sexo + "]";
	}

	
	
}
