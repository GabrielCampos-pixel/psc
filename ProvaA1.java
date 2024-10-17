import java.util.Scanner;
public class ProvaA1 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int notaFinal = 0;
        System.out.println("Informe o numero de provas realizadas no semestre"); //coloque o numero de provas realizadas em 1 semestre
        int numProvas = teclado.nextInt();
        if(numProvas<0) {
        System.out.println("Quantidade de provas invalidas"); //numero de provas é necessario ser maior que 0
        }
        System.out.println("Informe suas notas em cada avaliação");
        for (int i = 0; i < numProvas; i++) {
            System.out.println("Informe sua nota"); //informe a nota de cada prova separadamente 
            int nota = teclado.nextInt();
            notaFinal += nota;        
        }
        System.out.println("A nota final é :" + notaFinal); //sua nota total foi essa
        if(notaFinal >= 70) {
            System.out.println("Você foi aprovado"); //você foi aprovado parabens
        }
        else {
            System.out.println("Você foi reprovado"); //você infelizmente foi reprovado
        }
    }
}