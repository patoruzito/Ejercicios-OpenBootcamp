
public class Cliente extends Persona {
	private int credito = 0;
	
	public Cliente(int edad, String nombre, int teléfono, int credito) {
		super(edad,nombre,teléfono);
		setCredito(credito);
	}

	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}
	
}
