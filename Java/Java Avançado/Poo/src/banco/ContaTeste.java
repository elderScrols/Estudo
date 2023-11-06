package banco;

public class ContaTeste {

	public static void main(String[] args) {
	
		//Objeto
		Conta conta = new Conta();
		conta.cliente = "Daniel";
		conta.saldo = 4_000.00;
		conta.exibesaldo();
		
		//Sacar 
		conta.saque(2000);
		conta.exibesaldo();
		
		//Depositar
		conta.depositar(8000);
		conta.exibesaldo();
		
		//Objeto
		Conta destino = new Conta();
		destino.cliente = "Carlos";
		destino.saldo = 5_000.00;
		destino.exibesaldo();
		
		//Sacar
		destino.saque(200);
		destino.exibesaldo();
		
		//Depositar
		destino.depositar(5200);
		destino.exibesaldo();
	}

}
