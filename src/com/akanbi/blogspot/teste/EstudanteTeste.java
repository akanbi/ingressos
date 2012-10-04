package com.akanbi.blogspot.teste;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.akanbi.blogspot.enumerador.DiasDaSemana;
import com.akanbi.blogspot.enumerador.TipoPessoa;
import com.akanbi.blogspot.pojo.Estudante;
import com.akanbi.blogspot.pojo.Pessoa;

public class EstudanteTeste {
	
	private Pessoa estudante;
	
	@Before
	public void setUp() throws Exception {
		estudante = new Estudante();
		estudante.setTipo(TipoPessoa.ESTUDANTE);
		estudante.setValor(8.00);
	}

	@After
	public void tearDown() throws Exception {
		estudante = null;
	}
	
	@Test
	public void testarCalculoDoIngressoSegundaFeiraEstudante() {
		double valor = ((Estudante)estudante).calcularIngressoEstudante(estudante, DiasDaSemana.SEGUNDA);
		Assert.assertNotNull(valor);
		Assert.assertEquals(5.2, valor);
	}
	
	@Test
	public void testarCalculoDoIngressoTercaFeiraEstudante() {
		double valor = ((Estudante)estudante).calcularIngressoEstudante(estudante, DiasDaSemana.TERCA);
		Assert.assertNotNull(valor);
		Assert.assertEquals(5.2, valor);
	}
	
	@Test
	public void testarCalculoDoIngressoQuartaFeiraEstudante() {
		double valor = ((Estudante)estudante).calcularIngressoEstudante(estudante, DiasDaSemana.QUARTA);
		Assert.assertNotNull(valor);
		Assert.assertEquals(4.0, valor);
	}
	
	@Test
	public void testarCalculoDoIngressoQuintaFeiraEstudante() {
		double valor = ((Estudante)estudante).calcularIngressoEstudante(estudante, DiasDaSemana.QUINTA);
		Assert.assertNotNull(valor);
		Assert.assertEquals(5.2, valor);
	}
	
	@Test
	public void testarCalculoDoIngressoSextaFeiraEstudante() {
		double valor = ((Estudante)estudante).calcularIngressoEstudante(estudante, DiasDaSemana.SEXTA);
		Assert.assertNotNull(valor);
		Assert.assertEquals(5.2, valor);
	}
	
	@Test
	public void testarCalculoDoIngressoFinalDeSemanaEstudante() {
		double valor = ((Estudante)estudante).calcularIngressoEstudante(estudante, DiasDaSemana.FINALSEMANAFERIADO);
		Assert.assertNotNull(valor);
		Assert.assertEquals(8.0, valor);
	}
	
}
