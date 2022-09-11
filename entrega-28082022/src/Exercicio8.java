import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int numerofuncionario = input.nextInt();
        int horastrabalhadas = input.nextInt();
        double valorhora = input.nextDouble();
        double salario = horastrabalhadas * valorhora;

        System.out.println("NUMBER = " + numerofuncionario);
        System.out.printf("SALARY = U$ %.2f%n" , salario);

        input.close();

    }
}
