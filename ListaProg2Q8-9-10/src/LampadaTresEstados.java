import java.util.Scanner;

public class LampadaTresEstados extends Lampada{
	
	/**Os estados da lampada podem variar de 0 a 2**/
	int estado;
	
	public void exibirEstado() {
		switch (estado) {
		case 0:
			System.out.println("A lampada esta apagada");
			estaAcesa = false;
			break;
			
		case 1:
			System.out.println("A lampada esta em meia-luz");
			estaAcesa = true;
			break;
			
		case 2:
			estaAcesa = true;
			System.out.println("A lampada esta acesa");
			break;
			
		default:
			break;
		}
	}

	@Override
	public void ligar() {
		// O usuario precisa escolher entre os estados 0, 1 e 2
		System.out.println("Digite o estado[0, 1, 2]:");
		estado = new Scanner(System.in).nextInt();
		
		System.out.println("\n\n------------------------");
		exibirEstado();
		
	}
}
