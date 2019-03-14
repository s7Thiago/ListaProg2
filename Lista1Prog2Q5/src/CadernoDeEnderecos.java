import java.util.ArrayList;
import java.util.List;

public class CadernoDeEnderecos {

	private List<Pessoa> listaDeEnderecos = new ArrayList<Pessoa>();

	public void addPessoa(Pessoa pessoa) {
		listaDeEnderecos.add(pessoa);
	}

	public void mostrarTodosOsEnderecos() {

		int contador = 1;
		for (Pessoa pessoa : listaDeEnderecos) {
			System.out.println("----------------------- " + contador + " -----------------------");
			System.out.println(pessoa.toString());
			System.out.println("\n");
			contador++;
		}
	}

	public void filtrarEnderecoPeloNome(String nome) {
		int contador = 1;
		for (Pessoa pessoa : listaDeEnderecos) {
			if (pessoa.getNome().equals(nome)) {
				System.out.println("----------------------- " + contador + " -----------------------");
				pessoa.toString();
				System.out.println("\n");
				contador++;
			}
		}
	}

	public List<Pessoa> removerPessoa(String nome) {
		List<Pessoa> lista = new ArrayList<>();

		return lista;
	}

}
