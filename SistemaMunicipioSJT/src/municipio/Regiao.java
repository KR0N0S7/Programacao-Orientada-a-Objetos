package municipio;

import java.util.ArrayList;
import java.util.List;

import funcionario.FuncionarioFiscalizador;
import municipe.Problema;

public class Regiao {

	private String nome;
	private List<Problema> problemas = new ArrayList<>();
	private List<Prova> provas = new ArrayList<>();
	private List<FuncionarioFiscalizador> fiscais = new ArrayList<>();
	
	public Regiao(String nome) {
		this.nome = nome;
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
	
	public void addFuncionarioFiscalizador(FuncionarioFiscalizador obj) {
		fiscais.add(obj);
	}

	public void removeFuncionarioFiscalizador(FuncionarioFiscalizador obj) {
		fiscais.remove(obj);
	}

	public int countFiscais() {
		return fiscais.size();
	}

	public FuncionarioFiscalizador getFuncionarioFiscalizadorAt(int i) {
		return fiscais.get(i);
	}
	
	public void registrarProva() {
		
	}
}
