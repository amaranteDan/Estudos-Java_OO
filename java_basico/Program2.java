/* Fazer um programa para converter reais para dólar.
 * Data: 08/07/2026
 * @author: Daniel Amarante
 */

package java_basico;

import java.util.Scanner;
import java.util.Locale;

import java_basico.entities.CurrencyConverter;

public class Program2 {

    public static void main(String[] args) {
        // try-with-resources gerencia o fechamento do Scanner automaticamente
        try (Scanner sc = new Scanner(System.in)) {
            sc.useLocale(Locale.US); // Define o ponto como separador decimal, ao invés da virgula

            CurrencyConverter cc = new CurrencyConverter();

            System.out.println("What is the Dollar price?");
            cc.setDollarPrice(sc.nextDouble());

            System.out.println("How many dolars will be bought?");
            cc.setDollarAmount(sc.nextDouble());

            // %.2f = formatta o double para ter 2 casas decimais
            // %n = pula linha
            // O proprio método já faz o cálculo de forma interna, sem precisar passar
            // parâmetros, pois os dados estão encapsulados no objeto
            System.out.printf("Amount to be paid in Reais: R$ %.2f%n", cc.amountToPaidInReais());

        }
    }

}
