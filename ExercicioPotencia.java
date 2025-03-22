import java.util.Scanner;

public class ExercicioPotencia {
    public static void main(String[] args){
        Scanner ler= new Scanner(System.in);

        //entrada de dados
        System.out.print("Digite a base: ");
        double base = ler.nextDouble();
        System.out.print("Digite o expoente: ");
        double exponte = ler.nextDouble();

        System.out.println("O resultado é " + Math.pow(base, exponte));
    }
}
