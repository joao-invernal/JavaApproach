import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class UtilizandoLib {
	
	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(123, 321);
		
		System.out.println("Sua agência " + c.getAgencia());
		
		
	}
	
	
	

}
