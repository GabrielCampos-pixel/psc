package EstruturaSequencial;
import java.util.*;
public class Sequencial7 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o valor do salario minimo");
        double salarioMinimo = teclado.nextDouble();
        System.out.println("digite o valor do salario do funcionario");
        double salarioFuncionario = teclado.nextDouble();
        System.out.println("salarios minimos que funcionario recebe: " + (salarioFuncionario / salarioMinimo));
        System.exit(0);
    }
}