package com.akanbi.blogspot.teste;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.akanbi.blogspot.enumerador.DiasDaSemana;
import com.akanbi.blogspot.enumerador.TipoPessoa;
import com.akanbi.blogspot.pojo.Crianca;
import com.akanbi.blogspot.pojo.Pessoa;

public class CriancaTeste {
	private Pessoa crianca;
	
	@Before
	public void setUp() throws Exception {
		crianca = new Crianca();
		crianca.setTipo(TipoPessoa.CRIANCA);
		crianca.setValor(5.50);
	}

	@After
	public void tearDown() throws Exception {
		crianca = null;
	}
	
	@Test
	public void testarCalculoDoIngressoSegundaFeiraCrianca() {
		double valor = ((Crianca) crianca).calcularIngressoCrianca(crianca, DiasDaSemana.SEGUNDA);
		Assert.assertNotNull(valor);
		Assert.assertEquals(4.95, valor);
	}
	
	@Test
	public void testarCalculoDoIngressoTercaFeiraCrianca() {
		double valor = ((Crianca)crianca).calcularIngressoCrianca(crianca, DiasDaSemana.TERCA);
		Assert.assertNotNull(valor);
		Assert.assertEquals(4.68, valor);
	}
	
	@Test
	public void testarCalculoDoIngressoQuartaFeiraCrianca() {
		double valor = ((Crianca)crianca).calcularIngressoCrianca(crianca, DiasDaSemana.QUARTA);
		Assert.assertNotNull(valor);
		Assert.assertEquals(3.85, valor);
	}
	
	@Test
	public void testarCalculoDoIngressoQuintaFeiraCrianca() {
		double valor = ((Crianca)crianca).calcularIngressoCrianca(crianca, DiasDaSemana.QUINTA);
		Assert.assertNotNull(valor);
		Assert.assertEquals(5.5, valor);
	}
	
	@Test
	public void testarCalculoDoIngressoSextaFeiraCrianca() {
		double valor = ((Crianca)crianca).calcularIngressoCrianca(crianca, DiasDaSemana.SEXTA);
		Assert.assertNotNull(valor);
		Assert.assertEquals(4.9, valor);
	}
	
	@Test
	public void testarCalculoDoIngressoFinalDeSemanaCrianca() {
		double valor = ((Crianca)crianca).calcularIngressoCrianca(crianca, DiasDaSemana.FINALSEMANAFERIADO);
		Assert.assertNotNull(valor);
		Assert.assertEquals(5.5, valor);
	}
}