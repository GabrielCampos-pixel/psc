import psc.Retangulo;
import java.util.Scanner;
public class Main {
    public static void main(String Args[]) {
        Retangulo ret = new Retangulo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a altura do retângulo: ");
        ret.setAltura(scanner.nextFloat());
        System.out.print("Informe a largura do retângulo: ");
        ret.setLargura(scanner.nextFloat());
        ret.exibe();
    }
}