import java.util.Scanner;

/*Lista de exercíos 1
     Crie um programa utilizando a linguagem java que leia um número interio e imprima o seu ANTECESSOR
     e o seu SUCESSOR.
     Obs: Utilize o tipo de dado inteiro.

     Data: 22/03/2025
     Programador: Daniel
     Professora: Luciana Fugita


     Ex3 - Antecessor e Sucessor
     1 - Ler a variável numero:
     2 - Subtrair 1 na variável numero e atribuir na variável antecessor;
     3 - Adicionar 1 na variável numero e atribuir na variavel sucessor;
     4 - Exibir resultado da variável da antecessor;
     5 - Exibir resultado da variável sucessor;
 */
public class L1ex3 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int antecessor, numero;

        System.out.printf("Digite um numero inteiro");
        //ler a variavel numero
        numero = ler.nextInt();
        //calcula o antecessor do numero
        antecessor = numero - 1;

        int sucessor, numero2;
        System.out.printf("Digite um numero inteiro");
        //ler a variavel numero
        numero2 = ler.nextInt();
        // calcula o sucessor do numero
        sucessor = numero + 1;





        System.out.println("O antecessor de " + numero + " é " + antecessor);
        System.out.println("O sucessor de " + numero2 + " é " + sucessor);




                   }
}
