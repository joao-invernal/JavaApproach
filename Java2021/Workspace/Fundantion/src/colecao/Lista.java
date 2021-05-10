package colecao;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
			
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1); //Adc o objeto criado, normal
		
		//Adicionando a instância do objeto, sendo criado no parâmetro
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Charles"));
		lista.add(new Usuario("Jeferson"));
		lista.add(new Usuario("Carlos"));//Em listas podemos repetir valores.
		
		for(Usuario u : lista) {
			System.out.println(u.nome);
		}
		
		//Ao contrário do conjunto, lista é indexada, e pode ser acessado através
		System.out.println(lista.get(3).nome);
		
		//Antes de implementa o método toString na classe o resultado séria uma refência para o espaço na memória
		System.out.println(lista.get(0)); // toString configurado para return "Meu nome é " + this.nome + "."

		System.out.println(lista.remove(1));//Removendo pelo índice retorna o valor
		System.out.println(lista);

		//Removendo pelo valor retorna um boolean(true or false)		
		System.out.println(lista.remove(new Usuario("Jeferson")));//Esse objeto não possui um nome de atribuição, portanto a sua referência é indicada através da instanciação, na chamada da classe 
		System.out.println(lista);
		
		//O objeto list ainda contém outros métodos de return true or false, exemplo, contains 
		System.out.println(
		lista.contains(new Usuario("Carlos")) 
		+ " <- Carlos    Ana ->" + //Diferença no acesso de um objeto (Carlos via instanciação e Ana via armazenamento - padrão)
		lista.contains(u1)
				);
		
		
		
		
		
		
	}

}
