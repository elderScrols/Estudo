package ex;

import entities.CompanhiaTeatro;

public class Ex1 {

	public static void main(String[] args) {
		        //1) Uma companhia de teatro planeja dar uma série de espetáculos. A direção calcula que, 
				//a R$5,00 o ingresso, serão vendidos 120 ingressos, e as despesas montarão em R$ 200,00. 
				//A uma diminuição de R$ 0,50 no preço dos ingressos espera-se que haja um aumento de 26 ingressos vendidos.
				
				CompanhiaTeatro comp = new CompanhiaTeatro();
				
				System.out.println("----------------- TABELA DE PREÇOS -----------------");
				
				System.out.println("--------------- Valor do lucro com ingresso á 5 reais: ------------------- ");
				System.out.println(String.format("%.2f",comp.valorTotal() - comp.despesas));
				
				System.out.println("---------------Valor do lucro com ingresso á 4,5 reais: ------------------");
				System.out.println(String.format("%.2f",comp.diminuicao1() - comp.despesas));
				
				System.out.println("--------------- Valor do lucro com ingresso á 4,0 reais: ------------------");
				System.out.println(String.format("%.2f",comp.diminuicao2() - comp.despesas));
				
				System.out.println("--------------- Valor do lucro com ingresso á 3,50 reais: ------------------");
				System.out.println(String.format("%.2f",comp.diminuicao3() - comp.despesas));
				
				System.out.println("--------------- Valor do lucro com ingresso á 3,00 reais: ------------------");
				System.out.println(String.format("%.2f",comp.diminuicao4() - comp.despesas));
				
				System.out.println("--------------- Valor do lucro com ingresso á 2,5 reais: ------------------");
				System.out.println(String.format("%.2f",comp.diminuicao5() - comp.despesas));
				
				System.out.println("--------------- Valor do lucro com ingresso á 2,0 reais: ------------------");
				System.out.println(String.format("%.2f",comp.diminuicao6() - comp.despesas));
				
				System.out.println("--------------- Valor do lucro com ingresso á 1,5 reais: ------------------");
				System.out.println(String.format("%.2f",comp.diminuicao7() - comp.despesas));
				
				System.out.println("--------------- Valor do lucro com ingresso á 1,00 reais: ------------------");
				System.out.println(String.format("%.2f",comp.diminuicao8() - comp.despesas));
				
				System.out.println("-----------------------------------------------------");
				
				System.out.println("Lucro esperado: " + String.format("%.2f", comp.somadosLucros()));
				System.out.print("Quantidade de ingressos vendidos: " + comp.qtdTotalIngresso());
				 
			}

		}