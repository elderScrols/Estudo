//Classe
public class If_else{

    //Método principal da classe
    public static void main(String[] args){

        //Declaração das variáveis
        int idade = 99;

        //Estrtura condicional
        if (idade <= 7){
                System.out.println("Ainda é uma criança");
            } else if (idade > 7 && idade <= 18 ) {
                System.out.println("É um adolescente");
            } else if (idade > 18 && idade <= 60){
                System.out.println("É um adulto");
            } else {
                System.out.println("Está na melhor idade");
            }

 }//Fim do método
}//Fim da classe