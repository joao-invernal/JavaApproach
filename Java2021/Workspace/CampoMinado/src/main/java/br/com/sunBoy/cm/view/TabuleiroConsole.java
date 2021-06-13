package br.com.sunBoy.cm.view;

import br.com.sunBoy.cm.excecao.ExplosaoException;
import br.com.sunBoy.cm.excecao.SairException;
import br.com.sunBoy.cm.modelo.Tabuleiro;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class TabuleiroConsole {

    Tabuleiro tabuleiro;
    private Scanner leitura = new Scanner(System.in);

    public TabuleiroConsole(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;

        executarJogo();
    }

    private void executarJogo() {
        try {

            boolean continuar = true;

            while(continuar) {
                cicloDoJogo();
                System.out.println("Outra partida? (S/n) ");
                String resposta = leitura.nextLine();

                if(resposta.equalsIgnoreCase("n")) {
                    continuar = false;
                } else {
                    tabuleiro.reset();
                }
            }

        } catch (SairException e) {
            System.out.println("Tchau!!");
        } finally { leitura.close();}

    }

    private void cicloDoJogo() {

        try {
            while (!tabuleiro.tabuleiroRevelado() ) {
                System.out.println(tabuleiro);

                String digitado = capturarValorDigitado("Digita as coordenadas [x/y]: ");

                Iterator<Integer> xy = Arrays.stream( digitado.split(","))
                                             .map(e -> Integer.parseInt(e.trim()))
                                             .iterator(); // Método das Streams para trabalhar com Iterator

                digitado = capturarValorDigitado("1 - Abrir ou 2 - Marcar/Desmarcar? ");

                if(digitado.equals("1")) {
                    tabuleiro.open(xy.next(), xy.next());
                } else if (digitado.equals("2")) {
                    tabuleiro.markedAlternative(xy.next(), xy.next());
                }
            }

            System.out.println("=-=-=-=-=-You are Winner!!=-=-=-=-=-");
            System.out.println("\nReveleção do tabuleiro mapeado: ");
            System.out.println(tabuleiro);
            System.out.println();
        } catch (ExplosaoException e) {
            System.out.println(tabuleiro);
            System.out.println("GAMER OVER");
        }

    }

    private String capturarValorDigitado(String texto) {
        System.out.print(texto);
        String digitado = leitura.nextLine();

        if("sair".equalsIgnoreCase(digitado)) {
            throw new SairException();
        }

        return digitado;
    }

}
