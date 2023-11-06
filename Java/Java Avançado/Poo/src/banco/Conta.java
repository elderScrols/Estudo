package banco;

public class Conta {

	//Atributo
	protected String cliente;
	protected double saldo;
	
	//Método
	protected void exibesaldo() {
		System.out.println(cliente +" seu saldo é:R$"+ saldo +"0\n");
	}
	
	//Método
	protected void saque(double valor) {
		saldo -= valor;
		System.out.println("Sacado no valor de:R$"+ valor +"0");
	}
	
	//Método
	protected void depositar(double valor) {
		saldo += valor;
		System.out.println("Depositado no valor de:R$"+ valor +"0");
	}
	
}
