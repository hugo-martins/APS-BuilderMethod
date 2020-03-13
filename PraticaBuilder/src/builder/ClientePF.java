package builder;

public class ClientePF extends Cliente {
	
	private String Nome;
	private String CPF;
	
	
	
	public ClientePF(String nome, String cpf) { 
		this.Nome = nome;
		this.CPF = cpf;
	}

	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}

}
