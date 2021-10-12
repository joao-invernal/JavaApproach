package br.com.Chuckhran;

import java.util.*;

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



        Set conjuntoTeste = Collections.emptySet();

        //emptySet são imutáveis. Sim!
    // conjuntoTeste.add("A collection realmente é o que veio pra ser, um set definitivamente vazio"); ->Unsupported
        System.out.println(conjuntoTeste);



        //Mais derivações ainda de Set - além de HashSet:

        Set conjuntoLinkado = new LinkedHashSet(armazen);
        conjuntoLinkado.add("Trigo");

        //consegue manter a ordem na lista correspondentemente à ordem de inclusão no conjunto.
        //	Mas de qualquer forma, ainda não é acessível através do método .get()

        System.out.println("\nLinkedHashSet: ");
        System.out.println(conjuntoLinkado);



        Set arvoreRubroNegro = new TreeSet(conjuntoLinkado);
        arvoreRubroNegro.add("Betume");

        System.out.println("\nTreeSet: ");
        System.out.println(arvoreRubroNegro); // Aparentemente ele estabelece uma ordem aos elementos.
        // e assume uma configuração homogênea, impedidndo valores de outros tipos além do que já foi definido.

        //Outra característica bastante importante: todos os objetos forem inseridos devem implementar a
                                        //interfaceComparable





        Set genericos = new TreeSet<>();

        genericos.add(new Gender("Experimentativo"));
        genericos.add(new Gender("Introdutório"));
        genericos.add(new Gender("Degustativo"));
        genericos.add(new Gender("Conclusivo"));

        System.out.println("\nTreeSet secundário: ");
        System.out.println(genericos);







        Comparator<Object> objectComparator = new Comparator<>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 1;
            }
        };

        //E se estivermos trabalhando com uma instância de uma classe que não
        // temos acesso ou não podemos modificar para implementar Comparable:

        System.out.println("\nTreeSet com Comparator parametrizado, externalizada da classe.");

        Set<Metal> mostruario = new TreeSet<>(objectComparator);

        mostruario.add(new Metal("Cromo"));
        mostruario.add(new Metal("Sáfira"));

        System.out.println(mostruario);










    }
}
