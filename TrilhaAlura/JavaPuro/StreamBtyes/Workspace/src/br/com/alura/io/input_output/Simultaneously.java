package br.com.alura.io.input_output;

import br.com.alura.io.saida.TopLevelWriter;

import java.io.*;

public class Simultaneously {

    public static void main(TopLevelWriter[] args) throws IOException {

        //Fluxo de entrada com arquivos

        InputStream fis = new FileInputStream("AutoType");

        Reader isr = new InputStreamReader(fis);

        BufferedReader br = new BufferedReader(isr);


        //Mais dados...
        FileInputStream fileInput = new FileInputStream("enredo.txt"); // armazenamento dos dados transmitidos

        InputStreamReader leitorFluxoEntrada = new InputStreamReader(fileInput); // Conversão (dos dados) de bytes para caracteres

        BufferedReader br2 = new BufferedReader(leitorFluxoEntrada); // Consolidação dos caracteres por linha



        //Preparando o fluxo de saída:
        FileOutputStream fos = new FileOutputStream("AutotypeRedigido");

        Writer osw = new OutputStreamWriter(fos);

        BufferedWriter bw = new BufferedWriter(osw);



        String linha = br.readLine();
        String linha2 = br2.readLine();

        while(linha2 != null) {
            bw.write(linha2);
            bw.newLine();
            linha2 =br2.readLine();
        }

        while(linha != null) {
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }

        br.close();
        br2.close();
        bw.close();
        
        






    }

}
