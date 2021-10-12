package br.com.Chuckhran;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iteration {

    public static void main(String[] args) {



        Set emojis = new HashSet();
        emojis.add("\uD83D\uDE43");
        emojis.add("\uD83D\uDE2A");

        System.out.println(emojis);



        //Forma antiga de fazer iteração em conjunto, que, principalmente não consegue fornecer um índice
        Iterator iterador = emojis.iterator();

        while (iterador.hasNext()) {

            System.out.println(iterador.next());

        }

        //System.out.println(iterador.next()); -> NoSuchElementException
        //Para iterar a coleção novamente, é necessário instanciar o iterator novamente.

    }

}
