package Erro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		boolean continuar = true;
		String corVerde = "\u001B[32m";
		String resetCor = "\u001B[0m";
		
		do {
			try {
				System.out.print("Número1: ");
				int a = s.nextInt();
				
				System.out.print("Número2: ");
				int b = s.nextInt();
				
				int resultado = a / b; 
				
				System.out.println("Resultado: "+ a +" / "+ b +" = "+ resultado);
				continuar = false;
			
				}
				catch(InputMismatchException e1) {
					System.err.println("Entrada inválida. Certifique-se de inserir números inteiros.");
					s.nextLine(); //descarta entrada inválida
				
				}
				catch(Throwable e2) {
					System.err.println("Não é possível dividir por zero!!");
					s.nextLine(); //descarta entrada inválida
				}
				finally {
					System.out.println(corVerde +"Programa execudado"+ resetCor);
				}
			
				if (continuar == false) {
					System.out.println("Fim da Divisão");
				} else {
					System.err.println("\nErro na Divisão, tente novamente!!");
				}
			
			} while (continuar);
		}
		
	
			
	}


