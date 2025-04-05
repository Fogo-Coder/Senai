package Calculadora;

import java.util.Scanner;

/*CRIAR UMA CALCULADORA MENU COM AS OPERAÇÕES

System.out.println("Escolha uma operação:");
System.out.println("1 - Soma");
System.out.println("2 - Subtração");
System.out.println("3 - Multiplicação");
System.out.println("4 - Divisão");
System.out.println("5 - Sair");
System.out.print("Digite o número da operação: ");

    Data: 05/04/2025
     Programador: Daniel
     Professora: Luciana Fugita
*/
public class Calculadora {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            int sair = 0;
            double num1, num2, operacao;

            System.out.println("Escolha uma operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            System.out.println("Digite o número da operação: ");

            operacao = scanner.nextInt();
            if (operacao == 5) {
                System.out.println("Saindo do programa...");
                scanner.close();
                return;
            }

            System.out.println("Digiteo primeiro número");
            num1 = scanner.nextDouble();
            System.out.println("Digite o segundo número");
            num2 = scanner.nextDouble();

            if( operacao == 1){
                operacao = num1 + num2;
                System.out.println("Esse é o resultado da adição:" + (operacao));
            }
            else if(operacao == 2) {
                operacao = num1 - num2;
                System.out.println("Esse é o resultado da subtração:" + (operacao));

            } else if (operacao == 3) {
                operacao = num1 * num2;
                System.out.println("O resultado da multiplicação é" + operacao);

            } else if (operacao == 4) {
                operacao = num1 / num2;
                System.out.println("O resultado da divisão é" + operacao);

            }

        }
}
