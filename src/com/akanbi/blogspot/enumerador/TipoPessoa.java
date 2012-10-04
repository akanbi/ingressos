package com.akanbi.blogspot.enumerador;

public enum TipoPessoa {
	
	CRIANCA(1, "crianca"),
	IDOSO(2, "idoso"),
	ESTUDANTE(3, "estudante");
	
	private TipoPessoa() {

	}
	
	private TipoPessoa(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	
	private int id;
	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}
	
	public int getId() {
		return id;
	}
}
