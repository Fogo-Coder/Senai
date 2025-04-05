import java.util.Scanner;

/*Lista de exercíos 2
Crie um programa que calcule e exiba o perímetro (cm) de um círculo, solicitando o raio (cm) ao
usuário. Utilizar a fórmula Perímetro = 2 × π × raio.
     Data: 29/03/2025
     Programador: Daniel
     Professora: Luciana Fugita

     Ex3 - Calculo
    1- ler a variavel calculo
    2- ler a variavel perimetro
    3- ler a variavel raio
    4- realizar o calculo
    5- imprimir o valor do raio


 */
public class Ex3 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler o valor do usuário.
        Scanner ler = new Scanner(System.in);

        // Solicita ao usuário o valor do raio do círculo.
        System.out.println("Digite o valor do raio do círculo (em cm):");
        double raio = ler.nextDouble();

        // Calcula o perímetro usando a fórmula 2 × π × raio.
        double perimetro = 2 * Math.PI * raio;

        // Exibe o perímetro do círculo.
        System.out.printf("O perímetro do círculo é: %.2f cm%n", perimetro);
    }
}