package lambdaExpression;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Valdemir", "Aldemiro", "Winceslau");
		
		System.out.println("Forma tradicional: ");
		for(String nome : aprovados) {
			System.out.println(nome);
		}
		
		
		
		System.out.println("\nLambdaExpression.v01");
		aprovados.forEach(str -> System.out.println(str));
		
		
		System.out.println("\nMethod reference");
		aprovados.forEach(System.out::println);
		
		
		//Method reference + Expressão Lambda
		System.out.println("\nLambdaExpression.v02");
		aprovados.forEach(nome -> imprimir(nome));
		
		System.out.println("\nMethodReference-v.02");
		aprovados.forEach(Foreach::imprimir);
	}
	
	
	
	public static void imprimir (String nome) {
		System.out.println("Nome: " + nome);
	}

}
