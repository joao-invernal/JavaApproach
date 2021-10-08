package br.com.shopZ.tarifas;

import br.com.shopZ.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);
}