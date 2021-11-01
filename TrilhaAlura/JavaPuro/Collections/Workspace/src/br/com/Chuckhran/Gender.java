package br.com.Chuckhran;

public class Gender implements Comparable {

    public String description;

    public Gender(String description) {
        this.description = description;
    }

    @Override
    public int compareTo(Object o) {
        Gender outro = (Gender) o;
        return description.compareTo(((Gender) o).description);
    }

    @Override
    public String toString() {
        return this.description;
    }


    public void formasDeImplementarCompareTo() {
        System.out.println("Se você retornar 0, será adc somente um elemento, o primeiro");
        System.out.println("Se for retornado => 1, os item serão posicionado pela ordem de inclusão como uma fila");
        System.out.println("Se for retornado <= 1, os items serão posicionado inverso à inclusão, como uma pilha");

        System.out.println("Agora se você quiser estabelecer uma ordem qualitativo, que posiciona o elemento de " +
                "como a ordem alfabética das String, deverá ser retornado um compareTo desse dado dentro do " +
                "compareTo da classe."); // Conferir linha 12 - 14
    }
}
