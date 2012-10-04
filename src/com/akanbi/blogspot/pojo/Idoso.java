package com.akanbi.blogspot.pojo;

import com.akanbi.blogspot.enumerador.DiasDaSemana;
import com.akanbi.blogspot.utilitario.Utilitario;

public class Idoso extends Pessoa {
	
	public Idoso() {
		super();
	}
	
	public double calcularIngressoIdoso(Pessoa pessoa, DiasDaSemana diaDaSemana) {
		double resultado = pessoa.getValor();
		switch (diaDaSemana) {
			case SEGUNDA:
				resultado = pessoa.getValor() - (0.10 * pessoa.getValor());
				break;
			case TERCA:
				resultado = pessoa.getValor() - (0.15 * pessoa.getValor());
				break;
			case QUARTA:
				resultado = pessoa.getValor() - (0.40 * pessoa.getValor());
				break;
			case QUINTA:
				resultado = pessoa.getValor() - (0.30 * pessoa.getValor());
				break;
			case FINALSEMANAFERIADO:
				resultado = pessoa.getValor() - (0.05 * pessoa.getValor());
				break;
			default:
				resultado = pessoa.getValor();
				break;
		}
		resultado = Utilitario.formatarCasasDecimais(resultado);
		return resultado;
	}
	
}
