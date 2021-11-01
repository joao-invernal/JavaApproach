package br.com.shopZ.descontos;

import br.com.shopZ.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto{

    public SemDesconto() {
        super(null);
    }


    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean seAplica(Orcamento orcamento) {
        return true;
    }
}