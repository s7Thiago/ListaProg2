
public class Professor {
	
	String nomeProfessor, nomeDepartamento;
	Data dataAdmissao;
	Long numeroRegistro;
	
	public Professor(String nomeProfessor, String nomeDepartamento, Data dataAdmissao, Long numeroRegistro) {
		super();
		this.nomeProfessor = nomeProfessor;
		this.nomeDepartamento = nomeDepartamento;
		this.dataAdmissao = dataAdmissao;
		this.numeroRegistro = numeroRegistro;
	}
	
	public void imprimirDados() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (new StringBuilder()
				.append("Nome do professor: ").append(nomeProfessor)
				.append("\nDepartamento: ").append(nomeDepartamento)
				.append("\nData de admissao: ").append(dataAdmissao.toString())
				.append("\nRegistro: ").append(numeroRegistro))
				.toString();
	}

}
