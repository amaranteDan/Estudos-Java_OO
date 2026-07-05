package java_basico;

import java.util.Locale;
import java.util.Scanner;
import java_basico.entities.Retangulo;

public class CalculoRetangulo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo ret = new Retangulo();

        System.out.println("Informe a largura e a altura: ");
        ret.largura = sc.nextDouble();
        ret.altura = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", ret.area());
        System.out.printf("PERIMETER = %.2f%n", ret.perimetro());
        System.out.printf("DIAGONAL = %.2f%n", ret.diagonal());
        sc.close();

    }

}
