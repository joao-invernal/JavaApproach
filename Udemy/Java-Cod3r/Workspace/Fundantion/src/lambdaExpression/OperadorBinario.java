package lambdaExpression;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	
	public static void main(String[] args) {
		


		//Recebe dois operandos do mesmo tipo indicado e retorna um resultado do mesmo tipo.
		BinaryOperator<Double> media = (a, b) -> (a + b) / 2;
		System.out.println("media dos valores analisados: " + media.apply(7.5, 5.5));
		
		//BiFunction recebe dois argumento e retorna um resultado
		BiFunction<Double, Double, String> resposta = (n1, n2) -> (n1 + n2) / 2 >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(resposta.apply(7.5, 8.0));
		
		
		//Function: Recebe um argumento de um tipo e retorna o resultado com o seu tipo. Nesse o experimento será encadeado como entrada o retorno de um função BinaryOperator
		Function<Double, String> conceito = mid -> mid >= 7 ? "Aprovado" : "Reprovado";
		System.out.println("Situação do cidadão: " + media.andThen(conceito).apply(7.5, 9.0));
		
		
		
		
		
		//275110
		//690020
	}

}
