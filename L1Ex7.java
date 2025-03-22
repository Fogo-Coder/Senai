
/*Lista de exercíos 1
     Crie um fluxograma e um programa utilizando a linguagem Java que leia os lados do retângulo
e exiba o seu perímetro e a área.

     Data: 22/03/2025
     Programador: Daniel
     Professora: Luciana Fugita

     Ex7 - lendo a area de um retangulo
     1- Ler a variavel
     2- calcular a area do retangulo
     3- Imprimir o valor
     */

import java.util.Scanner;

public class L1Ex7 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        // declarando as variaveis
        double ladomenor, ladomaior, perimetro, area;

        //entrada de dados
        System.out.println("Digite o lado menor ");
        ladomenor = ler.nextDouble();

        System.out.println("Digite o lado maior ");
        ladomaior = ler.nextDouble();


        area = ladomenor * ladomaior;
        perimetro = 2 * (ladomenor + ladomaior);

        System.out.println("O perímetro do retangulo é: " + perimetro);
        System.out.println("A área do retangulo  é: " + area);


    }
}