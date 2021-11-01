package br.com.shopZ.situacao;

import br.com.shopZ.exceptions.DomainException;
import br.com.shopZ.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends EstadoOrcamentario{

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal(".05"));
    }

    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }

}