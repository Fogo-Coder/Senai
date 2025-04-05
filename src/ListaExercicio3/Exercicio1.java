package ListaExercicio3;

import java.util.Scanner;

/*  Faça um programa que leia dois números e informe qual é o maior.

Ex1 - Média aritmética
1- ler a variável mumero1;
2- ler a variável munero2;
3- Atribuir a soma das variáveis numero1 e numero2;
4-  Exibir o maior valor da variavel

    Data: 05/04/2025
     Programador: Daniel
     Professora: Luciana Fugita

 */
public class Exercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis num1 e num2, que irão armazenar os números digitados pelo usuário
        double num1, num2;

        // Solicita ao usuário que digite o primeiro número
        System.out.println("Digite o primeiro número");
        num1 = scanner.nextDouble();  // O número digitado é armazenado na variável num1

        // Solicita ao usuário que digite o segundo número
        System.out.println("Digite o segundo número");
        num2 = scanner.nextDouble();  // O número digitado é armazenado na variável num2

        // Verifica se o primeiro número é maior que o segundo
        if (num1 > num2)
            // Caso num1 seja maior, imprime uma mensagem dizendo que o número 1 é maior
            System.out.println("Número 1 maior que número 2");
        else
            // Caso contrário, imprime uma mensagem dizendo que o número 2 é maior
            System.out.println("Número 2 maior que número 1");
    }
}
