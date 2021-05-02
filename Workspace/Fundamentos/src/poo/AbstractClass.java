package poo;

public abstract class AbstractClass {

	private String nome;
	private int idade;
	private String gênero;

	AbstractClass(){} // Contructor
	
	


		public static void main(String[] args) {
		
			//Pessoa usuario = new Pessoa(); Não é possível instanciar a classe
			
			//Más pode ser utilizada como tipo, veja:
			
			AbstractClass usuario = new Funcionario();
		
		}

}
