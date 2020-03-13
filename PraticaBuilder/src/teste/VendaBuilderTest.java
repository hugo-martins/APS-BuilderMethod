package teste;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import builder.Cliente;
import builder.ClientePJ;
import builder.Funcionario;
import builder.ItemVenda;
import builder.Produto;
import builder.Venda;
import builder.VendaBuilder;

class VendaBuilderTest {

	@Test
	void teste1() {
		
		Produto banana = new Produto("Banana", 5.0);
		Venda venda = new VendaBuilder()
				.data("30/12/1998")
				.clientePF("Hugo", "222.222.222-22")
				.item(1, banana)
				.frete(10)
				.funcionario("Carlos")
				.Build();
		
		assertEquals("Data: 30/12/1998" + "\nFrete: 10" 
						+ "\nItens: [Produto:Descricao:Banana, preco=5.0],Quantidade: 1]" + "\nFuncionario: Carlos",venda.toString());
	}
	
	@Test
	void test2() {
			Venda venda = new Venda();
			Cliente cliente = new ClientePJ("Hugo", "222.222.222-22");
			venda.setCliente(cliente);
			Produto banana = new Produto("Banana", 5.0);
			ItemVenda item1 = new ItemVenda(1, banana);
			Funcionario funcionario = new Funcionario("Carlos");
			venda.addItem(item1);
			venda.setData("30/12/1998");
			venda.setFrete(10);
			venda.setFuncionario(funcionario);
			
			assertEquals("Data: 30/12/1998"
					+ "\nFrete: 10"
					+ "\nItens: [Produto:Descricao:Banana, preco=5.0],Quantidade: 1]"
					+ "\nFuncionario: Carlos",venda.toString());
	}
	
	


}
