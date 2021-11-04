package br.com.alura.io.Serialization;

import java.io.*;

public class SerializadoComplexo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

/*        Cliente cliente = new Cliente("Ayrton" , 37);

        ContaCliente contaVinculada = new ContaCliente(cliente);

        ObjectOutputStream transmissorSaida = new ObjectOutputStream(new FileOutputStream("CC.bin"));
        transmissorSaida.writeObject(contaVinculada);
        transmissorSaida.close();*/



        //Os objetos vinculados dentro do objeto devem ser serializáveis também, que nesse caso é a instância da classe
        //Cliente, com execeções quando a informação não for relevante para a serialização, isto implica, consequentemente
        //em uma inacesibilidade futura a esse objeto associado. Será armazenado no arquivo como nulo.



        //Deserialização e leitura do objeto:
        ObjectInputStream transmissorEntrada = new ObjectInputStream(new FileInputStream("CC.bin"));
        ContaCliente conta = (ContaCliente) transmissorEntrada.readObject();

        System.out.println(conta.getCadastro().getNome());

        transmissorEntrada.close();








    }

}
