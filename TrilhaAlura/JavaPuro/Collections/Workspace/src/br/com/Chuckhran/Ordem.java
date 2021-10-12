package br.com.Chuckhran;

import java.util.*;

public class Ordem {

    public static void main(String[] args) {


        List numbers = Arrays.asList(1, 4, 2, 9, 3);

        List defaultt = Arrays.asList("Sergio", "Amaral");

        ArrayList names = new ArrayList<>();
        names.add("Raimon");
        names.add("James");
        names.add("Saimon");

        names.addAll(defaultt);

        System.out.println(names);

        //Alinhando em ordem alfabética.:
        Collections.sort(names);
        //PS: método somente para o tipo primitivo de cada, impossível ordenadar String e Int ao mesmo tempo.

        System.out.println(names);


        //Ordenação númerica crescente
        System.out.println("\n" + numbers);
        Collections.sort(numbers);
        System.out.println(numbers);



        //comprações:
        String s1 = "Chibungo";
        String s2 = "Krakaskov";

        System.out.println("\nComparação lexicográfica, entre as Strings: ");
        if (s1.compareTo(s2) < 0) {
            System.out.println("1º: " + s1
                    + "\n2º: " + s2);
        } else {
            System.out.println("1º: " + s2
                    + "\n2º: " + s1);
        }


        Objeto objeto = new Objeto("Porcelana", 3);
        Objeto obj = new Objeto("Artesanal", 1);

        List<Objeto> objetos = new ArrayList<>();
        objetos.add(objeto);
        objetos.add(obj);

        System.out.println("\nMostruário de objetos:");
        System.out.println(objetos);

        //Comparação específica de um obj.

        objetos.sort(Comparator.comparing(Objeto::getPeso));

        System.out.println("\n\nObjetos rearranjados ordem crescente do peso do Obj: ");
        System.out.println(objetos);


        //Tagueando obj:
        obj.adicionarTag("item-acessório");

        System.out.println(obj);





        objetos.add(new Objeto("Alumínio", 0.70));
        System.out.println("Lista modificada!");
        System.out.println(objetos);




        //obj.getCategorias().add("1"); -> Operação não-suportada.

        //Collections.sort(obj.getCategorias()); Exception in thread "main" java.lang.UnsupportedOperationException
// Devido à sua imutabilidade à lista se torna inacessível à qualquer operação externa que tente alterar o conteúdo.

        //Técnica para realizar uma exibição organizada do conteúdo da lista: criar um replica com os mesmos valores

        List objClone = new ArrayList(objetos);
        Collections.sort(objClone);

        System.out.println("\n\nLista ordenada: \n");
        System.out.println(objClone);
    }

}
