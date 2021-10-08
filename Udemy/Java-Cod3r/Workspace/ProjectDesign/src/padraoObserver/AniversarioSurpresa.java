package padraoObserver;

public class AniversarioSurpresa {

    public static void main(String[] args) {

        Namorada namorada = new Namorada(); // A namora é a interessada na ocasião do acontecimento do evento
        Porteiro porteiro = new Porteiro(); // O porteiro é o observador, que vai notificar quando o aniversariante chegar

        porteiro.registarObservador(namorada); // Mas antes do porteiro avisar ele precisa saber quem quer receber o aviso.

        //Como a interface ObservadorDaChegadaAniversariante contém somente um método, ela é um FunctionInterface, portando suporta um Lambda expr.
        //Veja:

        porteiro.registarObservador(e -> System.out.println("Surpresa Via lambda em:\n" + e.getMomento()));


        porteiro.monitorar();



    }

}
