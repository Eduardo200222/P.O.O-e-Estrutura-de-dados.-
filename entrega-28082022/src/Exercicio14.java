import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int distanciapecorrida = input.nextInt();
        double totalcombustivel= input.nextDouble();

        double mediacombustivel = distanciapecorrida / totalcombustivel;

        System.out.printf("%.3f km/l%%n", mediacombustivel);





        input.close();
    }
}
