package br.com.alura.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TopLevelWriter {

    public static void main(String[] args) throws FileNotFoundException {

        PrintStream printStream = new PrintStream("HigherLevel.txt");

        printStream.println("Primeira linha ");
        //Perceba que não precisa escrever um novo comando para nova linha. println já se encarrega disso.

        //Caso não queira uma quebra de linha, retire o ln:
        printStream.print("Final line: " + 2);


        //Redundantemente (ou não) existe o PrintWriter, com praticamente a mesma função.
        PrintWriter printWriter = new PrintWriter(new File("C:\\Users\\joao_\\Lab\\Cursos\\Java\\Curso2021\\TrilhaAlura\\JavaPuro\\StreamBtyes\\Workspace\\out\\fornecimento\\newFile.txt"));
        //Instanciando um new File, abre a possibilidade de definir o caminho do destino [param. pathname] do arquivo. OBSERVE O PADRÃO ACIMA.

        //EXTRA:Millisegundos que se passaram desde 1 de Janeiro de 1970
        // O INICIO DA ERA UNIX
        System.out.println(System.currentTimeMillis());

        long millis = System.currentTimeMillis();
        long emSegundos = millis/1000;
        long emMinutos = emSegundos/60;
        long emHoras = emMinutos/60;
        long emDias = emHoras/24;
        int emMeses = (int)emDias/30;
        int emAnos = emMeses/12;
        int emDecadas = emAnos/10;

        printWriter.println("Desde 1970, se passaram " + System.currentTimeMillis() + "ms");
        printWriter.println("O que leva a " + emSegundos + " segundos");
        printWriter.println("Que por sua vez dura " + emMinutos + " minutos");
        printWriter.println("que vale " + emHoras + "h");
        printWriter.println("e que compõe " + emDias + " dias");
        printWriter.println("que consequentemente significa que se passaram " + emMeses + " meses");
        printWriter.println("Durante " + emAnos + " anos");
        printWriter.println("e que pode considerar como " + emDecadas + " decádas decorrentes.");

        printWriter.close();





    }
    
}
