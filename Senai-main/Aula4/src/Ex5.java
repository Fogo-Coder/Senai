import java.text.DecimalFormat;
import java.util.Scanner;

/*
       EXEMPLO COM SEQUÊNCIA DE ESCAPE

 */
public class Ex5 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        float num = ler.nextFloat();


        System.out.println("Número formatado:" + df.format(num));
    }
}
