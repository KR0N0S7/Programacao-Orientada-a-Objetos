package colaborador;

public class Empreitada extends Funcionario {
	
	private String tipo = "Empreitada";
	private Trabalho trabalho;
	
	public Empreitada(String cpf, String nome, Departamento departamento, Trabalho trabalho) {
		super(cpf, nome, departamento);
		this.trabalho = trabalho;
		calculoPagamento(trabalho);
	}
	
	public Trabalho getTrabalho() {		return trabalho;	}
	public void setTrabalho(Trabalho trabalho) {	this.trabalho = trabalho;	}

	public double calculoPagamento(Trabalho trabalho) {
		switch(trabalho) {
			case CONSERTO_DE_BANHEIRO: return 2000.00d;
			case CONSERTO_QUARTO: return 7300.50d;
			case CONSERTO_COZINHA: return 5960.75d;
			default: return 1000d;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + tipo + ", Pagamento: " + (calculoPagamento(trabalho) + bonus(departamento)) + ", " + getTrabalho() + "]";
	}
}
