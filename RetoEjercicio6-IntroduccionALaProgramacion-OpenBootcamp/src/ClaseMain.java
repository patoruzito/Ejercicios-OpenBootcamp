
public class ClaseMain {

	public static void main(String[] args) {
		Trabajador trabajador = new Trabajador(27,"pepito",59872323,55000);
		System.out.println("nombre: "+trabajador.getNombre()+" ,edad: "+trabajador.getEdad()+" ,tel: "+trabajador.getTeléfono()+" ,salario: "+trabajador.getSalario());
		Cliente cliente = new Cliente(36,"juan carlos",54367821,84500);
		System.out.println("nombre: "+cliente.getNombre()+" ,edad: "+cliente.getEdad()+" ,tel: "+cliente.getTeléfono()+" ,credito: "+cliente.getCredito());
	}
}
