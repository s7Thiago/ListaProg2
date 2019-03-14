
public class Pessoa {

	private String nome;
	private String telefone;
	private String email;
	private String endereco;

	public Pessoa(String nome, String telefone, String email, String endereco) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return (new StringBuilder().append("Nome: ").append(nome)
				.append("\nTelefone: ").append(telefone)
				.append("\nE-mail: ").append(email)
				.append("\nEndere�o: ").append(endereco))
				.toString();
	}
}