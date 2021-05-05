
public class Recursive {

	public static void main(String[] args) {
		
		System.out.println(fatorial(5));
		
	}
	
	static int fatorial(int numero) {
		if (numero == 1) {
			return 1;
		}
		return numero * fatorial(numero - 1);
	}
}
