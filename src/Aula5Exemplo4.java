/*  EXEMPLO 4 DESVIO CONDICIONAL COMPOSTO
     Criar um programa queverifica se o número é maior que 100 ou não.

     Sintaxe:
     if(teste-condicional){
     linha_instrução_se_verdadeiro;
     }
     else{
     linha_instrução_se_falo;
     }
     Data: 05/04/2025
     Programador: Daniel
     Professora: Luciana Fugita
 */

import java.util.Scanner;

public class Aula5Exemplo4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        System.out.println("Digite um numero ");
        numero =scanner.nextInt();

// Primeiro if: verifica se o número é maior ou igual a 100
        if(numero >100)

// Segundo if: verifica se o número é igual a 100
            System.out.println("O numero é maior que 100");
        else if(numero == 100)

            // Caso o número seja menor que 100, este else será executado
            System.out.println("o nú,ero é igual a 100");
        else
            System.out.println("número menor que 100");

    }
}
