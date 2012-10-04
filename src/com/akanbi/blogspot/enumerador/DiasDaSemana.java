package com.akanbi.blogspot.enumerador;

public enum DiasDaSemana {
	SEGUNDA(1),
	TERCA(2),
	QUARTA(3),
	QUINTA(4),
	SEXTA(5),
	FINALSEMANAFERIADO(6);
	
	private DiasDaSemana() {
	}
	
	private DiasDaSemana(int id) {
		this.id = id;
	}
	
	private int id;
	
	public int getId() {
		return id;
	}
}
