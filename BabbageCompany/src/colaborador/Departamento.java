package colaborador;

import java.util.List;

public class Departamento {

	private String nome;
	List<Funcionario> funcionarios;

	public Departamento(String nome, List<Funcionario> funcionarios) {
		this.nome = nome;
		this.funcionarios = funcionarios;
	}
	
	public String getNome() {	return nome;	}
	public void setNome(String nome) {		this.nome = nome;	}

	public List<Funcionario> getFuncionarios() {	return funcionarios;	}
	public void setFuncionarios(List<Funcionario> funcionarios) {	this.funcionarios = funcionarios;	}

	@Override
	public String toString() {
		return nome;
	}
	
		
}
