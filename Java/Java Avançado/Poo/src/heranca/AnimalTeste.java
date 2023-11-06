package heranca;

public class AnimalTeste {
	
	public static void main(String[] args) {
		
		//Objeto
		Cachorro lulu = new Cachorro();
		lulu.comida  = "ração";
		lulu.dormir();
		
		Galinha cocorico = new Galinha();
		cocorico.dormir();
		
	}

}
