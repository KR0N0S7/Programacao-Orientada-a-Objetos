package municipio;

import java.time.LocalDate;

public class Prova {

	private String funcionarioResponsavel;
	private LocalDate data;
	private Regiao regiao;
	
	public Prova(String funcionarioResponsavel, LocalDate data, Regiao regiao) {
		this.funcionarioResponsavel = funcionarioResponsavel;
		this.data = data;
		this.regiao = regiao;
	}
	
	
}
