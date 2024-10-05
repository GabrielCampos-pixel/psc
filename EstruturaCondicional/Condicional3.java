package EstruturaCondicional;
import java.util.*;
public class Condicional3 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite tres notas");
        int nota1 = teclado.nextInt();
        int nota2 = teclado.nextInt();
        int nota3 = teclado.nextInt();
        med = (nota1 + nota2 + nota3)/3;
        System.out.println("A media entre as tres notas é:" + med);

        if(med>=7 && med<=10) {
            System.out.println("Aprovado");
        }
        else if(med>=3 && med<7) {
            System.out.println("Exame");
        }
        else if(med>=0 && med<3) {
            System.out.println("Reprovado");
        }
    }
}