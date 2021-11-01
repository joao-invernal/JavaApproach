package br.com.shopZ;

import br.com.shopZ.situacao.EmAnalise;
import br.com.shopZ.situacao.EstadoOrcamentario;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int qtdeItens;
    private EstadoOrcamentario situacao;

    public Orcamento(BigDecimal valor, int qtdeItens) {
        this.valor = valor;
        this.qtdeItens = qtdeItens;
        this.situacao = new EmAnalise();
    }




    //Métodos do desconto extra
    public void aplicarDescontoExtra() {
        BigDecimal valorDesconto = this.situacao.calcularValorDescontoExtra(this);

        this.valor = this.valor.subtract(valorDesconto);
    }

    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }
    public void finalizar() {
        this.situacao.finalizar(this);
    }


    //Métodos do desconto extra - FIM




    public BigDecimal getValor() {
        return valor;
    }

    public int getQtdeItens() {
        return qtdeItens;
    }

    public void setSituacao(EstadoOrcamentario novoEstadoOrcamentario) {
        situacao = novoEstadoOrcamentario;
    }

    public EstadoOrcamentario getSituacao() {
        return situacao;
    }
}