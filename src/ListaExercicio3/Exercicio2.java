package ListaExercicio3;

import java.util.Scanner;

/*  Faça um programa que leia um número e informe se ele é par ou ímpar.

Ex1 - Média aritmética
1- ler a variável mumero1;
2- ler a variável munero2;
3- indicar se o número informado é impar ou par ;
4-  Exibir o maior valor da variavel

    Data: 05/04/2025
     Programador: Daniel
     Professora: Luciana Fugita

 */
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        // Criação do objeto scanner para capturar entradas do usuário
        Scanner scanner = new Scanner(System.in);

        int num1;  // Variável para número inteiro
        double num2; // Variável para número decimal

        // Solicita ao usuário para digitar um número inteiro
        System.out.println("Digite um número inteiro:");
        num1 = scanner.nextInt();

        // Solicita ao usuário para digitar um número decimal
        System.out.println("Digite um número decimal:");
        num2 = scanner.nextDouble();

        // Verificando se o número inteiro é par ou ímpar
        int resto = num1 % 2; // Calcula o resto da divisão do número inteiro por 2
        if (resto == 0) {
            System.out.println("O número inteiro é par.");
        } else {
            System.out.println("O número inteiro é ímpar.");
        }

        // Verificando se o número decimal é "par" ou "ímpar"
        // Para números decimais, vamos verificar apenas a parte inteira
        int parteInteira = (int) num2;  // Converte o número decimal para inteiro
        int sobra = parteInteira % 2;  // Calcula o resto da divisão por 2 da parte inteira
        if (sobra == 0) {
            System.out.println("A parte inteira do número decimal é par.");
        } else {
            System.out.println("A parte inteira do número decimal é ímpar.");
        }

        scanner.close();  // Fecha o scanner após o uso
    }
}
