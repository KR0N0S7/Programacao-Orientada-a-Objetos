package municipe;

import java.time.LocalDate;

public class Problema {

	private String nomeRequerente;
	private String endereco;
	private LocalDate data;
	private Municipe municipe;
	
	public Problema(String nomeRequerente, String endereco, LocalDate data) {
		this.nomeRequerente = nomeRequerente;
		this.endereco = endereco;
		this.data = data;
	}
	
	
}
