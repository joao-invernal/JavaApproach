package br.com.shopZ.descontos;

import br.com.shopZ.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento){

        Desconto desconto = new DiscountForMoreThan5Items(
                new DiscountForValuesAbove500(
                        new SemDesconto() ) );

        return desconto.calcular(orcamento);

    }

}