package br.com.alura.io;

import java.io.*;

public class MoreSreamData {

    public static void main(TopLevelWriter[] args) throws IOException {

        //Outras fluxo de transmissão de dados [ENTRADA/SAÍDA]

        InputStream inputStreamConsole = System.in; //new FileInputStream("AutoType");

        Reader leitorFluxoDeEntrada = new InputStreamReader(inputStreamConsole);

        BufferedReader bufferedReader = new BufferedReader(leitorFluxoDeEntrada);



        //Preparando o fluxo de saída:

        OutputStream outputStreamConsole = System.out; //FileOutputStream("RealTime.txt");

        Writer osw = new OutputStreamWriter(outputStreamConsole);

        BufferedWriter bw = new BufferedWriter(osw);



        String linha = bufferedReader.readLine();

        while(linha != null && !linha.isEmpty()) {
            bw.write(linha);
            bw.newLine();
            bw.flush();//Stream retorna devolta a entrada como saída assim que pressionar o enter com o recurso flush
            linha = bufferedReader.readLine();
        }

        bufferedReader.close();
        bw.close();

    }

}
