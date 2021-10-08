package br.com.sunBoy.cm;


import br.com.sunBoy.cm.excecao.ExplosaoException;
import br.com.sunBoy.cm.modelo.Campo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CampoTest {
	
	
	@BeforeEach
	void iniciarCampo() {
		Campo campo = new Campo(3, 3);
	}
	
	
	@Test
	void adicionarVizinho() {
		Campo space1 = new Campo(3, 3);
		Campo space2 = new Campo(2, 3);
		//System.out.println(space);
		
		boolean resultado = space1.adicionarVizinho(space2);
		assertTrue(resultado);
		
		
	}
	
	
	@Test
	void naoDeveriaAdicionarVizinho() {
		Campo space1 = new Campo(3, 3);
		Campo space2 = new Campo(1, 1);
		
		//System.out.println(space);
		
		boolean resultado = space1.adicionarVizinho(space2);
		assertFalse(resultado);
		
	}
	
	
	@Test
	void adicionarVizinhoDiagonal() {
		Campo space1 = new Campo(3, 3);
		Campo space2 = new Campo(2, 2);
		
		//System.out.println(space);
		
		boolean resultado = space1.adicionarVizinho(space2);
		assertTrue(resultado);
		
	}
	
	@Test
	void marcacaoPadrao () {
		Campo campo = new Campo(3, 3);
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void AlternarMarcacao () {
		Campo campo = new Campo(3, 3);
		
		campo.alternarMarcacao();
		
		assertTrue(campo.isMarcado());
	}
	
	@Test
	void AlternarMarcacaoEmDuasChamadas () {
		Campo campo = new Campo(3, 3);
		
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		
		assertFalse(campo.isMarcado());
	}
	
	
	@Test
	void aberturaCampoNaoMarcadoNaoMinado() {
		Campo campo = new Campo(3, 3);
		
		assertTrue(campo.abrir());
	}
	
	@Test
	void naoAberturaCampoMarcadoNaoMinado() {
		Campo campo = new Campo(3, 3);
		campo.alternarMarcacao();
		
		assertFalse(campo.abrir());
	}
	
	@Test
	void naoAberturaCampoMarcadoMinado() {
		Campo campo = new Campo(3, 3);
		
		campo.alternarMarcacao();
		campo.minar();
		
		assertFalse(campo.abrir());
	}
	
	@Test
	void naoAberturaCampoNaoMarcadoMinado() {
		Campo campo = new Campo(3, 3);
		
		campo.minar();
		
		assertThrows(ExplosaoException.class, () -> {
			campo.abrir(); // Quando esse comando for executado nesse cen�rio, devera ser acionada a Excpetions parametrizada la atras - confirmando a situa��o do teste
		});
	}
	
	
	@Test
	void abrindoVizinhancaSegura() {
		Campo campo = new Campo(3, 3);
		Campo campo22 = new Campo(2, 2);
		Campo campo11 = new Campo(1, 1);
		
		campo.adicionarVizinho(campo22);
		campo22.adicionarVizinho(campo11);
		
		campo.abrir();
		
		assertTrue(campo11.isAberto() && campo22.isAberto());

	}
	
	
	@Test
	void abrindoVizinhancaSeguraDelimitada() {
		Campo campo = new Campo(3, 3);
		Campo campo22 = new Campo(2, 2);
		Campo campo11 = new Campo(1, 1);
		
		Campo campo12 = new Campo(1, 2);
		campo12.minar();
		
		
		campo.adicionarVizinho(campo22);
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12); // Com a presen�a do campo 12 (um campo minado) na vizinhan�a do campo 22, deixar� de ser aberto os demais campos vizinhos [campo 11 permanecer� fechado]
		
		campo.abrir();
		
		assertTrue(campo11.isFechado() && campo22.isAberto() && campo12.isFechado());

	}

}
