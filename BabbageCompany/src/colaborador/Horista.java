package colaborador;

public class Horista extends Funcionario {

	private String tipo = "Horista";
	private int tempoTrabalho;
	private int valorHora;
	
	public Horista(String cpf, String nome, Departamento departamento,  int tempoTrabalho, int valorHora) {
		super(cpf, nome, departamento);
		this.tempoTrabalho = tempoTrabalho;
		this.valorHora = valorHora;
		calculoPagamento(tempoTrabalho);
	}

	public int getTempoTrabalho() {		return tempoTrabalho;	}
	public void setTempoTrabalho(int tempoTrabalho) {	this.tempoTrabalho = tempoTrabalho;	}

	public int getValorHora() {	return valorHora;	}
	public void setValorHora(int valorHora) {	this.valorHora = valorHora;	}

	public double calculoPagamento(int tempoTrabalho) {
		return getValorHora()*tempoTrabalho;
	}

	@Override
	public String toString() {
		return super.toString() + tipo + ", Pagamento: " + (calculoPagamento(tempoTrabalho) + bonus(departamento)) + ", " + tempoTrabalho + "(horas) * "
				+ valorHora + " (valor/hora)]";
	}
	
	
}
