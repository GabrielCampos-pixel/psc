import java.util.Scanner;

class Produto {
    private static int ultimoId = 0;
    private int id;
    private String nome;
    private double preco;

    public Produto() {
        this.id = ultimoId++;
        this.nome = "Nome não informado";
        this.preco = 0;
    }

    public Produto(String nome, double preco) {
        this();
        this.nome = nome;
        setPreco(preco);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            this.preco = 0;
        } else {
            this.preco = preco;
        }
    }

    public static int getUltimoId() {
        return ultimoId - 1;
    }

    public void exibe() {
        System.out.println("Produto: " + nome);
        System.out.println("Id: " + id);
        System.out.println("Preço: " + preco);
    }

    public void reajustaPreco(double percentual) {
        this.preco += this.preco * percentual / 100;
    }
}

public class TesteProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do primeiro produto:");
        String nome1 = scanner.nextLine();
        System.out.println("Informe o preço do primeiro produto:");
        double preco1 = scanner.nextDouble();
        Produto produto1 = new Produto(nome1, preco1);

        scanner.nextLine();

        System.out.println("Informe o nome do segundo produto:");
        String nome2 = scanner.nextLine();
        System.out.println("Informe o preço do segundo produto:");
        double preco2 = scanner.nextDouble();
        Produto produto2 = new Produto(nome2, preco2);

        System.out.println("Informe o percentual de reajuste:");
        double reajuste = scanner.nextDouble();
        produto1.reajustaPreco(reajuste);
        produto2.reajustaPreco(reajuste);

        System.out.println("Informações dos produtos:");
        produto1.exibe();
        produto2.exibe();

        System.out.println("Último ID gerado: " + Produto.getUltimoId());

        scanner.close();
    }
}