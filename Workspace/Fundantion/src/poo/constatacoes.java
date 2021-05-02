package poo;

public interface constatacoes {
	
	//Métódos em interface normalmente não possuem {corpo} - são abstratos
	//Porém utilizando deafult é possível
	default int confirma() {
		return 0;
	}

}
