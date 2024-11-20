package ContaCorrente;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente;
        contaCorrente = new ContaCorrente();
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o número da conta: ");
        int numeroConta = teclado.nextInt();
        System.out.print("Informe a agência da conta: ");
        int agencia = teclado.nextInt();
        contaCorrente.iniciarContaCorrente(numeroConta, agencia);
        System.out.print("Informe o valor para depósito: ");
        double deposito = teclado.nextDouble();
        contaCorrente.depositar(deposito);
        System.out.println("\nDados da conta após o depósito:");
        contaCorrente.exibe();
        System.out.print("\nInforme o valor para saque: ");
        double saque = teclado.nextDouble();
        contaCorrente.sacar(saque);
        System.out.println("\nDados da conta após o saque:");
        contaCorrente.exibe();
    }
}