package ListaExercicio1;

import java.util.Scanner;

/*Lista de exercíos 1
     Crie um programa utilizando a linguagem Java que leia um número inteiro e
imprima o triplo do seu valor.
     Obs: Utilize o tipo de dado inteiro.

     Data: 22/03/2025
     Programador: Daniel
     Professora: Luciana Fugita

 Ex5 - Multiplicador *3
 1- Ler a variavel numero
 2- Multiplicar o valor da variavel por 3
 3- Imprimir o resultado


 */
public class L1Ex5 {
   public static void main(String[] args) {
       Scanner ler= new Scanner(System.in);

        //Declarando as variaveis
        int numero, multiplicador;

       //Entrada de Dados
        System.out.print("Digite um numero inteiro");

        //Ler a variavel
        numero = ler.nextInt();
        multiplicador = numero * 3;

        System.out.println("O numero" +numero +"multiplicado por 3 é " + multiplicador);

    }
}
