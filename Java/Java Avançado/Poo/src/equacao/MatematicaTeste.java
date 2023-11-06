package equacao;

public class MatematicaTeste {

	public static void main(String[] args) {
		
		
		//Objeto
		Matematica m = new Matematica();
		
		//maior
		int maior = m.maior(40, 30);
		System.out.println("O maior número é:"+ maior);
		
		//Menor
		int menor = m.menor(40, 30);
		System.out.println("O menor número é:"+ menor);
		
		//Somar
		double somar = m.somar(50, 60);
		System.out.println("A soma dos números:"+ 50 +" + "+ 60 +" = "+ somar);
		
	}

}
