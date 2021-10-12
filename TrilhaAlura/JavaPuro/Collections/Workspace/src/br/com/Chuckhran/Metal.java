package br.com.Chuckhran;

public class Metal {

    public String material;

    public Metal(String material) {
        this.material = material;
    }


    @Override
    public String toString() {
        return this.material;
    }
}
