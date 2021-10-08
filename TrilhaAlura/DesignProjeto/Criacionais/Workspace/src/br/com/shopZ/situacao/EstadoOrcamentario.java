package br.com.shopZ.situacao;

import br.com.shopZ.exceptions.DomainException;
import br.com.shopZ.Orcamento;

import java.math.BigDecimal;

public abstract class EstadoOrcamentario {


    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) {
        throw new DomainException("Dado o estado atual, a situação não pode ser aprovada!");
    }

    public void reprovar(Orcamento orcamento) {
        throw new DomainException("Dado o estado atual, a situação não pode ser reprovada!");
    }
    public void finalizar(Orcamento orcamento) {
        throw new DomainException("Dado o estado atual, a situação não pode ser finalizada!");
    }


}