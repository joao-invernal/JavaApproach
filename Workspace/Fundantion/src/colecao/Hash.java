package colecao;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		Usuario usuario = new Usuario("Jefrey");
		usuarios.add(new Usuario("Benjamin"));
		usuarios.add(usuario);
		usuarios.add(new Usuario("Guilherme"));
		
		System.out.println(usuarios);
		
		boolean resultado = usuarios.contains(usuario);
		System.out.println(resultado);
	}
	
}
