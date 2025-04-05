import java.util.Scanner;

/*  EXEMPLO  DESVIO CONDICIONAL COMPOSTO
     Criar um programa queverifica se o número é maior que 100 ou menor que 100.

     Sintaxe:
     if(teste-condicional){
     linha_instrução_se_verdadeiro;
     }
     else{
     linha_instrução_se_falo;
     }
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
public class Aula5Exemplo5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Digite úm numero inteiro:");
        numero = scanner.nextInt();

        if (numero > 100){
            System.out.println("O número é maior que 100.");
        }
        else {
            if(numero ==100) {
                System.out.println("O número é igual a 100. ");
            }
                    else {
                    System.out.println("O número é menor que 100.");
                }
                }
            }
        }




