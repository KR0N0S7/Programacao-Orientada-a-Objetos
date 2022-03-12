package aplicacao;

import java.util.ArrayList;
import java.util.List;

import colaborador.Departamento;
import colaborador.Empreitada;
import colaborador.FolhaDePagamento;
import colaborador.Funcionario;
import colaborador.Horista;
import colaborador.Mensalista;
import colaborador.Trabalho;

public class Main {

	public static void main(String[] args) {

		List<Funcionario> rh = new ArrayList<>();
		List<Funcionario> administracao = new ArrayList<>();
		
		Departamento depto1 = new Departamento("RH", rh);		
		Departamento depto2 = new Departamento("Administração", administracao);
		
		Funcionario funcionario1 = new Horista("012.345.678-90", "João da Silva", depto1, 23, 100);
		Funcionario funcionario2 = new Horista("112.345.678-90", "Maria da Silva", depto1, 25, 100);
		Funcionario funcionario3 = new Mensalista("112.345.678-90", "Marcia da Silva", depto1, "Programador Pleno");
		Funcionario funcionario4 = new Empreitada("112.345.678-80", "Sérgio da Silva", depto1, Trabalho.CONSERTO_DE_BANHEIRO);
		Funcionario funcionario5 = new Empreitada("112.345.678-00", "Alex da Silva", depto2, Trabalho.CONSERTO_DE_BANHEIRO);
		Funcionario funcionario6 = new Mensalista("112.345.678-90", "Marco da Silva", depto2, "Gerente Pleno");
				
		rh.add(funcionario1);
		rh.add(funcionario2);
		rh.add(funcionario3);
		rh.add(funcionario4);		
		
		administracao.add(funcionario5);
		administracao.add(funcionario6);		
		
		System.out.println(FolhaDePagamento.gerarFolhaPagamento(funcionario1));
		System.out.println(FolhaDePagamento.gerarFolhaPagamento(funcionario2));
		System.out.println(FolhaDePagamento.gerarFolhaPagamento(funcionario3));
		System.out.println(FolhaDePagamento.gerarFolhaPagamento(funcionario4));
		System.out.println(FolhaDePagamento.gerarFolhaPagamento(funcionario5));
		System.out.println(FolhaDePagamento.gerarFolhaPagamento(funcionario6));
		
	}

}
