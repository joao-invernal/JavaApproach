package br.com.Chuckhran;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vetor {

    public static void main(String[] args) {

        //Modo primitivo em Java de lidar com estruturas de armazenamento (variáveis compostas - por valores)
        String[] str = {"12k", "11"};
        System.out.println(str[0]);
        System.out.println("Elementos contidos: " + str.length);




        ///as classes java.util.Collections e java.util.Arrays (repare o s no final) são utilitárias que
        // possuem métodos auxiliares para trabalhar com coleções e arrays.
        // Por exemplo, método Collections.sort(...) serve para ordenadar determinada collections



        //Arrays.asList, permite adicionar uma serie de elementos à instância, porém, a lista se torna imutável.

        List listagem = Arrays.asList("wifhifw", "wkfjwifj", 1);

        //listagem.add(1); -> UnsupportedOperationException

        //Alternativa: passar a collection para outras collection criada normalmente.

        ArrayList arrayList = new ArrayList(listagem);

        arrayList.add("One");

        System.out.println("\n\nlista primordia - imutável: ");
        System.out.println(listagem);
        System.out.println("\nLista desdobrada a partir da primeira: ");
        System.out.println(arrayList);
    }

}
