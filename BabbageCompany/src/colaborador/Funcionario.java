package colaborador;

public abstract class Funcionario {

	private String  cpf;
	private String nome;
	protected Departamento departamento;
	
	public Funcionario(String cpf, String nome, Departamento departamento) {
		this.cpf = cpf;
		this.nome = nome;
		this.departamento = departamento;
	}
	
	public String getCpf() {	return cpf;	}
	public void setCpf(String cpf) {	this.cpf = cpf;	}

	public String getNome() {	return nome;	}
	public void setNome(String nome) {	this.nome = nome;	}
	
	public Departamento getDepartamento() {		return departamento;	}
	public void setDepartamento(Departamento departamento) {	this.departamento = departamento;	}

	public double calculoPagamento() {
		return 1200d;
	}
	
	public double bonus(Departamento departamento) {
		if(departamento.getNome().equals("Administração")) return 500d;
		else return 0;
	}

	@Override
	public String toString() {
		return "Funcionario [CPF: " + cpf + ", Nome: " + nome + ", Depto: " + departamento + ", ";
	}
}
