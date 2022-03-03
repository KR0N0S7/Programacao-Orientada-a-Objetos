package municipe;

import java.util.ArrayList;
import java.util.List;

public class Municipe {

	private static final int NUMERO_DO_CPF = 11;
	private String nome;
	private String cpf;
	private String endereco;
	private List<Problema> problemas = new ArrayList<>();
	private List<RecursoNotificacao> recursos = new ArrayList<>();
	
	public Municipe(String nome, String cpf, String endereco) throws ExcecaoNaoPodeSerNulo, ExcecaoTamanhoNaoPermitido {
		setNome(nome);
		setCpf(cpf);
		this.endereco = endereco;
	}
	
	public void addProblema(Problema obj) {
		problemas.add(obj);
	}

	public void removeProblema(Problema obj) {
		problemas.remove(obj);
	}

	public int countProblemas() {
		return problemas.size();
	}

	public Problema getProblemaAt(int i) {
		return problemas.get(i);
	}
	
	public void addRecursoNotificacao(RecursoNotificacao obj) {
		recursos.add(obj);
	}

	public void removeRecursoNotificacao(RecursoNotificacao obj) {
		recursos.remove(obj);
	}

	public int countRecursos() {
		return recursos.size();
	}

	public RecursoNotificacao getRecursoNotificacaoAt(int i) {
		return recursos.get(i);
	}
	
	public String getNome() {	return nome;	}
	public void setNome(String nome) throws ExcecaoNaoPodeSerNulo {	
		if(null == nome) throw new ExcecaoNaoPodeSerNulo("O nome não pode ser nulo.");
		this.nome = nome;	
	}

	public String getCpf() {	return cpf;	}
	public void setCpf(String cpf) throws  ExcecaoTamanhoNaoPermitido {
		if(cpf.length() != NUMERO_DO_CPF) throw  new ExcecaoTamanhoNaoPermitido("O CPF  deve conter " + NUMERO_DO_CPF + " dígitos.");
		this.cpf = cpf;	
	}

	public String getEndereco() {	return endereco;	}
	public void setEndereco(String endereco) {		this.endereco = endereco;	}

	public List<Problema> getProblemas() {	return problemas;	}
	public void setProblemas(List<Problema> problemas) {	this.problemas = problemas;	}

	public List<RecursoNotificacao> getRecursos() {	return recursos;	}
	public void setRecursos(List<RecursoNotificacao> recursos) {	this.recursos = recursos;	}

	@Override
	public String toString() {
		return "Municipe [Nome: " + nome + ", CPF:" + cpf + ", Endereco: " + endereco + "]";
	}
	
	public void cadastrarRecurso() {
		
	}
}
