import java.util.Scanner;

/*  EXEMPLO 3 DESVIO CONDICIONAL SIMPLES
     if(teste-condicional)
     Verifica se uma pessoa é maior de idade
     Obs: Usar a idade tipo inteiro

     Data: 05/04/2025
     Programador: Daniel
     Professora: Luciana Fugita
 */
public class Aula5Exemplo3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Declaração da variável 'idade' e inicialização com 0
        int idade = 0;

        // Exibe uma mensagem pedindo ao usuário para digitar um número inteiro
        System.out.println("Digite um número inteiro ");

        // Lê a entrada do usuário e armazena na variável 'idade'
        idade = scanner.nextInt();

        // Condicional if: verifica se a idade é maior ou igual a 18
        if (idade >= 18) {
            // Se a condição for verdadeira (idade maior ou igual a 18), exibe a mensagem
            System.out.println("Você é maior de idade");
        } else {
            // Caso contrário (idade menor que 18), exibe a mensagem
            System.out.println("Você é menor de idade");
        }
    }
}

