import java.util.Scanner;

/*
Lista de Exercícios 1

Crie um programa que imprima a média aritmétrica de duas notas.

Data: 15/03/2025
Programador: Daniel C Andrade
Professora: Luciana Fugita

Ex1 - Média aritmética
1- ler a variável nota1;
2- ler a variável nota2;
3- Atribuir a soma das variáveis nota1 e nota2 na variável total;
4- Dividir a variável total por dois e atribuir na variável media;
5- Exibir o valor da variável media.
 */
public class L1EX1 {
    public static void  main(String[] args){
        //Instanciando a classe Scanner
        Scanner ler = new Scanner(System.in);
        //Declarando as variáveis
       double nota1;
      double nota2;
       double media;
       //entrada de dados
        System.out.print("Digite a primeira nota: ");
        nota1 =ler.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = ler.nextDouble();

        //Processamento
        double total = nota1 + nota2;
        media = total / 2.0;

                //saida de dados
        System.out.print("A média e " + media);


    }

}
