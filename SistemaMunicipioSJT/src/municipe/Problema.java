package municipe;

import java.time.LocalDate;

import municipio.Regiao;

public class Problema {

	private Municipe municipe;
	private Regiao regiao;
	private String endereco;
	private LocalDate data;
		
	public Problema() {}
	
	public Problema(Municipe municipe, Regiao regiao, String endereco, LocalDate data) {
		this.municipe = municipe;
		this.regiao = regiao;
		this.endereco = endereco;
		this.data = data;
	}

	public Municipe getMunicipe() {	return municipe;}
	public void setMunicipe(Municipe municipe) {	this.municipe = municipe;	}

	public Regiao getRegiao() {		return regiao;	}
	public void setRegiao(Regiao regiao) {	this.regiao = regiao;	}

	public String getEndereco() {	return endereco;	}
	public void setEndereco(String endereco) {	this.endereco = endereco;	}

	public LocalDate getData() {	return data;	}
	public void setData(LocalDate data) {	this.data = data;	}

	@Override
	public String toString() {
		return "Problema [Municipe: " + municipe + ", Regiao: " + regiao + ", Endereco: " + endereco + ", Data: " + data
				+ "]";
	}

	
	
}
