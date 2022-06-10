public class bucleWhile {
	private int numeroWhile=0;
	
	public bucleWhile(int numeroWhile) {
		setNumeroWhile(numeroWhile);
	}

	public int getNumeroWhile() {
		return numeroWhile;
	}

	public void setNumeroWhile(int numeroWhile) {
		if(numeroWhile<=3) {
			this.numeroWhile = numeroWhile;		
		}else throw new Error("el numero tiene ingresado tiene que ser a mayor a 3");
	}
	
	public void generarBucleWhile() {
		while(numeroWhile<3) {
			numeroWhile++;
			System.out.println("el numero es: "+numeroWhile);
		}
	}
}
