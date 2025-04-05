package ListaExercicio1;

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
     public static void main(String[] args) {
          // Criação de um objeto Scanner para ler entradas do usuário
          Scanner ler = new Scanner(System.in);

          // Definindo o valor do salário mínimo
          double salariominimo = 1640.00;

          // Declaração da variável para o salário do usuário
          double salarioUsuario;

          // Solicita ao usuário que digite seu salário
          System.out.print("Digite o seu salário: ");
          salarioUsuario = ler.nextDouble();

          // Calcula quantos salários mínimos o usuário recebe
          double quantidadesalario = salarioUsuario / salariominimo;

          // Exibe a quantidade de salários mínimos, formatando o valor com 2 casas decimais
          System.out.printf("Você ganha %.2f salários mínimos.\n", quantidadesalario);


     }
}
