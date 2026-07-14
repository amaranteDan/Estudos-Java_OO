package java_basico;

import javax.swing.JOptionPane;
import java_basico.entities.CurrencyConverter;

public class Program2 {

    public static void main(String[] args) {

        CurrencyConverter cc = new CurrencyConverter();
        boolean keepRunning = true;

        while (keepRunning) {
            try {
                // 1. Input: Dollar price
                String priceInput = JOptionPane.showInputDialog("What is the Dollar price?");
                if (priceInput == null)
                    break; // Exits the loop if user clicks "Cancel"

                // Automatically replaces commas with dots to prevent parsing errors
                priceInput = priceInput.replace(",", ".");
                cc.setDollarPrice(Double.parseDouble(priceInput));

                // 2. Input: Amount of dollars to buy
                String amountInput = JOptionPane.showInputDialog("How many dollars will be bought?");
                if (amountInput == null)
                    break; // Exits the loop if user clicks "Cancel"

                amountInput = amountInput.replace(",", ".");
                cc.setDollarAmount(Double.parseDouble(amountInput));

                // 3. Get IOF percentage from the CurrencyConverter class (e.g., 0.06 -> 6.0%)
                double iofPercentage = CurrencyConverter.IOF * 100;

                // 4. Output: Format and display the results
                String resultMessage = String.format(
                        "IOF tax applied: %.1f%%\n" +
                                "Amount to be paid in Reais: R$ %.2f",
                        iofPercentage,
                        cc.amountToPaidInReais());

                JOptionPane.showMessageDialog(null, resultMessage, "Conversion Result",
                        JOptionPane.INFORMATION_MESSAGE);

                // 5. Ask if the user wants to continue
                int response = JOptionPane.showConfirmDialog(
                        null,
                        "Do you want to perform another conversion?",
                        "Continue?",
                        JOptionPane.YES_NO_OPTION);

                if (response != JOptionPane.YES_OPTION) {
                    keepRunning = false; // Exits the loop if user clicks "No"
                }

            } catch (NumberFormatException e) {
                // Error handling for invalid characters (letters, symbols, etc.)
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter numbers only.", "Error",
                        JOptionPane.ERROR_MESSAGE);

                // Prompt to try again after an error
                int errorResponse = JOptionPane.showConfirmDialog(
                        null,
                        "Would you like to try again?",
                        "Try Again",
                        JOptionPane.YES_NO_OPTION);

                if (errorResponse != JOptionPane.YES_OPTION) {
                    keepRunning = false;
                }
            }
        }

        // Final goodbye message
        JOptionPane.showMessageDialog(null, "Program finished. Thank you!", "Goodbye", JOptionPane.INFORMATION_MESSAGE);
    }
}