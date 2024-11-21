import psc.Retangulo;
import java.util.Scanner;
public class Main {
    public static void main(String Args[]) {
        Retangulo ret = new Retangulo();
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a altura do retângulo: ");
        ret.setAltura(teclado.nextFloat());
        System.out.print("Informe a largura do retângulo: ");
        ret.setLargura(teclado.nextFloat());
        ret.exibe();
        teclado.close();
    }
}