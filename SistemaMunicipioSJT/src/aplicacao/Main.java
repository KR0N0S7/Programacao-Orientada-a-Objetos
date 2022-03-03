package aplicacao;

import java.time.LocalDate;

import municipe.ExcecaoNaoPodeSerNulo;
import municipe.ExcecaoTamanhoNaoPermitido;
import municipe.Municipe;
import municipe.Problema;
import municipio.Regiao;

public class Main {

	public static void main(String[] args) {

		try {
			Regiao r1 = new Regiao("Mogi das Cruzes");
			
			Municipe m1 = new Municipe("Rog�rio", "01234556777", "Avenida S�o Paulo");
			System.out.println(m1.toString());
			Problema p1 = new Problema(m1, r1, "Rua  Jap�o", LocalDate.now());
			m1.addProblema(p1);
			System.out.println(p1.toString());
			Problema p2 = new Problema(m1, r1, "Rua  S�o Judas", LocalDate.now());
			m1.addProblema(p2);
			System.out.println(p2.toString());
			System.out.println(m1.getProblemas());
			
			
			
			
			
		} catch (ExcecaoNaoPodeSerNulo | ExcecaoTamanhoNaoPermitido e) {
			System.out.println(e.getMessage());
		} 
			
	}

}
