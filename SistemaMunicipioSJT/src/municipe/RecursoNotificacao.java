package municipe;

import java.time.LocalDate;

import funcionario.AutoNotificacao;

public class RecursoNotificacao {

	private LocalDate data;
	private AutoNotificacao auto;
	private String descricao;
	
	public RecursoNotificacao(LocalDate data, AutoNotificacao auto) {
		this.data = data;
		this.auto = auto;
	}

	public RecursoNotificacao(LocalDate data, AutoNotificacao auto, String descricao) {
		this.data = data;
		this.auto = auto;
		this.descricao = descricao;
	}

	public LocalDate getData() {	return data;	}
	public void setData(LocalDate data) {	this.data = data;	}

	public AutoNotificacao getAuto() {		return auto;	}
	public void setAuto(AutoNotificacao auto) {		this.auto = auto;	}
	
	public String getDescricao() {		return descricao;	}
	public void setDescricao(String descricao) {	this.descricao = descricao;	}
	
	
}
