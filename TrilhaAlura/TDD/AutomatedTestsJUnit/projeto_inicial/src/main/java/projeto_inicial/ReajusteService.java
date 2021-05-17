package projeto_inicial;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
	
		BigDecimal percentual = desempenho.percentualReajusteSalarial();
		BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
		funcionario.reajusteSalarial(reajuste);
		
	}

}
