package br.com.shopZ.situacao;

import br.com.shopZ.Orcamento;

import java.math.BigDecimal;

//Classe implementado o design StatePattern
public class EmAnalise extends EstadoOrcamentario {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal(".02"));
    }

    public void aprovar(Orcamento orcamento) {
        orcamento.setSituacao(new Aprovado());
    }

    public void reprovar(Orcamento orcamento) {
        orcamento.setSituacao(new Reprovado());
    }

}