import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int codePeca1 = input.nextInt();
        int qtdPeca1 = input.nextInt();
        double valorPeca1 = input.nextDouble();
        int codePeca2 = input.nextInt();
        int qtdPeca2 = input.nextInt();
        double valorPeca2 = input.nextDouble();

        double custoTotal = qtdPeca1 * valorPeca1 + qtdPeca2 * valorPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", custoTotal);

        input.close();
    }
}
