package br.com.shopZ;

import br.com.shopZ.experiments.TestDesconto;
import br.com.shopZ.experiments.TestDescontoExtra;
import br.com.shopZ.experiments.PedidosByCLI;
import br.com.shopZ.experiments.TesteImpostos;

public class Simulation {

    public static void main(String[] args) {


        TesteImpostos.run();

        // Design implementado: Strategy

        //Descrição resumida: Condicionais que validava o tipo respectivo de imposto extraída para
        //uma classe isolado, que por sua vez implementa a interface Imposto
        //Cuja designação é passada como argumento para chamada da calculadora de imposto.



        TestDesconto.run();
        // Designs implementado: Chain Of Responsbaility

        //Descrição resumida: Mesma ideia básica de extração de condicionais em classes isoladads,
        //Essas classes são o handles, que deverão fazer a checagem dentro de sua própira implementação
        // elas sãos os elos da cadeia de classes que estão interligadas, literalmente, como se fosse
        // uma boneca russa, a execução se da por meio de um número de passos finitos, que deverá
        // percorrer por todas os handlers, se algum deles antes, não interromper o fluxo.

        //Design Complementar à implementação: Template Method

        //Visto que teremos os handlers (classes isoladads - elos da cadeia), em uma família de algoritmos,
        // é abstraída membros que estão presente em todos as classes filhas que herdaram de Desconto,
        // de modo que essas característicam seja implementada na classe mãe, delegando para as filhas
        //somente as especializações específicas que elas devem realizar.
        //OBS: Esse pattern deixa o código em um estrutura muito bonita e satisfatória.


        TestDescontoExtra.run();
        // Desing implementado: State

        //Descrição resumida: State, além de fazer o isolamento e a abstração algoritmíca em uma estrutura
        //'familiar' de herança, semelhantemente ao Template Method, o State propõe muito da ideia de
        // estado, em que é definido regras específicas de alteração entre um estado e outro.


        //Para ver o teste em execução segure Ctrl e clica na classe PedidosByCLI
        PedidosByCLI execuçãoNaPropriaClasse;
        //Essa funcionalidade em específico, adota justamente o padrão de projeto Command, e simula a
        //geração de pedido feita pela execução em linha de comando, então os próprio argumentos, que
        //deverão ser recebidos como entrada para atender os parâmetro dos métodos, foram definidos
        //na configuração de execução do IntelliJ.

        //...Agora voltando a falar sobre o Desing
        //O pattern implementado é o Command (como falando anteriormente).

        //o Design Command, traz muita daquela ideia de você poder realizar uma tarefa independentemente
        //de onde ela esta sendo solicitada, nesse exemplo foi simulado que ela estava sendo realizada
        // através de um CLI (na classe PedidosByCommand).

        //PS: tem uma derivação do Command, Command Handlers, que é utilizado quando há muitas informações
        //que precisa ser inserida no constructor que realiza a instanciação do objeto que ira realizar
        // determinada tarefa, é feita um particionamento, dessa classe - que nesse caso é o GeraPedido,
        //Com a adição do nome Handler, e então para evitar esse overload de dados, as dependências
        // é inserida nesta nova classe, a qual, também sera delegada a execução do comando necessário.
    }

}