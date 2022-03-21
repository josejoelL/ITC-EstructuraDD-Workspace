package objeto_nodo;

public class CLienteBanco {
	private int id;
	private String nombre;
	private int nCuenta;
	private Double saldo;

	public CLienteBanco(int id, String nombre, int nCuenta, Double saldo) {

		this.id = id;
		this.nombre = nombre;
		this.nCuenta = nCuenta;
		this.saldo = saldo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static int getnCuenta() {
		return nCuenta;
	}

	@Override
	public String toString() {
		return " nombre= " + nombre+", id= " + id +", nCuenta=" + nCuenta + ", saldo=" + saldo + " ";
	}

	public void setnCuenta(int nCuenta) {
		this.nCuenta = nCuenta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
