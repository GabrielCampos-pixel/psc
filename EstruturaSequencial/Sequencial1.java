package EstruturaSequencial;
import java.util.*;
public class Sequencial1 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double primeiraNota, segundaNota, terceiraNota, media;
        System.out.println("digite a primeira nota");
        primeiraNota = teclado.nextDouble();
        System.out.println("digite a segunda nota");
        segundaNota = teclado.nextDouble();
        System.out.println("digite a terceira nota");
        terceiraNota = teclado.nextDouble();

        media = (primeiraNota + segundaNota + terceiraNota) / 3;
        
        System.out.println("A média aritmética é: " + media);
        System.exit(0);
    }
}