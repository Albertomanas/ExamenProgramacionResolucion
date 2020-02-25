package edu.elsmancs.ExamenResolucion.domain;

public class CreditCard {

    private String owner = "";
    private String number = "";
    private double credit = 3000d;
    private final String SYMBOL = "EZI";


    public CreditCard(String name, String number) {
        this.owner = owner;
        this.number = number;
    }

    public CreditCard() {}

    public String getOwner() {
        return this.owner = owner;
    }

    public String number() {
        return this.number = number;
    }

    public double credit() {
        return this.credit = credit;
    }

    @Override
    public String toString() {
        return "\n" + "Owner = " + getOwner() + "\n" +
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
