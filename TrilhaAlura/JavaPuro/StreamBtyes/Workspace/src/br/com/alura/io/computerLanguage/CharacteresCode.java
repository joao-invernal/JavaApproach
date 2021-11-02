package br.com.alura.io.computerLanguage;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class CharacteresCode {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String s = "C";
        System.out.println("Código da letra C na tabela Unicode: " + s.codePointAt(0));



        Charset charset = Charset.defaultCharset();
        System.out.println("Encodificador do código: " + charset);

        byte[] characterBytes = s.getBytes();
        //Param. opcional, e caso de inanição, é inferido o charset default, nesse caso o UTF-8.
        System.out.printf("Qtde de bytes: %s \n", characterBytes.length);

        //Conversão reversa - do código para a representação:
        String byteToDecimal = new String(characterBytes);
        System.out.println("Representação do byte: " + byteToDecimal);

        String s1 = "13º Órgão Oficial";
        byte[] bytes = s1.getBytes();
        String s2 = new String(bytes, "UTF-8");
        System.out.println(s2);

    }

}
