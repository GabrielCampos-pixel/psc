import java.util.Scanner;
public class ProvaA1q2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("informe qual o número de alunos: "); //solicita informar o numero de alunos
        int numeroAlunos = teclado.nextInt();
        System.out.print("informe qual o número de provas por aluno: "); //solicita informar o numero de provas realizadas por cada aluno
        int numeroProvas = teclado.nextInt(); 
        int totalAprovados = 0;
        int totalReprovados = 0;
        for (int i = 1; i <= numeroAlunos; i++) {
            double somaNotas = 0;
            System.out.println("Aluno " + i + ":"); 
            for (int j = 1; j <= numeroProvas; j++) {
                System.out.print("informe a nota da prova " + j + ": "); //informa a nota da prova de cada aluno
                double nota = teclado.nextDouble();
                somaNotas += nota;
            }
            System.out.println("Nota final do aluno " + i + ": " + somaNotas); //verifica se o aluno foi aprovado ou reprovado
            if (somaNotas >= 70) {
                System.out.println("Aluno aprovado.");
                totalAprovados++; //aumenta o numero de alunos aprovados se a nota for maior ou igual a 70
            } else {
                System.out.println("Aluno reprovado.");
                totalReprovados++; //aumenta o numero de alunos reprovados se a nota for menor que 70
            }
            System.out.println();
        }
        System.out.println("Total de alunos aprovados: " + totalAprovados); //exibe o numero total de alunos aprovados
        System.out.println("Total de alunos reprovados: " + totalReprovados); //exibe o numero total de alunos reprovados
    }
}