package br.com.Chuckhran;

import java.util.HashSet;
import java.util.Set;

public class Equidade {

    public static void main(String[] args) {

        Objeto clarineta = new Objeto("metal", 0.72);
        Objeto tamborin = new Objeto("sintético", 3);

        Set<Object> instrumentos = new HashSet();
        instrumentos.add(clarineta);
        instrumentos.add(tamborin);

        Objeto replicaClarineta = new Objeto("metal", 0.72);
        System.out.println("\nExiste esse instumento na coleção?");
        System.out.println(instrumentos.contains(replicaClarineta));
        //Embora as informações seja compatíveis, são dois objetos diferente com suas respectivas referências.
        //Além disso, em específico nesse caso do Set o objeto presente na coleção deve implementar o método hashCode

        //Motivo: Nos Sets, todos os valores armazenado são posicionados através de um índice, e quando se compara
        //dois objetos diferentes esse índice vai ver que é duas referências diferentes, e já nem compara.
        //Quando esse método é sobrescrito, retornando a primeira letra de um determinado atributo por exemplo,
        //a referência começa a se cruzar e uma comparação passa a ser feita.

        System.out.println(clarineta.getMaterial().charAt(0));

        var charact = clarineta.getMaterial().charAt(0);


        System.out.println("Ok, mas pelo menos são iguais certo? ");
        System.out.println(clarineta.equals(replicaClarineta));
        //Depende da semelhança entre os atributos que estão sendo comparado, e, principalmente se foi
        //sobrescrito na classe do objeto, o método equals de Object (mãe de todos) com os repsectivos atributos.
        //Caso contrário, seja comparado os objetos, que evidentemente, referência valores divergentes.






    }
}
