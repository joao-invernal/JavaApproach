import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Observador {

    public static void main(String[] args) {

        JFrame janela = new JFrame();
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600, 200);
        janela.setLayout(new FlowLayout());
        janela.setLocationRelativeTo(null);

        JButton botao = new JButton("Clicar!");
        janela.add(botao);

        /* Método mais burocrático
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Observador.actionPerformed");
            }
        });
Veja a seguir a simplificação com lambda. OBS: isso é permitido pq a interface ActionListener contém só um método*/

        //                     [Interface funcional]

        botao.addActionListener(e -> System.out.println("Evento ocorrido [CLICK]"));

        janela.setVisible(true);

    }

}
