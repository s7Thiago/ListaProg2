
public class Data {
	
	Integer dia, mes, ano;
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public void imprimirData() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (new StringBuilder()
				.append(dia)
				.append("/")
				.append(mes)
				.append("/")
				.append(ano))
				.toString();
	}

}
