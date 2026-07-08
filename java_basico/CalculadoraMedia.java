package java_basico;

import java.util.Locale;
import java.util.Scanner;
import java_basico.entities.Estudante;

public class CalculadoraMedia {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estudante estudante = new Estudante();

        System.out.println("Informe o nome: ");
        estudante.name = sc.nextLine();

        System.out.println("Informe a serie: ");
        estudante.serie = sc.nextLine();

        System.out.println("Informe as notas: ");
        estudante.grade1 = sc.nextDouble();
        estudante.grade2 = sc.nextDouble();
        estudante.grade3 = sc.nextDouble();

        double finalGrade = estudante.finalGrade();

        if (finalGrade < 7) {
            System.out.println("Reprovado");
            System.out.printf("Falta: %.2f pontos\n", estudante.pontosFaltantes());
        } else {
            System.out.println("Aprovado");
        }

        System.out.printf("O aluno %s tem nota final %.2f%n", estudante.name, finalGrade);
        sc.close();

    }
}
