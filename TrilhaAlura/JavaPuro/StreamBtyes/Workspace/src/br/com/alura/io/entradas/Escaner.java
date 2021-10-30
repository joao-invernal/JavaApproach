package br.com.alura.io.entradas;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Escaner {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("fonte.csv"));

        while(scanner.hasNext()) {
            String linha = scanner.nextLine();

            //split vai dividir os elementos da linha utilizando como critério a expressão regular parâmetrizada
            //String[] linhaFatiada = linha.split(",");
            //A regular expression can be a character.


            //Scanner para analisar pontualmente cada linha.
            Scanner scannerLinha = new Scanner(linha);

            scannerLinha.useLocale(Locale.US);

            //Separação dos elementos dentro da linha:
            scannerLinha.useDelimiter(", ");

            //Atribuição de valores para suas respectiva variável
            String nome = scannerLinha.next();
            String esporte = scannerLinha.next();

            double altura = scannerLinha.nextDouble();

            //Se a localidade não fosse configurada para o padrão americano (linha 26), não séria possível
            //fazer a conversão imediata, conforme o código acima, sendo necessáro recorrer ao método
            //alternativo abaixo:

            //String altura = scannerLinha.next();
            //double floatingAltura = Double.parseDouble(altura);





            System.out.printf("\nAtleta: %s \nEsporte: %s \nAltura: %.2fm\n",
                    nome, esporte, altura);




        //Formatações de valores:

            //Definindo número de casas decimais [números com ponto flutuante]:

            double numeroFloatAleatorio = 3.14159265359;
            String numeroPreparado = String.format("%.2f", numeroFloatAleatorio);


            System.out.println("\nValor original: " + numeroFloatAleatorio);
            System.out.println("Representação formatada: " + numeroPreparado);

            //Nesse caso, após a formatação, já é feito uma adpatação do número para o padrão brasileiro.
                        //[Substituindo o . pela , para separar a casa decimal]
            //Mas se isso não fosse feito automaticamente, poderia ser inserido um Locale, para definir essa questão
            //Dessa forma:
            String numero2 = String.format(new Locale("us"),"%.2f", numeroFloatAleatorio);
            System.out.println("Representação formatada (padrão americano): " + numero2);



            //Definindo o tamanho de um String:
            String text = "Welcome, this is Brazil!";
            String textFormatted = String.format("%25s", text);

            System.out.println("\nTexto original (24 Caractres): " + text);
            System.out.println("Texto Formatado (com mais espaços) - 25 caracteres: " + textFormatted);

            //OBS: Se o texto estiver mais espaço do que o definido, o efeito será nulo.



            //Definindo o tamnho de números inteiros:
            int inteiro = 10;
            String inteiroFormatado = String.format("%5d", inteiro);
            String inteiroFormatadoComZeros = String.format("%05d", inteiro);

            System.out.println("\nnúmero Inteiro: " + inteiro);
            System.out.println("Número formatado: " + inteiroFormatado);
            System.out.println("Número formatado com zeros: " + inteiroFormatadoComZeros);



            //Definindo o tamanho do número inteiro + frações decimais:

            double numeroDecimal = 122.9;
            String representacaoNumerica = String.format("%7.2f", numeroDecimal);

            //OBS: na especificação do tamanho do número é incluído os números e a vírgula

            System.out.println("\nNúmero original: " + numeroDecimal);
            System.out.println("Número formatado: " + representacaoNumerica);


        }

    }

}
