
public class Contador {
	
	private int valor;
	
	public void zerar() {
		valor = 0;
	}
	
	public void incrementar() {
		valor++;
	}
	
	public void imprimir() {
		System.out.println("\n----------------------------------\nValor: " + valor + "\n----------------------------------");
	}

}
