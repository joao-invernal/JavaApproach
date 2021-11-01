package br.com.shopZ.situacao;

import br.com.shopZ.Orcamento;

import java.math.BigDecimal;

public class Reprovado extends EstadoOrcamentario {

    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}