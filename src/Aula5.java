import java.util.Scanner;

/*  EXEMPLO 1 DESVIO CONDICIONAL SIMPLES
     if(teste-condicional)
     Verifica se o número digitado é positivo

     Data: 05/04/2025
     Programador: Daniel
     Professora: Luciana Fugita
 */
public class Aula5 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número");
        int num = ler.nextInt();

        if (num > 0){
            System.out.println("O número é positivo ");
        }
    }

}
