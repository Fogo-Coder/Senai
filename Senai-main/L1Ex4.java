
/*Lista de exercíos 1
     Crie um programa utilizando a linguagem Java que leia um número real e
imprima 1⁄4 deste número.
     Obs: Utilize o tipo de dado inteiro.

     Data: 22/03/2025
     Programador: Daniel
     Professora: Luciana Fugita

     Ex4 - Número Real
      1- Ler a variavel numero
      2 - Dividir o valor do numero por 1/4
      3 - imprimir o valor desse numero
 */

    import java.util.Scanner;

    public class L1Ex4 {
        public static void main(String[] args){
            Scanner ler = new Scanner(System.in);

            //Declarando as variaveis
          double numero, divisor ;

            //Entrada de dados
            System.out.printf("Digite o número inteiro");

            //Ler a variavel numero
            numero = ler.nextDouble();
            divisor = numero / (1.0/4.0);

            System.out.printf("O número %.2f dividido por 1/4 é %.2f\n", numero, divisor);

        }
    }
