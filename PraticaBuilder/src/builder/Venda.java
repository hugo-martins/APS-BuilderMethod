package builder;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	
	private String data;
	private int frete;
	private List<ItemVenda> listaItens;
	private Cliente cliente;
	private Funcionario funcionario;
	
	
	public Venda(String data, int frete, List<ItemVenda> listaItens, Funcionario funcionario, Cliente cliente) {
		super();
		this.data = data;
		this.frete = frete;
		this.listaItens = listaItens;
		this.funcionario = funcionario;
		this.cliente = cliente;
	}
	public Venda () {
		this.data = "";
		this.frete = 0;
		this.listaItens = new ArrayList<ItemVenda>();
		this.funcionario = new Funcionario();
		this.cliente = new Cliente();
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public List<ItemVenda> getListaItem() {
		return listaItens;
	}

	public void setListaItem(List<ItemVenda> listaItens) {
		this.listaItens = listaItens;
	}
	
	public double GetFrete() {
		return frete;
	}
	
	public void setFrete(int frete) {
		this.frete = frete;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public void addItem(ItemVenda item) {
		listaItens.add(item);
	}
	
	@Override
	public String toString() {
		return "Data: " + this.data+ "\nFrete: " + this.frete  + "\nItens: " + this.listaItens 
				+ "\nFuncionario: " + this.funcionario.getNome();
				
	}

}
