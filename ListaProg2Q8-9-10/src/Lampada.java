
public abstract class Lampada {
	String modelo;
	String codigo;
	Double valor;
	Integer qtdeEstoque;
	Boolean estaAcesa;

	public abstract void ligar();

	public void desligar() {
		estaAcesa = false;
	}

	public boolean estaAcesa() {
		return estaAcesa;
	}
}
