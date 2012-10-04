package com.akanbi.blogspot.pojo;

import com.akanbi.blogspot.enumerador.TipoPessoa;

public class Pessoa {

	private TipoPessoa tipo;
	private double valor;

	public Pessoa() {
	}

	public TipoPessoa getTipo() {
		return tipo;
	}

	public void setTipo(TipoPessoa tipo) {
		this.tipo = tipo;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	} 
	
}
