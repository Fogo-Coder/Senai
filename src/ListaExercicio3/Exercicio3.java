package ListaExercicio3;
/*  Faça um programa que leia um número e informe se ele é positivo, negativo ou zero.

Ex1 - Numero positivo, negativo ou zero

1- ler a variável número1;
2- ler a variável núnero2;
3- ler a variável número3
4- indicar se o número informado é positivo, negativo ou zero ;
4-  Exibir o maior valor da variavel

    Data: 05/04/2025
     Programador: Daniel
     Professora: Luciana Fugita

 */
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário

        double numero; // Declara uma variável do tipo double para armazenar o número

        System.out.println("Digite um número"); // Solicita ao usuário que digite um número
        numero = scanner.nextDouble(); // Lê o número digitado pelo usuário e armazena na variável 'numero'

        // Estrutura condicional para verificar o valor do número
        if (numero > 0) // Se o número é maior que zero
            System.out.println("O número é positivo"); // Exibe que o número é positivo
        else if (numero == 0) { // Se o número é igual a zero
            System.out.println("O número é zero"); // Exibe que o número é zero
        } else // Se o número não é positivo nem zero (ou seja, é negativo)
            System.out.println("O numero é negativo"); // Exibe que o número é negativo

    }
}
