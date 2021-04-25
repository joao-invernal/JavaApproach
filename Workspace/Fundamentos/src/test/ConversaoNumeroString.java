package test;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		Integer num1 = 10000;
		//Usando o wrapper para obter um conversão para String, onde tem o método para revelar o comprimento.
		System.out.println(num1.toString().length());
		
		int num2 = 20000;
		//Fazendo o mesmo sem wrapper, direto com o tipo primitivo do dado:
		System.out.println(Integer.toString(num2).charAt(num1.toString().length() - 5));
		
	}
}
