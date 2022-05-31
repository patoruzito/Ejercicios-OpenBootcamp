
public class SegundaParte {
	
	public static void main(String[] args) {
		SegundaParte miCoche = new SegundaParte(4);
		miCoche.sumarleUnaPuerta();
		System.out.println("la cantidad de puertas de mi coche es de "+puertasDelCoche);
	}
	
	
	public SegundaParte(int cantidadDePuertas) {
		coche(cantidadDePuertas);
	}
	
	private static int puertasDelCoche = 0;
	
	public void coche (int puertasDelCoche) {
		this.puertasDelCoche = puertasDelCoche ;
	}
	
	public void sumarleUnaPuerta() {
		puertasDelCoche++;
	}
	
	
	
}
