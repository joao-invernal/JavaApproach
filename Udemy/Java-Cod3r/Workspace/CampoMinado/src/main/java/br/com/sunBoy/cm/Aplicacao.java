package br.com.sunBoy.cm;

import br.com.sunBoy.cm.modelo.Tabuleiro;
import br.com.sunBoy.cm.view.TabuleiroConsole;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
		new TabuleiroConsole(tabuleiro);

		
	}

}
