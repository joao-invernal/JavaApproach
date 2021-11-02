package br.com.alura.io.Serialization;

import java.io.*;

public class ObjectStreaming {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //Serialização do Obj [conversor to binary]
        String reference = "value";
        ObjectOutputStream streamExternalObject = new ObjectOutputStream(new FileOutputStream("ObjSerializado.bin"));
        streamExternalObject.writeObject(reference);
        streamExternalObject.close();

        //Realizando a deserialização, a leitura do Obj.
        ObjectInputStream decodificacaoObj = new ObjectInputStream(new FileInputStream("ObjSerializado.bin"));
        String referencia = (String) decodificacaoObj.readObject();
        decodificacaoObj.close();
        System.out.println(referencia);
        
    }

}
