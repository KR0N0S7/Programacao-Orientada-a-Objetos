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

	public String getFuncionarioResponsavel() {	return funcionarioResponsavel;	}
	public void setFuncionarioResponsavel(String funcionarioResponsavel) {	this.funcionarioResponsavel = funcionarioResponsavel;	}

	public LocalDate getData() {	return data;	}
	public void setData(LocalDate data) {	this.data = data;	}
	
	public Regiao getRegiao() {	return regiao;	}	
	public void setRegiao(Regiao regiao) {	this.regiao = regiao;	}
	
	
	
}
