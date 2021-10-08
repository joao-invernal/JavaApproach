package br.com.shopZ.descontos;

import br.com.shopZ.Orcamento;

import java.math.BigDecimal;

public class DiscountForValuesAbove500 extends Desconto{

    public DiscountForValuesAbove500(Desconto proximo) {
        super(proximo);
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {

        return orcamento.getValor().multiply(new BigDecimal(".05"));

        //orcamento.getValor().compareTo(new BigDecimal("500")));
        //O método acima retorno número positivo se o primeiro argumento for mair que o segundo
    }

    @Override
    public boolean seAplica(Orcamento orcamento) {
        return (orcamento.getValor().compareTo(new BigDecimal("500")) > 0);
    }
}