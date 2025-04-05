/*  EXEMPLO 4 DESVIO CONDICIONAL COMPOSTO
     Criar um programa queverifica se o número é maior que 100 ou não.

     Sintaxe:
     if(teste-condicional){
     linha_instrução_se_verdadeiro;
     }
     else{
     linha_instrução_se_falso;
     }
     Data: 05/04/2025
     Programador: Daniel
     Professora: Luciana Fugita
 */
import java.util.Scanner;

public class Aula5Exemplo4a {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

       double numero = 0;

        System.out.println("Digite um numero ");
        numero =scanner.nextInt();

// Primeiro if: verifica se o número é maior ou igual a 100
        if(numero >100)
            System.out.println("o número é maior que 100");

        else
            System.out.println("número menor que 100");

    }
}