package org;

import sun.security.util.Length;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderString {

    public static void main(String args[]) {

        List<String> entidades = Arrays.asList("Alura Online", "Casa do Código", "Caelum");

        System.out.println(entidades);

        // Collections - Classe estática acompanhada de métodos estáticos
        Collections.sort(entidades); // método .sort - por padrão realiza uma organização lexicográfica - à ordem alfabética.
        System.out.println(entidades);


        //Comparação personalizada:
        Comparator<String> customCompare = new LengthCompare();
        Collections.sort(entidades, customCompare);
        System.out.println(entidades);
    }

}


//Personalização dos critérios de comparação
class LengthCompare implements Comparator<String> {

    //Nesse caso, foi sobreescrito com a condição de que o valor c/ o menor tamanha seja precedente dos demais.
    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length())
            return -1;
        if (s1.length() > s2.length())
            return 1;
        return 0;
    }
}