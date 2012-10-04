package com.akanbi.blogspot.pojo;

import com.akanbi.blogspot.enumerador.DiasDaSemana;
import com.akanbi.blogspot.utilitario.Utilitario;

public class Estudante extends Pessoa {
	
	public Estudante() {
		super();
	}
	
	public double calcularIngressoEstudante(Pessoa pessoa, DiasDaSemana diaDaSemana) {
		double resultado = pessoa.getValor();
		if(DiasDaSemana.QUARTA.getId() == diaDaSemana.getId()) {
			resultado = pessoa.getValor() - (0.50 * pessoa.getValor());
			resultado = Utilitario.formatarCasasDecimais(resultado);
		}
		if(ehDiaDaSemanaValido(diaDaSemana)) {
			resultado = calculaPorcentagem(pessoa.getValor());
		}
		return resultado;
	}
	
	private boolean ehDiaDaSemanaValido(DiasDaSemana diaDaSemana) {
		if(DiasDaSemana.SEGUNDA.getId() == diaDaSemana.getId() ||
				DiasDaSemana.TERCA.getId() == diaDaSemana.getId() ||
				DiasDaSemana.QUINTA.getId() == diaDaSemana.getId() ||
				DiasDaSemana.SEXTA.getId() == diaDaSemana.getId()) {
			return true;
		} else {
			return false;
		}
	}
	
	private double calculaPorcentagem(double valor) {
		double resultado = valor - (0.35 * valor);
		resultado = Utilitario.formatarCasasDecimais(resultado);
		return resultado;
	}
}
