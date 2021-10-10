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



        List listagem = Arrays.asList("wifhifw", "wkfjwifj", 1);



        ArrayList arrayList = new ArrayList();

        arrayList.add("One");
        arrayList.addAll(listagem);

        System.out.println("\nArrays.asList: " + listagem + " -> Permite definir valores à instanciação " +
                ",porém, não é permtido adicionar elementos posteriormente.");
        System.out.println("ArrayList: " + arrayList + " -> Comportamento inverso ao da Collection acima");



    }

}
