package EstruturaCondicional;
import java.util.*;
public class Condicional5 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o valor de x");
        double x = teclado.nextDouble();
        double resultado;

        if(x<-2) {
            System.out.println("resultado é =" + 2*x+2);
        }
        else if(x <3 && x >=-2) {
            System.out.println("resultado é =" + 3);
        }
        else if(x >=3) {
            System.out.println("resultado é =" + -x);
        }
    }
}