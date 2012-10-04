package com.akanbi.blogspot.teste;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.akanbi.blogspot.enumerador.DiasDaSemana;
import com.akanbi.blogspot.enumerador.TipoPessoa;
import com.akanbi.blogspot.pojo.Idoso;
import com.akanbi.blogspot.pojo.Pessoa;

public class IdosoTeste {
	
	private Pessoa idoso;
	
	@Before
	public void setUp() throws Exception {
		idoso = new Idoso();
		idoso.setTipo(TipoPessoa.IDOSO);
		idoso.setValor(6.00);
	}

	@After
	public void tearDown() throws Exception {
		idoso = null;
	}
	
	@Test
	public void testarCalculoDoIngressoSegundaFeiraIdoso() {
		double valor = ((Idoso)idoso).calcularIngressoIdoso(idoso, DiasDaSemana.SEGUNDA);
		Assert.assertNotNull(valor);
		Assert.assertEquals(5.4, valor);
	}
	
	@Test
	public void testarCalculoDoIngressoTercaFeiraIdoso() {
		double valor = ((Idoso)idoso).calcularIngressoIdoso(idoso, DiasDaSemana.TERCA);
		Assert.assertNotNull(valor);
		Assert.assertEquals(5.1, valor);
	}
	
	@Test
	public void testarCalculoDoIngressoQuartaFeiraIdoso() {
		double valor = ((Idoso)idoso).calcularIngressoIdoso(idoso, DiasDaSemana.QUARTA);
		Assert.assertNotNull(valor);
		Assert.assertEquals(3.6, valor);
	}
	
	@Test
	public void testarCalculoDoIngressoQuintaFeiraIdoso() {
		double valor = ((Idoso)idoso).calcularIngressoIdoso(idoso, DiasDaSemana.QUINTA);
		Assert.assertNotNull(valor);
		Assert.assertEquals(4.2, valor);
	}
	
	public void testarCalculoDoIngressoSextaFeiraIdoso() {
		double valor = ((Idoso)idoso).calcularIngressoIdoso(idoso, DiasDaSemana.SEXTA);
		Assert.assertNotNull(valor);
		Assert.assertEquals(6.0, valor);
	}
	
	@Test
	public void testarCalculoDoIngressoFinalDeSemanaIdoso() {
		double valor = ((Idoso)idoso).calcularIngressoIdoso(idoso, DiasDaSemana.FINALSEMANAFERIADO);
		Assert.assertNotNull(valor);
		Assert.assertEquals(5.7, valor);
	}
	
}
