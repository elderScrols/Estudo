//Classe
public class Incremento{

    //Método principal da classe
    public static void main(String[] args){

    //Pré-incremento
        //Declaração das variáveis
        int x = 8;
        int y = ++x;//Pré-incremento

        //Imprimir na tela
        System.out.println("Pré-incremento");
        System.out.println("X= " + x);
        System.out.println("Y= " + y);
        System.out.println("\n");

    //Pós-incremento
        //Declaração das variáveis
        int a = 8;
        int b = a++;//Pós-incremento

        //Imprimir na tela
        System.out.println("Pós-incremento");
        System.out.println("A= " + a);
        System.out.println("B= " + b);

 }//Fim do método
}//Fim da classe