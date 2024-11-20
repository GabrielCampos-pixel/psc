package banco;
import java.util.*;
public class ContaCorrente {
    private int numero, agencia;
    private double saldo;
    public void iniciarContaCorrente(int n, int ag) {
        numero = n;
        agencia = ag;
        saldo = 0;
    }
    public void sacar(double valor){
        if(valor > saldo){
            System.out.println("Erro: Saldo insuficiente para realizar o saque.");
        }else{
            saldo -= valor;
            System.out.println("Saque de R$" + valor + "realizado com sucesso.");
        }
    }
    public void depositar(double valor){
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: O valor do depósito deve ser positivo.");
        }
    }
    public double consultarSaldo(){
        return (saldo);
    }
    public void exibe() {
        System.out.println("Número da Conta: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo: " + saldo);
    }
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