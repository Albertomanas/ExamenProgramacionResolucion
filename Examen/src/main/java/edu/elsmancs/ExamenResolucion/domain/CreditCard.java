package edu.elsmancs.ExamenResolucion.domain;

public class CreditCard {

    private String owner = null;
    private String number = null;
    private double credit = 3000d;
    private final String SYMBOL = "EZI";


    public CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }

    public CreditCard() {}

    public String owner() {
        return owner;
    }

    public String number() {
        return number;
    }

    public double credit() {
        return this.credit = credit;
    }

    @Override
    public String toString() {
        return "\n" + "Owner = " + owner() + "\n" +
                "Number = " + number() + "\n" +
                "Credit = " + credit() + this.SYMBOL +
                "\n";
    }

    public boolean pay(double pago) {
        if (credit >= pago){
            credit -= pago;
        }
        return credit >= pago;
    }

}
