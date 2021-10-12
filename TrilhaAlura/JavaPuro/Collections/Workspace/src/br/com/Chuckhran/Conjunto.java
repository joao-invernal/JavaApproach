package br.com.Chuckhran;

import java.util.HashSet;
import java.util.Set;

public class Conjunto {

    public static void main(String[] args) {

        Set<String> armazen = new HashSet();

        armazen.add("Algodão");
        armazen.add("Tecido egípcio");
        armazen.add("Flor de Yasmin");

        //Primeira diferença notável entre List e Set: Set possui uma suposta ordem aleatória no armazenamento.
        //O que isso significa? Que não recebemos os elementos na mesma ordem da inserção.

        //Set não permite a inclusão de elementos repetidos. Veja:
        armazen.add("Tecido egípcio");


        System.out.println(armazen);


    }
}
