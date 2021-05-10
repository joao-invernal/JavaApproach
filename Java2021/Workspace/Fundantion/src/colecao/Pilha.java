package colecao;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("Quem comeu meu queijo?");
		livros.push("Python");
		livros.push("Blockchain Básico");
		livros.add("Técnicas de Invsão - Aprenda as técnicas usadas por Hackers");
		
		//ver a classe Fila para consultar os métodos - que funcionam semelhantemente
		
		System.out.println(livros.peek());
		System.out.println(livros.peek());
		System.out.println(livros.element());


		System.out.println(livros.poll());
		System.out.println(livros.remove());
		System.out.println(livros.poll());
		System.out.println(livros.pop());
		
		
	}
	
}
