import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int opcao;
		Contador contador = new Contador();
		
		
		do {
			
			System.out.println((new StringBuilder()
					.append("\n1 - zerar")
					.append("\n2 - incrementar")
					.append("\n3 - imprimir\n\n")).toString());
			
			System.out.print("Digite a opcao: ");
			opcao = new Scanner(System.in).nextInt();
			
			switch (opcao) {
			
			case 1:
				contador.zerar();
				break;
				
			case 2:
				contador.incrementar();
				break;
				
			case 3:
				contador.imprimir();
				break;

			default:
				break;
			}
			
		} while (opcao != 0);
		
		System.out.println("\n\nExecucao finalizada.\n\n");
	}
}
