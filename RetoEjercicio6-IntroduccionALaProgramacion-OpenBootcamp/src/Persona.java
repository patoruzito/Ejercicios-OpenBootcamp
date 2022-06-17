
public class Persona {
	private int edad = 0;
	private String nombre = null;
	private int teléfono = 0;

	public Persona(int edad, String nombre, int teléfono) {
		setEdad(edad);
		setNombre(nombre);
		setTeléfono(teléfono);
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

	public int getTeléfono() {
		return teléfono;
	}

	public void setTeléfono(int teléfono) {
		this.teléfono = teléfono;
	}
	
}
