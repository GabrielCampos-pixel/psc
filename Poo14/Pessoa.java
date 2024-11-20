import java.util.ArrayList;
import java.util.Scanner;

class Pessoa {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

class PessoaFisica extends Pessoa {
    private String cpf;

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
}

class PessoaJuridica extends Pessoa {
    private String cnpj;

    public String getCNPJ() {
        return cnpj;
    }

    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }
}

class Cadastro {
    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void cadastrarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void listarPessoas() {
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof PessoaFisica) {
                System.out.println("Pessoa Fisica - Nome: " + pessoa.getNome() + ", CPF: " + ((PessoaFisica) pessoa).getCPF());
            } else if (pessoa instanceof PessoaJuridica) {
                System.out.println("Pessoa Juridica - Nome: " + pessoa.getNome() + ", CNPJ: " + ((PessoaJuridica) pessoa).getCNPJ());
            }
        }
    }
}

public class TesteCadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cadastro cadastro = new Cadastro();

        System.out.println("Deseja cadastrar uma Pessoa Fisica (1) ou Juridica (2)?");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao == 1) {
            PessoaFisica pf = new PessoaFisica();
            System.out.print("Informe o nome: ");
            pf.setNome(scanner.nextLine());
            System.out.print("Informe o CPF: ");
            pf.setCPF(scanner.nextLine());
            cadastro.cadastrarPessoa(pf);
        } else if (opcao == 2) {
            PessoaJuridica pj = new PessoaJuridica();
            System.out.print("Informe o nome: ");
            pj.setNome(scanner.nextLine());
            System.out.print("Informe o CNPJ: ");
            pj.setCNPJ(scanner.nextLine());
            cadastro.cadastrarPessoa(pj);
        }

        System.out.println("Lista de Pessoas Cadastradas:");
        cadastro.listarPessoas();

        scanner.close();
    }
}