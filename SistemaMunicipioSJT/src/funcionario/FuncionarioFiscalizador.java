package funcionario;

import java.util.ArrayList;
import java.util.List;

import municipio.Prova;
import municipio.Regiao;

public class FuncionarioFiscalizador {

	private String nome;
	private String cpf;
	private String endereco;
	private Regiao regiao;
	private List<Prova> provas = new ArrayList<>();
	private AutoNotificacao auto;
	
	public FuncionarioFiscalizador(String nome, String cpf, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	public void addProva(Prova obj) {
		provas.add(obj);
	}

	public void removeProva(Prova obj) {
		provas.remove(obj);
	}

	public int countProvas() {
		return provas.size();
	}

	public Prova getProvaAt(int i) {
		return provas.get(i);
	}

	public void cadastrarFuncionario() {
		
	}
	
	public void gerarAutoNotificacao() {
		
	}
}
