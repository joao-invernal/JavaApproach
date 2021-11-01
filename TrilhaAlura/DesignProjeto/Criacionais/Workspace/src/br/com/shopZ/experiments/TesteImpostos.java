package br.com.shopZ.experiments;

import br.com.shopZ.Orcamento;
import br.com.shopZ.tarifas.CalculadoraImposto;
import br.com.shopZ.tarifas.ICMS;

import java.math.BigDecimal;

public class TesteImpostos {

    public static void run() {

// Código utilizado para realizar o teste da calculador de imposto
        Orcamento orcamento = new Orcamento(new BigDecimal("10000"), 1);
        CalculadoraImposto calculadora = new CalculadoraImposto();

        System.out.println("Imposto: R$" + calculadora.calcular(orcamento, new ICMS()));

    }

}
