package EstruturaSequencial;
import java.util.*;
public class Sequencial4 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o salario do funcionario");
        double salarioFuncionario = teclado.nextDouble();
        double novoSalario = (salarioFuncionario * 0.25);
        System.out.println("funcionario receberá: " + (salarioFuncionario + novoSalario));
        System.exit(0);
    }
}