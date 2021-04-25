package test;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; // Conversão implícita (DE INT PARA DOUBLE)
		//Não há conflitos nesse caso, já que o double suporta mais bytes do que o int
		//Imprimindo o resultado da conversão:
		System.out.println(a);
		
		
		//Conversão explícita (obrigatório nesse caso pois número com casas decimais, é por padrão do tipo dobule).
		float b = (float) 1.2; //Obs: o float tem um número de casas decimais mais limitado do que o double, e caso for ultrapassado, o valor será truncado
		//... Nesse caso poderia ser fazer a conversão colocando somente o f depois do número (float b = 12.2f)
		
		
		int c = 128;
		byte d = (byte) c; //Explícita (CAST)
		// O byte suporte armazenamento de 256 númers inteiros (-128 até 127) - de modo que se ultrpassar esse valores limites, ele recomeça da outra extremidade do range
		System.out.println(d);
		System.out.println(129 - (c - (-128)));
		
		
		double e = 1.9999;
		int f = (int) e; // Nessa conversão não há arredonamento (pois o Java só vê tipo, não valor na operação), tendo como resultado um valor truncado
		System.out.println(e);
		
		

	}

}
