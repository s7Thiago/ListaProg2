import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int option = 0;
		String separador = "-------------------";
		CadernoDeEnderecos cadernoDeEnderecos = new CadernoDeEnderecos();

		do {
			System.out.println((new StringBuilder()
					.append("1 - Nova pessoa")
					.append("\n2 - Todos os endereços")
					.append("\n3 - Mostrar endereço")
					.append("\n4 - Remover pessoa"))
					.toString());
			
			System.out.print("\n\nEscolha a opção: ");
			option = new Scanner(System.in).nextInt();

			switch (option) {
			case 1:
				
				String nome, telefone, email, endereco;
				
				System.out.print("Digite o nome: ");
				nome = new Scanner(System.in).nextLine();
				
				System.out.print("Digite o telefone: ");
				telefone = new Scanner(System.in).nextLine();
				
				System.out.print("Digite o email: ");
				email = new Scanner(System.in).nextLine();
				
				System.out.print("Digite o endereço: ");
				endereco = new Scanner(System.in).nextLine();
				
				cadernoDeEnderecos.addPessoa(new Pessoa(nome, telefone, email, endereco));
				break;

			case 2:
				System.out.println(separador + "Listando todos os endereços" + separador);
				cadernoDeEnderecos.mostrarTodosOsEnderecos();
				break;
				
			case 3:
				System.out.print("Digite o nome de alguém: ");
				String nomePesquisa = new Scanner(System.in).nextLine();
				
				cadernoDeEnderecos.filtrarEnderecoPeloNome(nomePesquisa);
				break;
				
			case 4:
				List<Pessoa> listaRemover = new ArrayList<Pessoa>();
				
				System.out.print("Entre com um nome: ");
				String nomeRemover = new Scanner(System.in).nextLine();
				
				cadernoDeEnderecos.removerPessoa(nomeRemover);
				break;

			default:
				break;
			}

		} while (option != 0);
		
		System.out.println("\n\nExecução Finalizada");
	}
}
