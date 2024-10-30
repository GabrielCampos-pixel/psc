package OrientadaObjetos;
import java.util.Scanner;
public class Inteiro {
    //Metodo multiplicacao
    public int multiplicacao(int a, int b) {
        int resultado = 0;
        for(int i =0; i < b; i++) {
            resultado += a;
        }
        return resultado;
    }
    //Metodo potencia
    public int potencia(int a, int b) {
        int resultado = 1;
        for (int i = 0; i < b; i++) {
            resultado = multiplicacao(resultado, a);
        }
        return resultado;
    }
    //Metodo divisao
    public int divisao(int a, int b) {
        if(b==0) {
            System.out.println("Divisão por 0 não é validá");
        }
        int resultado = 0;
        while (a > b) {
            a -=b;
            resultado++;
        }
        return resultado;
    }
    //Metodo verifica se é par ou ímpar
    public boolean par(int a) {
        return resto(a, 2) ==0;
    }
    //Metodo calcula resto
    public int resto(int a, int b) {
        while (a>= b) {
            a -= b;
        }
        return a;
    }
    //Teste
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Inteiro inteiro = new Inteiro();
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Multiplicação");
            System.out.println("2 - Potência");
            System.out.println("3 - Divisão");
            System.out.println("4 - Par");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1: // Multiplicação
                    System.out.print("Informe o primeiro número: ");
                    int num1 = teclado.nextInt();
                    System.out.print("Informe o segundo número: ");
                    int num2 = teclado.nextInt();
                    System.out.println("Resultado: " + inteiro.multiplicacao(num1, num2));
                    break;
                case 2: // Potência
                    System.out.print("Informe a base: ");
                    int base = teclado.nextInt();
                    System.out.print("Informe o expoente: ");
                    int expoente = teclado.nextInt();
                    System.out.println("Resultado: " + inteiro.potencia(base, expoente));
                    break;
                case 3: // Divisão
                    System.out.print("Informe o dividendo: ");
                    int dividendo = teclado.nextInt();
                    System.out.print("Informe o divisor: ");
                    int divisor = teclado.nextInt();
                    System.out.println("Resultado: " + inteiro.divisao(dividendo, divisor));
                    break;
                case 4: // Verificar se é par
                    System.out.print("Informe um número: ");
                    int numero = teclado.nextInt();
                    System.out.println("O número " + numero + (inteiro.par(numero) ? " é par." : " não é par."));
                    break;
                case 5: // Sair
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);
    }    
}