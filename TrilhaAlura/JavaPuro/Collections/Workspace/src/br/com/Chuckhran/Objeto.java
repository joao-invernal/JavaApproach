package br.com.Chuckhran;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Objeto {

    private String material;
    private int peso;
    private List categorias = new ArrayList();

    public Objeto(String material, int peso) {
        this.material = material;
        this.peso = peso;
    }


    public void adicionarTag(String tag) {
        categorias.add(tag);
    }


    //Encapuslamento de lista, restrindo o contato com à variável a uma interação somente de leitura
    //sendo impossível, por exemplo, executar: getCategorias().remove(1)
    public List getCategorias() {
        return Collections.unmodifiableList(categorias);
    }

    //Permitir a comparação entre os objs.
    public int compareTo(Objeto outroObj) {
        return this.material.compareTo(outroObj.getMaterial());
    }





    public String toString() {
        return "{\n" +
                "\tmaterial: '" + material + "',"
                +  "\n\tpeso: " + peso +
                "kg," +
                "\n\ttags: " + categorias + "\n}";

    }

    public String getMaterial() {
        return material;
    }

    public int getPeso() {
        return peso;
    }
}
