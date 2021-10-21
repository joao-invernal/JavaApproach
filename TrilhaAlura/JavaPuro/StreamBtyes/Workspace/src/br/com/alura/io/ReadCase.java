package br.com.alura.io;

import java.io.*;

public class ReadCase {

    public static void main(TopLevelWriter[] args) throws IOException {

        FileInputStream fis = new FileInputStream("enredo.txt"); // armazenamento dos dados transmitidos
        System.out.println("Leitura de um byte de dados dessa fluxo de entrada: " + fis.read());

        InputStreamReader isr = new InputStreamReader(fis); // Conversão (dos dados) de bytes para caracteres
        System.out.println("\nLeitura individual de caracteres: " + isr.read());

        BufferedReader br = new BufferedReader(isr); // Consolidação dos caracteres por linha

        System.out.println("\nEfinalmente...Texto caracterizado: ");
        String linha = br.readLine();

        while (linha !=  null) {
            System.out.println(linha);
            linha = br.readLine(); // Consequentemente a leitura será da próxima linha do arquivo.
            // se não existe próxima linha, o valor será null. [interrompendo a execução desse laço]
        }



        br.close();
    }
}
