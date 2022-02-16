import java.util.HashMap;
import java.util.Map;

public class FeirasCadastradas {

	private String local;
	static HashMap<String, Integer> produtosVendidos;
	
	public FeirasCadastradas(String local, HashMap<String, Integer> produtosVendidos) {
		this.local = local;
		FeirasCadastradas.produtosVendidos = produtosVendidos;
	}
	
	public String getLocal() {	return local;	}
	public void setLocal(String local) {	this.local = local;	}

	public HashMap<String, Integer> getProdutosVendidos() {	return produtosVendidos;}
	public void setProdutosVendidos(HashMap<String, Integer> produtosVendidos) {	FeirasCadastradas.produtosVendidos = produtosVendidos;	}
	
	// hashmap <produto vendido, quantia do produto vendido>
	// ou hashmap <produto vendido, valor total recebido com o produto vendido>
	
	public void addProdutosVendidosQuantidade(String produto, int quantidade) {
		FeirasCadastradas.produtosVendidos.put(produto, quantidade);
		
		// for passando em cada chave do HashMap do produtosEstoque
		// até encontrar um correspondente do produto adicionado ao
		// HashMap produtosVendidos, pegar seu valor e subtrair
		// do estoque
		
		for(Map.Entry<String, Integer> pair: Produtos.produtosEstoque.entrySet()) {
			if(produto == pair.getKey()) {
				pair.setValue(pair.getValue() - quantidade);
			}
		}
	}

	@Override
	public String toString() {
		return "Feira Cadastrada [Local: " + local + ", Produtos Vendidos: " + produtosVendidos + "]";
	}
	
}
