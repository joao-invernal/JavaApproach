package br.com.alura.io.Serialization;

import java.io.*;

public class ObjectSerialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cliente cliente = new Cliente("Erminia", 39);

        ObjectOutputStream serializador = new ObjectOutputStream(new FileOutputStream("ObjetoSerializado.bin"));
        serializador.writeObject(cliente); // Obs: a classe do objeto a ser serializado deve implementar a interface Serializable
        serializador.close();

        ObjectInputStream deserializador = new ObjectInputStream(new FileInputStream("ObjetoSerializado.bin"));
        String nomeCliente = ((Cliente) deserializador.readObject()).getNome();
        System.out.println(nomeCliente);
        deserializador.close();




    }

}
