import java.util.Scanner;

/*Lista de exercíos 1
     Crie um programa que leia o valor do salário mínimo e o valor do salário de um
usuário, calcule a quantidade de salários mínimos que esse usuário ganha e imprima o
resultado. Obs. Salário mínimo: R$1.640,00.
     Obs: Utilize o tipo de dado inteiro.

     Data: 22/03/2025
     Programador: Daniel
     Professora: Luciana Fugita

     Ex8 - Salario minimo
     1 - ler a variavel
     2 - calcular qual o valor do salario minimo
     3 - imprimir o resultado
 */
     public class L1Ex8 {
          public static void main(String[] args){
               Scanner ler = new Scanner(System.in);

               double salriominimo= 1640.00;
               double salarioUsuario;
               System.out.printf("Digite o seu salario");
               salarioUsuario = ler.nextDouble();

               double quantidadesalario= salarioUsuario/salriominimo;

               System.out.println( "voce ganha 2.f% salario minimos" + quantidadesalario );

               }

          }


