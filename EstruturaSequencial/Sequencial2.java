package EstruturaSequencial;
import java.util.*;
public class Sequencial2 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o ano de nascimento");
        int anoNascimento = teclado.nextInt();
        System.out.println("digite o ano atual");
        int anoAtual = teclado.nextInt();
        System.out.println("sua idade é: " + (anoAtual - anoNascimento));
        System.out.println("digite ano futuro");
        int anoFuturo = teclado.nextInt();
        System.out.println("A sua idade sera: " + (anoFuturo - anoNascimento));
        System.exit(0);
    }
}