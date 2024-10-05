package EstruturaCondicional;
import java.util.*;
public class Condicional2 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite os lados do triangulo");
        double l1 = teclado.nextDouble();
        double l2 = teclado.nextDouble();
        double l3 = teclado.nextDouble();

        if(l1==l2 && l2==l3){
            System.out.println("Equilatero");
        }        
        else if(l1==l2 || l1==l3 || l2==l3){
            System.out.println("Isósceles");
        }    
        else {
            System.out.println("Escaleno");
        }    
    }
}