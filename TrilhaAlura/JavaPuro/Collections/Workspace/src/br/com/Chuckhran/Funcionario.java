package br.com.Chuckhran;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//Exercicio conclusivo de Sets e interators
public class Funcionario implements Comparable<Funcionario> {

    private int idade;

    public Funcionario(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return String.valueOf(idade);
    }

    @Override
    public int compareTo(Funcionario outro) {
        return Integer.compare(this.idade, outro.idade); //Ordem crescente
        //return Integer.compare(outro.idade, this.idade); Ordem descrescente
    }

    public static void main(String[] args) {

        Set cadastro = new TreeSet();

        cadastro.add(new Funcionario(37));
        cadastro.add(new Funcionario(21));
        cadastro.add(new Funcionario(22));

        System.out.println(cadastro);

        Iterator it = cadastro.iterator();

        while (it.hasNext()) {
            System.out.print(it.next());
            if (it.hasNext()) {
                System.out.print(", ");
            }
        }   

    }

}


