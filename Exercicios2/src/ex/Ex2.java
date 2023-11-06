package ex;

import java.util.Scanner;

public class Ex2 {
	        //2) Sabendo que na Escola X a média mínima é 7,0 e a tolerância de faltas é 15 % da carga horária do curso, faça uma classe com o método 
			//main que peça as informações necessárias e informe a situação do usuário.
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("A sua escola é bimestre ou trimestre? (bimestre = 2), (trimestre = 3)");
			int n = scan.nextInt();
		
			double media = 0;
			double soma =  0;
			
			for(int i = 1; i<=n; i++) {
				System.out.print("Qual a  nota do aluno: ");
				double nota = scan.nextDouble();
				soma = nota+=soma;
				media = soma/n;
			}
			System.out.println("Media: " + String.format("%.2f", media));
			if(media >= 7) {
				System.out.println("Aluno Aprovado!! " + String.format("%.2f", media));
			}
			else {
				System.out.println("Aluno Reprovado com: " + String.format("%.2f", media));
			}
			
			
			System.out.println("Escreva a carga horaria do Curso: ");
			double hora = scan.nextDouble();
			
			double tolerancia = hora * 0.15;
			System.out.println("A tolerancia de falta nesse curso é de: " + String.format("%.2f", tolerancia));
			
			System.out.println("Quantas horas de falta o aluno teve: ");
			double qtdHora = scan.nextDouble();
			
			double mediaFaltas = qtdHora * 0.15;
			
			if(mediaFaltas < tolerancia) {
				System.out.println("Aluno em dias com a falta com: " + mediaFaltas + " horas de falta !!");
			}
			else {
				System.out.println("Aluno Reprovado por falta com: " + mediaFaltas + " horas de falta!!");
			}
				
			scan.close();
		}
	}
