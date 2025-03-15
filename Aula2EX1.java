import java.util.Scanner;

public class Aula2EX1 {
    public static void main (String[] args){

        //Instaciandoa classe Scanner
        Scanner ler = new Scanner(System.in );

        //Declarando as variáveis

        int num1, num2;

        //Entrada de dados
        System.out.print("Digite o primeiro número: ");
        num1 = ler.nextInt();
        System.out.print("Digite o segundo numero: ");
        num2 = ler.nextInt();

        //Processamento e saída de dados
        System.out.print(" O resultado da soma é " +(num1 + num2));



    }
}
