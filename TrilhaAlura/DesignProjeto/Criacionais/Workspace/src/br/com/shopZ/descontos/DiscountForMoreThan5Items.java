package br.com.shopZ.descontos;

import br.com.shopZ.Orcamento;

import java.math.BigDecimal;

public class DiscountForMoreThan5Items extends Desconto{

    public DiscountForMoreThan5Items(Desconto proximo) {
        super(proximo);
    }


    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean seAplica(Orcamento orcamento) {
        return (orcamento.getQtdeItens() > 5);
    }

}