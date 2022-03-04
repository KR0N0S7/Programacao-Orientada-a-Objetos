package funcionario;

import java.time.LocalDate;

import municipe.ExcecaoNaoPodeSerNulo;
import municipe.RecursoNotificacao;

public class AutoNotificacao {

	private String nomeProprietario;
	private String enderecoPropriedade;
	private LocalDate dataEmissao;
	private RecursoNotificacao recurso;
	private FuncionarioFiscalizador fiscal;
	
	public AutoNotificacao(String nomeProprietario, String enderecoPropriedade,
			LocalDate dataEmissao, FuncionarioFiscalizador fiscal) throws ExcecaoNaoPodeSerNulo {
		setNomeProprietario(nomeProprietario);
		this.enderecoPropriedade = enderecoPropriedade;
		this.dataEmissao = dataEmissao;
		this.fiscal = fiscal;
	}

	public String getNomeProprietario() {	return nomeProprietario;	}
	public void setNomeProprietario(String nomeProprietario) throws ExcecaoNaoPodeSerNulo {	
		if(null == nomeProprietario) throw new ExcecaoNaoPodeSerNulo("Favor, entrar com um nome.");
		this.nomeProprietario = nomeProprietario;	
	}

	public String getEnderecoPropriedade() {	return enderecoPropriedade;	}
	public void setEnderecoPropriedade(String enderecoPropriedade) {	this.enderecoPropriedade = enderecoPropriedade;	}

	public LocalDate getDataEmissao() {		return dataEmissao;	}
	public void setDataEmissao(LocalDate dataEmissao) {		this.dataEmissao = dataEmissao;	}

	public RecursoNotificacao getRecurso() {	return recurso;	}
	public void setRecurso(RecursoNotificacao recurso) {		this.recurso = recurso;	}

	public FuncionarioFiscalizador getFiscal() {	return fiscal;	}
	public void setFiscal(FuncionarioFiscalizador fiscal) throws ExcecaoNaoPodeSerNulo {
		if(null == fiscal) throw new ExcecaoNaoPodeSerNulo("Entrar com o nome do fiscal responsável.");
		this.fiscal = fiscal;	
	}
	
	
	
	
}
