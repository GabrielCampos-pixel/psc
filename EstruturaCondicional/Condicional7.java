package EstruturaCondicional;
import java.util.*;
public class Equação {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe o valor de a");
        double a = teclado.nextDouble();
        System.out.println("informe o valor de b");
        double b = teclado.nextDouble();
        System.out.println("informe o valor de c");
        double c = teclado.nextDouble();

        if(a==0 && b==0 && c==0) {
            System.out.println("Igualdade confirmada:0=0");
        }
        else if(a==0 && b==0 && c!=0) {
            System.out.println("Coeficientes informados incorretamete");
        }
        else if(a==0 && b!=0) {
            System.out.println("Esta é uma equaçao de primeiro grau");
            System.out.println("A raiz real é: " + x);
            double x = -c/b;
        }
        else if(a!=0) {
            System.out.println("Esta é uma equaçao de segundo  grau");
        }
        double delta = b*b-4*a*c;
        if(delta<0) {
            System.out.println("Esta equaçao não possui raizes reais");
        }
        else if(delta==0) {
            System.out.println("Esta equaçao possui raizes reais iguais");
            double x = -b/(2*a);
        }
        else if(delta>0) {
            System.out.println("Esta equaçao possui duas raizes reais diferentes");
            double x1 = (-b+Math.sqrt(delta))/(2*a);
            double x2 = (-b-Math.sqrt(delta))/(2*a);
        }
        else {
            System.out.println("Error");
        }
    }
}