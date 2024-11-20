import java.util.Scanner;

class Inteiro {
    public int multiplicacao(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < Math.abs(b); i++) {
            resultado += a;
        }
        return b < 0 ? -resultado : resultado;
    }

    public int potencia(int a, int b) {
        int resultado = 1;
        for (int i = 0; i < b; i++) {
            resultado = multiplicacao(resultado, a);
        }
        return resultado;
    }

    public int divisao(int a, int b) {
        int quociente = 0;
        int sinal = (a < 0 ^ b < 0) ? -1 : 1;
        a = Math.abs(a);
        b = Math.abs(b);
        while (a >= b) {
            a -= b;
            quociente++;
        }
        return quociente * sinal;
    }

    public int resto(int a, int b) {
        while (a >= b) {
            a -= b;
        }
        return a;
    }

    public boolean par(int a) {
        return resto(a, 2) == 0;
    }
}

public class TesteInteiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inteiro inteiro = new Inteiro();

        int opcao;
        do {
            System.out.println("1 – Multiplicação.");
            System.out.println("2 – Potência.");
            System.out.println("3 – Divisão.");
            System.out.println("4 – Par.");
            System.out.println("5 – Sair.");
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o valor de a: ");
                int a = scanner.nextInt();
                System.out.print("Digite o valor de b: ");
                int b = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Resultado da Multiplicação: " + inteiro.multiplicacao(a, b));
                        break;
                    case 2:
                        System.out.println("Resultado da Potência: " + inteiro.potencia(a, b));
                        break;
                    case 3:
                        System.out.println("Resultado da Divisão: " + inteiro.divisao(a, b));
                        break;
                    case 4:
                        System.out.println("É par? " + inteiro.par(a));
                        break;
                }
            }
        } while (opcao != 5);

        scanner.close();
    }
}