package com.akanbi.blogspot.pojo;

import com.akanbi.blogspot.enumerador.DiasDaSemana;
import com.akanbi.blogspot.utilitario.Utilitario;

public class Crianca extends Pessoa{
	
	public Crianca() {
		super();
	}
	
	public double calcularIngressoCrianca(Pessoa pessoa, DiasDaSemana diaDaSemana) {
		double resultado = pessoa.getValor();
		switch (diaDaSemana) {
			case SEGUNDA:
				resultado = pessoa.getValor() - (0.10 * pessoa.getValor());
				break;
			case TERCA:
				resultado = pessoa.getValor() - (0.15 * pessoa.getValor());
				break;
			case QUARTA:
				resultado = pessoa.getValor() - (0.30 * pessoa.getValor());
				break;
			case SEXTA:
				resultado = pessoa.getValor() - (0.11 * pessoa.getValor());
				break;
			default: 
				resultado = pessoa.getValor();
				break;
		}
		resultado = Utilitario.formatarCasasDecimais(resultado);
		return resultado;
	}
	
}
