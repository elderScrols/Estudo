package cachorros;

public class Cachorro {
		
		//Atributos
		protected int tamanho;
		protected String raca;
		protected String nome;
		
		
		//Método
		protected void latir() {
			System.out.println("Au, Au, Au, Au!!!!");
		}
		
		//Método
		protected void nome_T() {
			System.out.println("Nome:"+ nome);
			System.out.println("Roça:"+ raca +" Tamanho:"+ tamanho);
		}
		
}