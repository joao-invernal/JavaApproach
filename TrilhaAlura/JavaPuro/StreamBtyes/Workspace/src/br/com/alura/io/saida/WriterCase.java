package br.com.alura.io.saida;

import java.io.*;

public class WriterCase {

    public static void main(TopLevelWriter[] args) throws IOException {


        FileOutputStream fos = new FileOutputStream("AutoType");

        OutputStreamWriter osw = new OutputStreamWriter(fos);

        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Conexão verdadeiramente é algo mais profundo que por sua complexidade não conseguimos " +
                "exalar toda à sua completude com fidelidade à autenticidade da mensagem.");
        bw.newLine();
        bw.write("O que por vezes, no entanto, artistas consegue retratar com bastante clareza, " +
                "de uma perspectiva bastante poética um vislumbre nessa realidade mais distante... ");



        bw.close();

    }

}
