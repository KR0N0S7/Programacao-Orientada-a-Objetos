package colaborador;

public class Mensalista extends Funcionario {

	private String tipo = "Mensalista";
	private String cargo;
	
	public Mensalista(String cpf, String nome, Departamento departamento, String cargo) {
		super(cpf, nome, departamento);
		this.cargo = cargo;
		calculoPagamento(cargo);
	}
	
	public String getCargo() {		return cargo;	}
	public void setCargo(String cargo) {	this.cargo = cargo;	}

	public double calculoPagamento(String cargo) {
			switch(cargo) {
			case "Programador Junior": return 3200.87d;
			case "Programador Pleno": return 5000.00d;
			case "Programador Senior": return 7500.90d;
			case "Diretor": return 128550.75d;
			case "Gerente Pleno": return 7000.00d;
			default: return 1600d;
		}
	}

	@Override
	public String toString() {
		return super.toString() + tipo + ", Pagamento: " + (calculoPagamento(cargo) + bonus(departamento)) + ", Salário de " + getCargo() + "]";
	}
	
	
}
