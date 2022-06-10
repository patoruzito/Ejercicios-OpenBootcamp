public class bucleDoWhile {
	
	private int numeroDoWhile=0;

	public int getNumeroDoWhile() {
		return numeroDoWhile;
	}

	public void setNumeroDoWhile(int numeroDoWhile) {
		if(numeroDoWhile<=3) {
			this.numeroDoWhile = numeroDoWhile;		
		}else throw new Error("el numero tiene ingresado tiene que ser a mayor a 3");
	}
	
	public void generarDoWhile() {
		do {
			numeroDoWhile++;
			System.out.println("el numero es: "+numeroDoWhile);
		}while(numeroDoWhile<=3);
	}	
}
