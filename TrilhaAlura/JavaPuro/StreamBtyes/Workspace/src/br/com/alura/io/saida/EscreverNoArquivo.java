package br.com.alura.io.saida;

import br.com.alura.io.saida.TopLevelWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscreverNoArquivo {

    public static void main(TopLevelWriter[] args) throws IOException {

        //Esse tipo de Write é o mais pragmático para a saída à arquivos
        FileWriter escritorDeArquivo;

        //Definindo o nome do file que será criado:
        escritorDeArquivo = new FileWriter("ExternalWriter.txt");

        //Setting the title (First line in the file)
        escritorDeArquivo.write("O amor é fogo que arde sem se ver!");

        //OBS: O Write não tem o método newLine que um BufferedWirte possui.
        escritorDeArquivo.write("\n"); // Uma forma de gerar um nova linha
        escritorDeArquivo.write("Isto não é romântismo, embora poético ");
        escritorDeArquivo.write(System.lineSeparator()); // Outra forma de fazer a quebra de linha
        escritorDeArquivo.write("é um relato de uma perspectiva um pouco mais refinada.");

        //Encapsulando o FileWrite no BufferedWriter para poder obter esse método de mais alto nível

        BufferedWriter bufferedWriter = new BufferedWriter(escritorDeArquivo);

        bufferedWriter.newLine();
        bufferedWriter.write("Para além do atual compreensão humana");
        bufferedWriter.newLine();
        bufferedWriter.write("existe muitas coisas \"Por baixo dos panos\" ");

        bufferedWriter.close();
        escritorDeArquivo.close();





    }

}
