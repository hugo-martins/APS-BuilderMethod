package builder;

public class VendaBuilder {
	
	private Venda venda;
	
	public VendaBuilder() {
		venda = new Venda();
		
	}

	
	public VendaBuilder data(String data) {
		venda.setData(data);
		return this;
	}
	
	public VendaBuilder clientePF(String nome, String CPF) {
		Cliente clientePF = new ClientePF(nome, CPF);
		venda.setCliente(clientePF);
		return this;
	}
	
	public VendaBuilder clientePJ (String nome, String cNPJ) {
		Cliente clientePJ = new ClientePJ (nome, cNPJ); 
		venda.setCliente(clientePJ);
		return this;
		
	}
		
	public VendaBuilder frete (int frete) {
		venda.setFrete(frete);
		return this;
	}
	
	
	public VendaBuilder item (int quant, Produto produto) {
		ItemVenda item = new ItemVenda ();
		item.setQuantidade(quant);
		item.setProduto(produto);
		venda.addItem(item);
		return this;
	}
	public VendaBuilder funcionario (String nome) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome(nome);
		venda.setFuncionario(funcionario);
		return this;
			
	}
	
	public Venda Build () {
		return this.venda;
		
	}

}
