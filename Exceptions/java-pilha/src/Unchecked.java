public class Unchecked {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
			metodo1();
		} catch (numberParException e) {
			e.printStackTrace();
		}
        System.out.println("Fim do main");
    }

    private static void metodo1() throws numberParException {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws numberParException {
        System.out.println("Ini do metodo2");
        int i;
        for(i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("Fim do metodo2 ");
        
        if(i % 2 == 0) {
        	throw new numberParException("Número final do índice não é impar!");
        }
    }
}