package EstruturaCondicional;
import java.util.*;
public class Condicional6 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe o valor de a");
        double a = teclado.nextDouble();
        System.out.println("informe o valor de b");
        double b = teclado.nextDouble();
        System.out.println("informe o valor de c");
        double c = teclado.nextDouble();

        if((b - c < a && a < b + c) && (a - c < b && b < a + c) && (a - b < c && c < a + c)) {
            System.out.println("Verdadeiro");
        }
        else {
            System.out.println("Falso");
        }
    }
}