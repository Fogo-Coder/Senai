import java.util.Scanner;

/*  EXEMPLO 2 DESVIO CONDICIONAL SIMPLES
     if(teste-condicional)
     Verifica se o número digitado é par

     Data: 05/04/2025
     Programador: Daniel
     Professora: Luciana Fugita
 */
public class Aula5Exemplo2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digitte um número inteiro");
        int num = scanner.nextInt();

        //a variável resto guarda o resultado do cálculo de divisão
        // do operador modular
        int resto = num % 2;
        //verifica se o resto é igual a zero
        if (resto == 0)
            System.out.println("O número é par ");
        else
            System.out.println("o número é impar");
    }
}
