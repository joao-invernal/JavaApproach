package colecao;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		/*Offer e Add -> Adicionam elementos na fila
		Diferencia o comportatamento qundo a fila está cheia!
		(Add ocorre uma execeção quando a lista esta cheia
		enquando offer retorna false)*/
		fila.add("José");
		fila.add("Tafnes");
		fila.offer("Bily");
		
		//Peek e Element -> obter o próximo (o último) elemento - sem remover
		//Diferencia o comportamento quando a fila estiver vazia!
		//(peek retorna null, element aciona um exceção
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
//		Ainda métodos desta coleção
//		fila.size()
//		fila.clear()
//		fila.isEmpty()
		System.out.println(fila.contains("José"));
		
//		poll e remove -> obter o próximo (o último) elemento, removendo-o
//		Diferencia o comportamento quando a fila estover vazia!
//		poll retorna null, e remove aciona uma exceção
		
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		//System.out.println(fila.poll()); Return false
		//System.out.println(fila.remove()); para o programa com a expection
		
	}
	
}
