package projeto_inicial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {
	
	private ReajusteService service;
	private Funcionario funcionario;

	@BeforeEach
	public void startInstances() {
		service = new ReajusteService();
		funcionario = new Funcionario("Zilda", LocalDate.now(), new BigDecimal("1000.00"));
		System.out.println("Inicializando...");
	}
	
	@AfterEach
	public void finish() {
		System.out.println("..Fim");
	}
	
	//As anotações acima são realizado na saída/entrada dos métodos
	
	//As anotações abaixo, entretanto, são executado na entrada/saída da classe
	
	@BeforeAll
	public static void primordial() {
		System.out.println("START\n");
	}
	
	@AfterAll
	public static void last() {
		System.out.println("\nFINISH");
	}
	
	
	

	@Test
	public void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar() {
		//startInstances();  <- Não é mais necessáro instanciar o obj manualmente, pois a anotação @BeforeEach já configura a chamada do método que faz antes de cada método test
		
		service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
		
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}
	
	@Test
	public void ReajusteDeveriaSerDeDezPorcentoQuandoDesempenhoForBom() {
		service.concederReajuste(funcionario, Desempenho.BOM);
		
		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario() );
	}
	
	
	@Test
	public void ReajusteDeveriaSerDeQuinzePorcentoQuandoDesempenhoForOtimo() {
		service.concederReajuste(funcionario, Desempenho.OTIMO);
		
		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario() );
	}
	

}
