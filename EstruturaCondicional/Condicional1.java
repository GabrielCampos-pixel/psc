package EstruturaCondicional;
import java.util.*;
public class Condicional1 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite duas notas");
        int nota1 = teclado.nextInt();
        int nota2 = teclado.nextInt();
        med = (nota1 + nota2)/2;
        System.out.println("A media entre as duas notas é:" + med);

        if(med>=7) {
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
    }
}