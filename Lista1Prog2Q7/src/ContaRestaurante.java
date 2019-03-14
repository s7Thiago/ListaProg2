import java.util.ArrayList;
import java.util.List;

public class ContaRestaurante {

	Double valorTotal;
	List<Item> itens = new ArrayList<>();
	List<Cliente> clientes = new ArrayList<>();

	public double valorTotal() {
		Double total = 0.0;
		for (Item item : itens) {
			total += item.valor;
		}
		return total;
	}

	public void dividirConta() {
		Double valorIndividual = valorTotal / clientes.size();
		
		for (Cliente cliente : clientes) {
			cliente.valorAPagar = valorIndividual;
		}
	}
	
	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
		valorTotal = valorTotal();
	}

}
