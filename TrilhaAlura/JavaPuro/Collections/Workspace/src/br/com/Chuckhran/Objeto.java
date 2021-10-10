package br.com.Chuckhran;

public class Objeto {

    private String material;
    private int peso;

    public Objeto(String material, int peso) {
        this.material = material;
        this.peso = peso;
    }




    //Permitir a comparação entre os objs.
    public int compareTo(Objeto outroObj) {
        return this.material.compareTo(outroObj.getMaterial());
    }





    public String toString() {
        return "{\n" +
                "\tmaterial: '" + material + "',"
                +  "\n\tpeso: " + peso +
                "kg\n}";

    }

    public String getMaterial() {
        return material;
    }

    public int getPeso() {
        return peso;
    }
}
