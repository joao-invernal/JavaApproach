package br.com.alura.io.Serialization;

import java.io.Serializable;

public class Cliente implements Serializable {

    //private static final long serialVersionUID = 1L;
    //ATENÇÃO: Se um objeto for instânciado com um ID diferente e serializado em arquivo binário, por exemplo,
    //e eventualmente o serialVersionUID não for mais o mesmo, haverá um incompatibilidade dos tipos, sendo, inclusive,
    //impossível atribuir aquele objeto a um atributo que possui a mesma classe porém com ID diferente,
    //Causa até a InvalidClassException

    //Então pq definir um ID?
    //Pq qualquer alteração ira alterar aleatoriamente o valor desse ID, e quando esse valor é fixado
    //O incopatibilidade dos tipos é evitado nesse cenário.


    public void desconnect() {
        this.activity = false;
    }


    private String nome;
    private int idade;
    private boolean activity;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void setActivity(boolean activity) {
        this.activity = activity;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isActivity() {
        return activity;
    }
}
