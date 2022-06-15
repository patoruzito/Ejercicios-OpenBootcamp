
public class Persona {
	private int edad = 0;
	private String nombre = null;
	private int telefono = 0;
	
	public Persona (int edad, String nombre, int telefono) {
		setEdad(edad);
		setNombre(nombre);
		setTelefono(telefono);
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

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public static void main(String[] args) {
		Persona charles = new Persona(35,"charles",4889684);
		System.out.println("nombre: "+charles.getNombre()+"; edad: "+charles.getEdad()+"; telefono: "+charles.getTelefono());
		charles.setEdad(45);
		charles.setTelefono(5445682);
		charles.setNombre("Julian");
		System.out.println("charles se a cambiado al identidad");
		System.out.println("nombre: "+charles.getNombre()+"; edad: "+charles.getEdad()+"; telefono: "+charles.getTelefono());
	}
}

	
