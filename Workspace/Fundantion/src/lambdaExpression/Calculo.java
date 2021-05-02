package lambdaExpression;

import java.util.function.BinaryOperator;

//Seja bem vindo ao próximo nível: programação funcional
//essencialmente pressente na vida de alguns programadores de outra linguagem (como o JS), traz um paradgima de alto nível de abstração
//porém, inicialmente parece ser contra intuítivo - até pq Java e altamente reconhecido pelo paradigma imperativo, com Prog. Orient. a Obj. e não declarativa



@FunctionalInterface //Essa anotação serve para validar que a Interface seja funcional (tenha somente 1 método) para aplicar a Lambda Expression. Portando a notation é dispnesável
public interface Calculo {
	
	double executar(double a, double b);

	//double execute(double a, double b); --> Se esse método for definido a interface deixa de ser funcional.
	//Há a possibilidade de exisitir mais de um méotodo, porém eles devem ser deafult:
	default double exec (double a, double b) {
		return a+b;
	}
	
	//Outro modo de definir mais métodos:
	
	static String msg() {
		return "Hi there";
	//Lembrando que tudo o que é static é uma propriedade da Classe e não da instância, portanto não sendo acessível a este.
	}
	
	
	
	
	
	//Método Mais Comum
	// Implementação do método acima (o que não seria estrategicamente interessante como a expressão lambda -> final do código)
	//(Só para efeito de ilustração, através da modo de funcionamento acustumado até então)
	public class Somar implements Calculo {
		public double executar(double a, double b) {
			return a + b;
		}
	}
	
	//Veja o resultado e a diferenças das soluções no método main abaixo 
	
	
	
	
	
	
	
	//Runtime application
	public static void main(String[] args) {
		var calculo = new Somar(); // Maneira mais popular
		Calculo calc = (x, y) ->  x + y; // Modo mais pragmático
		
		System.out.println("Valores somado (com criação e instaciação de classe): " + calculo.executar(2, 3));
		System.out.println("Valores somado (com expressão lambda): " + calc.executar(2,  3));

		calc = (a, b) -> a * b;
		System.out.println("Valores multiplicado: " + calc.executar(2,  3));
		
		System.out.println(Calculo.msg());
		
		//Existe um template, BinaryOperator, que já traz uma interfacer funcional para usar a expressão lambda... Veja na prática:
		
		BinaryOperator<Integer> autoCalculo = (a, b) -> a * b; // O binaryOperator recebe dois operandos e r
		
		System.out.println(autoCalculo.apply(2, 3));
	}
}

