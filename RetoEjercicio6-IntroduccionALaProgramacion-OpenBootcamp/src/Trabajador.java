
public class Trabajador extends Persona{
	private int salario = 0;
	
	public Trabajador(int edad, String nombre, int teléfono, int salario) {
		super(edad,nombre,teléfono);
		setSalario(salario);
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
}
