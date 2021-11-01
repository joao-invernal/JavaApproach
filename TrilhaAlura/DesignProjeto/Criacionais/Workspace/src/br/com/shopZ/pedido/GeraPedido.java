package br.com.shopZ.pedido;

import br.com.shopZ.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {

    private String cliente;
    private BigDecimal valorOrcamentario;
    private int QtdeItens;



    public GeraPedido(String cliente, BigDecimal valorOrcamentario, int qtdeItens) {
        this.cliente = cliente;
        this.valorOrcamentario = valorOrcamentario;
        QtdeItens = qtdeItens;
    }


    public void execute() {

        Orcamento orcamento = new Orcamento(this.valorOrcamentario, this.QtdeItens);
        LocalDateTime data = LocalDateTime.now();

        Pedido pedido = new Pedido(cliente, data, orcamento);

        System.out.println("Salvar pedido no Banco de Dados");
        System.out.println("Enviar e-mail confirmando o recebimento de pedido.");

    }

}