package funcionario;

import java.util.ArrayList;
import java.util.List;

import municipe.ExcecaoNaoPodeSerNulo;
import municipe.ExcecaoTamanhoNaoPermitido;
import municipio.Prova;
import municipio.Regiao;

public class FuncionarioFiscalizador {

	private static final int NUMERO_DO_CPF = 11;
	private String nome;
	private String cpf;
	private String endereco;
	private Regiao regiao;
	private List<Prova> provas = new ArrayList<>();
	private List<AutoNotificacao> autos = new ArrayList<>();
	
	public FuncionarioFiscalizador(String nome, String cpf, String endereco) throws ExcecaoNaoPodeSerNulo, ExcecaoTamanhoNaoPermitido {
		setNome(nome);
		setCpf(cpf);
		this.endereco = endereco;
	}
	
	public String getNome() {	return nome;	}
	public void setNome(String nome) throws ExcecaoNaoPodeSerNulo {	
		if(null == nome) throw new ExcecaoNaoPodeSerNulo("O nome não pode ser nulo.");
		this.nome = nome;	
	}

	public String getCpf() {	return cpf;	}
	public void setCpf(String cpf) throws ExcecaoTamanhoNaoPermitido {
		if(cpf.length() != NUMERO_DO_CPF) throw new ExcecaoTamanhoNaoPermitido("O CPF  deve conter " + NUMERO_DO_CPF + " dígitos.");
		this.cpf = cpf;	
	}

	public String getEndereco() {	return endereco;	}
	public void setEndereco(String endereco) {	this.endereco = endereco;	}

	public List<Prova> getProvas() {	return provas;	}
	public void setProvas(List<Prova> provas) {		this.provas = provas;	}

	public List<AutoNotificacao> getAutos() {	return autos;	}
	public void setAutos(List<AutoNotificacao> autos) {	this.autos = autos;	}

	public void addProva(Prova obj) {	provas.add(obj);	}
	public void removeProva(Prova obj) {	provas.remove(obj);	}
	
	public Regiao getRegiao() {	return regiao;	}
	public void setRegiao(Regiao regiao) {	this.regiao = regiao;	}

	public int countProvas() {
		return provas.size();
	}

	public Prova getProvaAt(int i) {
		return provas.get(i);
	}
	
	public void addAutoNotificacao(AutoNotificacao obj) {
		autos.add(obj);
	}

	public void removeAutoNotificacao(AutoNotificacao obj) {
		autos.remove(obj);
	}

	public int countAutos() {
		return autos.size();
	}

	public AutoNotificacao getAutoNotificacaoAt(int i) {
		return autos.get(i);
	}
	
}
