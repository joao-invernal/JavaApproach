package br.com.shopZ.tarifas;

import br.com.shopZ.Orcamento;
import br.com.shopZ.tarifas.Imposto;

import java.math.BigDecimal;

public class ISS implements Imposto {


    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal(".06").setScale(2));
    }
}