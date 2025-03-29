import java.util.Scanner;

/*Lista de exercíos 2
Escreva um programa que calcule a área (mm2) de um círculo a partir do raio (mm), utilizando a
fórmula Área = π × raio2

     Data: 29/03/2025
     Programador: Daniel
     Professora: Luciana Fugita

     Ex4 - Calcular o raio
    1- ler a variavel calculo
    2- ler a variavel perimetro
    3- ler a variavel raio
    4- realizar o calculo
    5- imprimir o valor do calculo

 */
public class Ex4 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        // Solicita ao usuário o valor do raio do círculo.
        System.out.println("Digite o valor do raio do círculo (em cm):");
        double raio = ler.nextDouble();

        // Calcula a area  usando a fórmula 2 × π × raio.
        double area = Math.PI * Math.pow(raio,2);

        // Exibe o perímetro do círculo.
        System.out.printf("A area  do círculo é: %.2f cm%n", area);
    }
}
