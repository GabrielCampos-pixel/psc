package EstruturaSequencial;
import java.util.*;
public class Sequencial3 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite a cotação do dolar");
        double cotacaoDolar = teclado.nextDouble();
        System.out.println("digite quantos dolares voce tem");
        double dolares = teclado.nextDouble();
        System.out.println("valor em real:R$ " + (cotacaoDolar * dolares));
        System.exit(0);
    }
}