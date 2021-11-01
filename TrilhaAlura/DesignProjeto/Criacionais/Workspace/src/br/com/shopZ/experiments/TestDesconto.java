package br.com.shopZ.experiments;

import br.com.shopZ.Orcamento;
import br.com.shopZ.descontos.CalculadoraDeDescontos;

import java.math.BigDecimal;

public class TestDesconto {

    public static void run() {

        //Calculadora de desconto implementando Chain Of Responsibility
        Orcamento orcamento = new Orcamento(new BigDecimal("10000"), 7);
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

        System.out.printf("\nDesconto calculado para o orçamento (R$%.2f): R$%.2f \n",
                orcamento.getValor(), calculadora.calcular(orcamento));

    }

}