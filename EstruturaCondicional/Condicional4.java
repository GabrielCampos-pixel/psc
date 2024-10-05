package EstruturaCondicional;
import java.util.*;
public class Condicional4 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o peso");
        double peso = teclado.nextDouble();
        System.out.println("digite a altura");
        double altura = teclado.nextDouble();
        imc = (altura*altura)/peso;
        System.out.println("O indice de massa corporanea é:" + imc);

        if(imc<20) {
            System.out.println("Abaixo do peso");
        }
        else if(imc>=20 && imc<25) {
            System.out.println("Normal");
        }
        else if(imc>=25 && imc<30) {
            System.out.println("Sobre peso");
        }
        else if(imc>=30 && imc<40) {
            System.out.println("Obesidade");
        }
        else {
            System.out.println("Nao informado");
        }
    }
}