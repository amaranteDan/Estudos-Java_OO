package java_basico.entities;

public class CurrencyConverter {

    // Atributos privados (Encapsulamento) e usando camelCase
    private double dollarPrice;
    private double dollarAmount;

    // IOF fixo como uma constante da classe (6%)
    public static final double IOF = 0.06;

    // Métodos Getters e Setters para acessar os dados com segurança
    public double getDollarPrice() {
        return dollarPrice;
    }

    public void setDollarPrice(double dollarPrice) {
        this.dollarPrice = dollarPrice;
    }

    public double getDollarAmount() {
        return dollarAmount;
    }

    public void setDollarAmount(double dollarAmount) {
        this.dollarAmount = dollarAmount;
    }

    // Método da instância: ele não precisa receber parâmetros,
    // pois já usa os próprios atributos do objeto!
    public double amountToPaidInReais() {
        double totalSemImposto = dollarPrice * dollarAmount;
        return totalSemImposto + (totalSemImposto * IOF);
    }
}