import java.util.Scanner;

/*Lista de exercíos 2
Escreva um programa que calcule a média geométrica entre três números informados pelo
usuário. Utilize o tipo de dados double.
     Data: 29/03/2025
     Programador: Daniel
     Professora: Luciana Fugita

     Ex1 - Média Geometrica
    1- ler a variavel da media
    2- ler o numero 1
    3-  ler o numero 2
    4- ler o numero 3
    5- calcular a media informada pelo usuários
    3- imprimir o valor das funçoes calculadas

 */
public class Ex2 {
    public static void main(String[] args){
        Scanner ler= new Scanner(System.in);

        // Declaração de variáveis para armazenar os resultados das operações.
        double num1, num2, num3;


        // Solicita ao usuário o primeiro número e o armazena na variável num1.
        num1 = ler.nextDouble();
        // Solicita ao usuário o segundo número e o armazena na variável num2.
        num2 = ler.nextDouble();
        // Solicita ao usuário o terceiro número e o armazena na variável num3.
        num3 = ler.nextDouble();


        // Utiliza Math.cbrt() para calcular a raiz cúbica do produto de num1, num2 e num3.
        double media = Math.cbrt(num1*num2*num3);

        System.out.println("A média geometrica é "+ media);

    }
}
