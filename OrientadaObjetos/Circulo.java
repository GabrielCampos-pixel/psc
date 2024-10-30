package OrientadaObjetos;
import java.util.Scanner;
public class Circulo {
    private int x,y;
    private double raio;
    public Circulo(int x, int y, double raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }
    //Contrutora vazia
    public Circulo() {
        this.x = 0;
        this.y = 0;
        this.raio = 0;
    }
    //Metodo calcula area
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
    //Metodo calcula perimetro
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
    //Metodo mover horizontalmente(x)
    public void moveX(int x1) {
        this.x += x1;
    }
    //Metodo mover verticalmente(y)
    public void moveY(int y1) {
        this.y += y1;
    }
    //Metodo aumenta raio
    public void aumenta(double r) {
        this.raio *= r;
    }
    //Metodo para exibir informações do circulo
    public String exibe() {
        return String.format("Centro: (%d, %d)\nRaio: %.2f\nArea: %.2f\nPerimetro: %.2f",x, y, raio, calcularArea(), calcularPerimetro());
    }
    //teste
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a coordenada x do círculo: ");
        int x = teclado.nextInt();
        System.out.print("Informe a coordenada y do círculo: ");
        int y = teclado.nextInt();
        System.out.print("Informe o raio do círculo: ");
        double raio = teclado.nextDouble();
        Circulo circulo = new Circulo(x, y, raio);
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Mover");
            System.out.println("2 - Aumentar");
            System.out.println("3 - Imprimir");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1: // Mover
                    System.out.print("Mover X por quantas unidades? ");
                    int moveX = teclado.nextInt();
                    circulo.moveX(moveX);
                    System.out.print("Mover Y por quantas unidades? ");
                    int moveY = teclado.nextInt();
                    circulo.moveY(moveY);
                    break;
                case 2: // Aumentar
                    System.out.print("Aumentar o raio por quanto? ");
                    double aumento = teclado.nextDouble();
                    circulo.aumenta(aumento);
                    break;
                case 3: // Imprimir
                    System.out.println(circulo.exibe());
                    break;
                case 4: // Sair
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);
    }    
}