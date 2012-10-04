package com.akanbi.blogspot.utilitario;

import java.text.DecimalFormat;

public class Utilitario {
	
	public static double formatarCasasDecimais(double resultado) {
		DecimalFormat formatador = new DecimalFormat("0.00");
		String retorno = formatador.format(resultado);
		String[] parte = retorno.split("[,]");  
		String valorFormatado = parte[0]+"."+parte[1]; 
		double valorFormatadoFinal = Double.parseDouble(valorFormatado);
		return valorFormatadoFinal;
	}
	
}
