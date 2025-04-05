package ListaExercicio3;
/*  Faça um programa que leia as notas de duas provas, calcule a média aritmética simples, e
informe se o aluno foi aprovado (média maior ou igual a 6) ou reprovado (média menor que 6).

Ex1 - Nota Aluno

1- ler a variável nota1;
2- ler a variável nota2;
3- calcular a media
5- indicar se o aluno foi aprovado ou reprovado  ;
6-  Exibir o maior valor da variavel

    Data: 05/04/2025
     Programador: Daniel
     Professora: Luciana Fugita
*/

import java.util.Scanner;

public class Exercicio4 {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    double media;
    double num1,num2;
    System.out.println("Digite a primeira nota");
    num1 = scanner.nextDouble();
    System.out.println("Digite a segunda nota");
    num2 = scanner.nextDouble();

    media = (num1 + num2) / 2;

    if(num1/num2 > 6)
        System.out.println("O aluno foi aprovado " + media);
    else
        System.out.println("O aluno foi reprovado " + media);
}
}
