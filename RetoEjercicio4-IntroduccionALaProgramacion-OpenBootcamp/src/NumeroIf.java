public class NumeroIf {
	private int numeroIf=0;

	public int getNumeroIf() {
		return numeroIf;
	}

	public void setNumeroIf(int numeroIf) {
		this.numeroIf = numeroIf;
	}
	
	public void compararNumero() {
		if(numeroIf>0) {
			System.out.println("el numero es mayor que cero");
		}else if(numeroIf==0) {
			System.out.println("el numero es cero");
		}else if(numeroIf<0) {
			System.out.println("el numero es menor a cero");
		}
	}
	
}
