package padraoObserver;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

    private List<ObservadorDaChegadaAniversariante> observadores = new ArrayList<>();
    //PS: Os observadores são aqueles interessado em ser acionados à ocorrência do evento

    public void registarObservador(ObservadorDaChegadaAniversariante observador) {

        observadores.add(observador);

    }

    public void monitorar() {

        Scanner leia = new Scanner(System.in);

        String valor = "";

        while(!"sair".equalsIgnoreCase(valor)) {
            System.out.println("Aniversariante chegou?");
            valor = leia.nextLine();

            if("sim".equalsIgnoreCase(valor)) {
                EventoChegadaAniversariante eventoExpected = new EventoChegadaAniversariante(new Date());

                observadores.stream()
                        .forEach(o -> o.chegou(eventoExpected));
                valor = "sair";
            } else System.out.println("Alarme falso!");

        } leia.close();

    }

}
