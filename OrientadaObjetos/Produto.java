package OrientadaObjetos;
import java.util.Scanner;
public class Produto {
    private static int ultimoId = 1;
    private int id;
    private String nome;
    private double preco;
    //Contrutora sem parametro
    public Produto() {
        this.id = ultimoId++;
        this.nome = "Nome não informado";
        this.preco = 0;
    }
    //Contrutora com parametro
    public Produto(String nome, double preco) {
        this();
        this.nome = nome;
        setPreco(preco);
    }
    //Metodo obter id
    public int getId() {
        return id;
    }
    //Metodo get nome
    public String getNome() {
        return nome;
    }
    //Metodo set nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    //Metodo get preco
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        if(preco<0)
        this.preco = 0;
        else
        this.preco = preco;
    }
    //Metodo exibe
    public void exibe() {
        System.out.println("Produto: " + nome);
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
    }
    //Metodo para reajustar preco
    public void reajustarPreco(double percentual) {
        if(percentual<0)
        System.out.println("Percentual de reajuste inválido");
        else
        this.preco += this.preco * (percentual/100);
    }
    //Teste
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o nome do primeiro produto: ");
        String nome1 = teclado.nextLine();
        System.out.print("Informe o preço do primeiro produto: ");
        double preco1 = teclado.nextDouble();
        teclado.nextLine(); // Limpar o buffer
        Produto produto1 = new Produto(nome1, preco1);
        System.out.print("Informe o nome do segundo produto: ");
        String nome2 = teclado.nextLine();
        System.out.print("Informe o preço do segundo produto: ");
        double preco2 = teclado.nextDouble();
        Produto produto2 = new Produto(nome2, preco2);
        System.out.print("Informe o percentual de reajuste para o primeiro produto: ");
        double reajuste1 = teclado.nextDouble();
        produto1.reajustarPreco(reajuste1);
        System.out.println("\nInformações do Primeiro Produto:");
        produto1.exibe();
        System.out.println("\nInformações do Segundo Produto:");
        produto2.exibe();
        System.out.println("\nÚltimo ID gerado: " + (ultimoId - 1));
    }    
}