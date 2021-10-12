package br.com.Chuckhran;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Objeto implements Comparable<Objeto>{

    private String material;
    private double peso;
    private List categorias = new ArrayList();

    public Objeto(String material, double peso) {
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
/*    public int compareTo(Objeto outroObj) {
        return this.material.compareTo(outroObj.getMaterial());
    }*/


    public int compareTo(Objeto outroObj) {
        return this.material.compareTo(outroObj.getMaterial());
    }


    @Override
    public boolean equals(Object o) {
        Objeto outro = (Objeto) o;
        return outro.material.equals(material) && Double.compare(peso, outro.peso) == 0;
        //PS: Double.compare(d1, d2) -> retorna 1 se diferente, 0 se forem iguais.
    }

    @Override
    public int hashCode() {
        return material.charAt(0) + (int) peso;
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

    public double getPeso() {
        return peso;
    }


}
