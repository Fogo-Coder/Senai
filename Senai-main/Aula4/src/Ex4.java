import java.util.Scanner;

/*
       EXEMPLO COM SEQUÊNCIA DE ESCAPE

 */
public class Ex4 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float num = ler.nextFloat();
        System.out.printf("Número formatado %.2f", num);
    }
}
