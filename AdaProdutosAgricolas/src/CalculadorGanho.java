import java.util.Map;

public class CalculadorGanho {

	public static double calculadora(FeirasCadastradas feira) {
		double ganhoTotal = 0;
		
		for(Map.Entry<String, Integer> prodVend: FeirasCadastradas.produtosVendidos.entrySet()) {
			for(Map.Entry<String, Double> prodPreco: Produtos.produtosPreco.entrySet()) {
				if(prodVend.getKey() == prodPreco.getKey()) {
										
					ganhoTotal += (prodVend.getValue() * prodPreco.getValue());
					
				}
			}
		}
		return ganhoTotal;
	}
}
