import java.util.Scanner;

/*Lista de exercíos 1
     Crie um programa utilizando a linguagem Java que leia o lado do quadrado e
exiba o seu perímetro e a área.

     Data: 22/03/2025
     Programador: Daniel
     Professora: Luciana Fugita

    Ex6 - perímetro quadrado
    1- ler a variavel do quadrade
    2- calcular o perimetro e a sua area
    3- imprimir o valor

 */
public class L1Ex6 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        //declarando as variaveis
         double  lado, perimetro;


        //Entrada de dados
        System.out.printf(" Digite o valor do lado");


        //ler a variavel
        lado = ler.nextDouble();


        double area = Math.pow(lado, 2);
        perimetro = 4 * lado;

        System.out.println("A área do quadrado é: " + area);
        System.out.println("O perímetro do quadrado é: " + perimetro);


    }
}
