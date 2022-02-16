import java.util.HashMap;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		boolean confirm = false;
		HashMap<String, Integer> estoque1 = new HashMap<>();
		HashMap<String, Double> tabelaPrecos = new HashMap<>();
		Produtos p1 = new Produtos("Maçã", 12057, 27, 33, 1.12d, estoque1, tabelaPrecos);
		Produtos p2 = new Produtos("Banana", 17033, 57, 15, 3.17d, estoque1, tabelaPrecos);
		Produtos p3 = new Produtos("Lichia", 10269, 127, 21, 0.72d, estoque1, tabelaPrecos);
		Produtos p4 = new Produtos("Pitaya", 3075, 28, 31, 22.61d, estoque1, tabelaPrecos);
		Produtos p5 = new Produtos("Abacaxi", 57124, 17, 27, 7.72d, estoque1, tabelaPrecos);
		Produtos p6 = new Produtos("Tamarindo", 4269, 57, 32, 5.72d, estoque1, tabelaPrecos);
		Produtos p7 = new Produtos("Cereja", 71472, 327, 17, 1.15d, estoque1, tabelaPrecos);
				
		HashMap<String, Integer> brasCubas = new HashMap<>();
		HashMap<String, Integer> santana = new HashMap<>();
		HashMap<String, Integer> saoJudas = new HashMap<>();
		FeirasCadastradas feira1 = new FeirasCadastradas("Brás Cubas", brasCubas);
		FeirasCadastradas feira2 = new FeirasCadastradas("Santana", santana);
		FeirasCadastradas feira3 = new FeirasCadastradas("São Judas", saoJudas);
				
		feira1.addProdutosVendidosQuantidade("Maçã", 7);
		feira1.addProdutosVendidosQuantidade("Banana", 13);
		feira1.addProdutosVendidosQuantidade("Lichia", 23);
		feira1.addProdutosVendidosQuantidade("Cereja", 33);
		
		feira2.addProdutosVendidosQuantidade("Pitaya", 2);
		feira2.addProdutosVendidosQuantidade("Abacaxi", 9);
		feira2.addProdutosVendidosQuantidade("Cereja", 41);
		
		feira3.addProdutosVendidosQuantidade("Careja", 52);
		feira3.addProdutosVendidosQuantidade("Tamarindo", 1);
				
		do {
			String produto = JOptionPane.showInputDialog("Produto desejado:");
			
			switch (produto) {
				case "Maçã":
					JOptionPane.showMessageDialog(null, p1.toString());
					confirm = true;
					break;
				case "Banana":
					JOptionPane.showMessageDialog(null, p2.toString());
					confirm = true;
					break;
				case "Lichia":
					JOptionPane.showMessageDialog(null, p3.toString());
					confirm = true;
					break;
				case "Pitaya":
					JOptionPane.showMessageDialog(null, p4.toString());
					confirm = true;
					break;
				case "Abacaxi":
					JOptionPane.showMessageDialog(null, p5.toString());
					confirm = true;
					break;
				case "Tamarindo":
					JOptionPane.showMessageDialog(null, p6.toString());
					confirm = true;
					break;
				case "Cereja":
					JOptionPane.showMessageDialog(null, p7.toString());
					confirm = true;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Produto inválido!");
			}			
		} while (confirm == false);
		
		System.out.println("Tabela de Preços: " + tabelaPrecos);
		System.out.println(feira1.toString());
		System.out.println("Estoque dos Produtos: " + estoque1);
				
		System.out.println("\nTotal de Ganhos: " + CalculadorGanho.calculadora(feira1));
	}

}
