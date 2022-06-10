public class SwitchEstaciones {
	private int estacionAnio = 0;
	
	public void setEstacionAnio(int estacionAnio) {
		this.estacionAnio=estacionAnio;
		}
	//@pre: las estacion van del 1 al 4
	public void determinarEstacionDelanio() {
		switch(estacionAnio) {
			case 1: System.out.println("la estacion es verano");
					break;
			case 2: System.out.println("la estacion es otoño");
			        break;
			case 3: System.out.println("la estacion es inverno");
					break;
			case 4: System.out.println("la estacion es primavera");
			        break;
			default: System.out.println("ingrese un numero valido");
		}
		}
	

}
