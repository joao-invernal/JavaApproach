package br.com.Chuckhran;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class Mapeamento {

    public static void main(String[] args) {

        //Mapas são como dicionários: Possuem chave e valor <Key and Value>
        Map<Integer, String> numeroParaExtendido = new HashMap<>();
        //OBS: Maps não pertence descendentes de Collection, embora se pareça como uma



        //Assim como uma collection, map também adicionar elementos, com o seu método .put
        numeroParaExtendido.put(0, "Zero");

        //Aumentando um pouco a complexidade, para enfatizar o conceito

        Numero matriculado = new Numero(2, "Dois");
        numeroParaExtendido.put(matriculado.getNumero(), matriculado.getPorExtenso());

        numeroParaExtendido.put(55, "Cinquenta e cinco");
        numeroParaExtendido.put(100, "Cem");

        System.out.println(numeroParaExtendido);

        //Retorna o Value corresponde Key:
        System.out.println(numeroParaExtendido.get(101));
        //Se a chave for inexistente dentro do map o retorno será null



        //Conjunto dentro de Map:
        Map<Integer, Set<String>> representatividadeNumerica = new LinkedHashMap<>();

        Set<String> um = new HashSet<>();
        um.add("Um");
        um.add("1¹");
        um.add("Um elevado a 0");

        representatividadeNumerica.put(1, um);

        System.out.println(representatividadeNumerica);




    }
}


class Numero {

    private int numero;
    private String porExtenso;

    public Numero(int numero, String porExtenso) {
        this.numero = numero;
        this.porExtenso = porExtenso;
    }

    public int getNumero() {
        return numero;
    }

    public String getPorExtenso() {
        return porExtenso;
    }
}

