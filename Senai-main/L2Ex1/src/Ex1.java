import java.util.Scanner;

    /*Lista de exercíos 2
    Escreva um programa que solicite ao usuário dois números e exiba a soma, subtração,
    multiplicação e divisão entre eles. Utilize o tipo de dados double.

         Data: 29/03/2025
         Programador: Daniel
         Professora: Luciana Fugita

    Ex1 - funções matemática
    1- ler a variavel das funções matemáticas
    2- calcular a soma
    3- calcular a subtração
    4- calcular a multiplicação
    5- calcular a divisão
    3- imprimir o valor das funçoes calculadas

 */
public class Ex1 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        // Declaração de variáveis para armazenar os resultados das operações.
        double soma, subtracao, multiplicacao, divisao;
        double num1, num2;

        // Solicita ao usuário o primeiro número e o armazena na variável num1.
        num1 = ler.nextDouble();
        // Solicita ao usuário o segundo número e o armazena na variável num2.
        num2 = ler.nextDouble();

        // Realiza as operações matemáticas com os números fornecidos
        // pelo usuário e armazena os resultados nas variáveis.
        soma = num1 + num2;
        subtracao = num1 - num2;
        multiplicacao = num1 * num2;
        divisao = num1 / num2;

        // Exibe os resultados das operações para o usuário.
        System.out.println(" A Soma é" + soma );
        System.out.println(" A Subtração é" + subtracao );
        System.out.println(" A Multiplicação é" + multiplicacao );
        System.out.println(" A Divisão é" + divisao );

    }
}
