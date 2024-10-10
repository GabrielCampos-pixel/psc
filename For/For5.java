package For;
import java.util.*;
public class For5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer maior = null;
        Integer menor = null;

        for (;;) {
            System.out.print("Digite um número inteiro (ou sair para encerrar):");
            String entrada = scanner.nextLine();
            try {
                int num = Integer.parseInt(input);
                if (maior == null || num > maior) {
                    maior = num;
                }
                if (menor == null || num < menor) {
                    menor = num;
                }

            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida.Por favor, digite um numero inteiro ou sair");
            }
        }
        if(maior != null && menor != null) {
            System.out.println("O maior número informado foi : " + maior);
            System.out.println("O menor número informado foi : " + menor);
        } 
        else {
            System.out.println("Nenhum valido foi informado.");
        }
    }
}