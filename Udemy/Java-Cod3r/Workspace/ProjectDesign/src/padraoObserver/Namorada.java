package padraoObserver;

public class Namorada implements ObservadorDaChegadaAniversariante {  // A namorada quer ser notificada pelor observer

    public void chegou(EventoChegadaAniversariante eventoEsperado) {

        System.out.println("\nAvisar os convidados...");

        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Apagar as luzes...");


        System.out.println("Esperar um pouco");

        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("e... surpresa!!!");

    }



}
