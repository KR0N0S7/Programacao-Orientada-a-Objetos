package municipe;

import java.util.ArrayList;
import java.util.List;

public class Municipe {

	private String nome;
	private String cpf;
	private String endereco;
	private List<Problema> problemas = new ArrayList<>();
	private List<RecursoNotificacao> recursos = new ArrayList<>();
	
	public Municipe(String nome, String cpf, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
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

	public void cadastrarMunicipe() {
		
	}
	
	public void cadastrarReclamacao() {
		
	}
}
