import java.time.LocalDateTime;
import java.util.HashMap;

public class Produtos {

	private String nomeProduto;
	private int loteProduto;
	private int quantidadeProdutoEstoque;
	private LocalDateTime dataColheita;
	private LocalDateTime dataValidade;
	private int diasVencimento;
	private double precoProduto;
	static HashMap <String, Integer> produtosEstoque;
	static HashMap <String, Double> produtosPreco;
	
	public Produtos(String nomeProduto, int loteProduto, int quantidadeProdutoEstoque, int diasVencimento,
			double precoProduto, HashMap<String, Integer> produtosEstoque, 
			HashMap<String, Double> produtosPreco) {
		this.nomeProduto = nomeProduto;
		this.loteProduto = loteProduto;
		this.quantidadeProdutoEstoque = quantidadeProdutoEstoque;
		dataColheita = LocalDateTime.now();
		dataValidade = dataColheita.plusDays(diasVencimento);
		this.precoProduto = precoProduto;
		Produtos.produtosEstoque = produtosEstoque;
		Produtos.produtosPreco = produtosPreco;
		addProdutosEstoque(this.nomeProduto, this.quantidadeProdutoEstoque);
		addProdutosPreco(this.nomeProduto, this.precoProduto);
	}

	public String getNomeProduto() {	return nomeProduto;	}
	public void setNomeProduto(String nomeProduto) {	this.nomeProduto = nomeProduto;	}

	public int getLoteProduto() {	return loteProduto;	}
	public void setLoteProduto(int loteProduto) {	this.loteProduto = loteProduto;	}

	public int getQuantidadeProdutoEstoque() {	return quantidadeProdutoEstoque;	}
	public void setQuantidadeProdutoEstoque(int quantidadeProdutoEstoque) {	this.quantidadeProdutoEstoque = quantidadeProdutoEstoque;}

	public LocalDateTime getDataColheita() {		return dataColheita;	}
	public void setDataColheita(LocalDateTime dataColheita) {	this.dataColheita = dataColheita;	}
	
	public LocalDateTime getDataValidade() {	return dataValidade;	}
	public void setDataValidade(LocalDateTime dataValidade) {	this.dataValidade = dataValidade;	}

	public int getDiasVencimento() {	return diasVencimento;	}
	public void setDiasVencimento(int diasVencimento) {	this.diasVencimento = diasVencimento;	}

	public double getPrecoProduto() {	return precoProduto;	}
	public void setPrecoProduto(double precoProduto) {	this.precoProduto = precoProduto;	}
	
	public HashMap<String, Integer> getProdutosEstoque() {	return produtosEstoque;	}
	public void setProdutosEstoque(HashMap<String, Integer> produtosEstoque) {	Produtos.produtosEstoque = produtosEstoque;	}

	public void addProdutosEstoque(String produto, int quantidade) {
		Produtos.produtosEstoque.put(produto, quantidade);
	}
	
	public void addProdutosPreco(String produto, double preco) {
		Produtos.produtosPreco.put(produto, preco);
	}
	
	public void vendaProduto(int venda) {
		setQuantidadeProdutoEstoque(getQuantidadeProdutoEstoque() - venda);
	}
	
	public int calculoValidade() {
		int validade = 0;
		return validade;
	}

	@Override
	public String toString() {
		return "-------Produto------- \nNome: " + nomeProduto + "\nLote: " + loteProduto + "\nEstoque: "
				+ quantidadeProdutoEstoque + "\nData da Colheita: " + dataColheita + "\nVencimento: " + dataValidade + "\nPreço: " + precoProduto +"\n";
	}
	
	
}
