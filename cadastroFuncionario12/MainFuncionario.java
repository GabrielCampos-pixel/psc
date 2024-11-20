package cadastroFuncionario;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cadastro cadastro = new Cadastro(5);
        for (int i = 0; i < 5; i++) {
            System.out.println("Cadastro do Funcionário #" + (i + 1));
            System.out.print("Nome: ");
            String nome = teclado.nextLine();
            System.out.print("Idade: ");
            int idade = teclado.nextInt();
            scanner.nextLine();
            System.out.print("Cargo: ");
            String cargo = teclado.nextLine();
            System.out.print("Salário: ");
            double salario = teclado.nextDouble();
            scanner.nextLine();
            System.out.print("Telefone: ");
            String telefone = teclado.nextLine();
            System.out.print("Endereço: ");
            String endereco = teclado.nextLine();
            Funcionario funcionario = new Funcionario(nome, idade, cargo, salario, telefone, endereco);
            cadastro.cadastrarFuncionario(funcionario);
        }
        System.out.println("\nLista de Funcionários Cadastrados:");
        cadastro.exibeCadastro();
    }
}