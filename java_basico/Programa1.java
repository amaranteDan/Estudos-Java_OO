package java_basico;

import java.util.Scanner;

public class Programa1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o primeiro numero");
            int a = sc.nextInt();
            System.out.println("Digite o segundo numero");
            int b = sc.nextInt();
            System.out.println("Digite o terceiro numero");
            int c = sc.nextInt();

            int higher = max(a, b, c);
            showResult(higher);

        }

    }

    public static int max(int x, int y, int z) {

        if (x > y && x > z) {
            return x;
        } else if (y > z) {
            return y;
        } else {
            return z;
        }
        // return Math.max(Math.max(x, y), z); // Outra forma de fazer a
        // mesma coisa
    }

    public static void showResult(int value) {
        System.out.println("O maior numero e: " + value);
    }

}
