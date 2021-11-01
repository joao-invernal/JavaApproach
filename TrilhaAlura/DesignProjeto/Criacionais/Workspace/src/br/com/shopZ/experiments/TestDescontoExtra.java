package br.com.shopZ.experiments;

import br.com.shopZ.Orcamento;
import br.com.shopZ.descontos.CalculadoraDeDescontos;

import java.math.BigDecimal;

public class TestDescontoExtra {

    public static void run() {

        //testando a implementação do State
        Orcamento orcamento = new Orcamento(new BigDecimal("5000"), 5);

        System.out.println("Valor atual do orçamento: R$" + orcamento.getValor());

        /*
        //Aplicando com o desconto do estado EmAnalise
        orcamento.aplicarDescontoExtra();

        System.out.printf("Valor após o desconto extra: R$%.2f ",
                                                          orcamento.getValor());

        >> Valor após o desconto extra: R$4900,00

        ATENÇÃO com os estados, no caso de situações em analíse não podem ser finalizados.
        Se houver a tentativa de realizar essa mudança será acionada uma excpetion
        orcamento.finalizar(); <- Somente podem ser fianlizados estados na situação Reprovados e Aprovados
         */


        //Aplicando o desconto do estado Aprovado:
        orcamento.aprovar();
        orcamento.aplicarDescontoExtra();

        System.out.printf("Valor após o desconto extra: R$%.2f \n",
                orcamento.getValor());

        //...E finalmente finalizando:
        orcamento.finalizar();
        //Estados finalizados não possuem desconto, então aplicar o desconto desse estado é indiferente.
        orcamento.aplicarDescontoExtra();
        //System.out.println(orcamento.getValor()); -> Não surtira efeitos no valor.
    }



}