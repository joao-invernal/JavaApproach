package br.com.shopZ.experiments;

import br.com.shopZ.Orcamento;
import br.com.shopZ.pedido.GeraPedido;
import br.com.shopZ.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PedidosByCLI {

    //Aqui séria uma representação de uma interface com o usuário por linhas de comandos.
    public static void main(String[] args) {

        //Argumentando os parâmetro de entrada.

        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int qtdeItens = Integer.parseInt(args[2]);

        //OBS: Os argumentos inseridos para executar a simulação estão encorpados na configuração de
        //execução do IntelliJ

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, qtdeItens);
        gerador.execute();

    }

}