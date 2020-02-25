package edu.elsmancs.ExamenResolucion.domain;

public class CreditCard {

    private String owner = "";
    private String number = "";
    private double credit = 3000d;
    private final String SYMBOL = "EZIS";

    private String name= "";

    public CreditCard(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return this.name = name;
    }

    public String number() {
        return this.number = number;
    }

    public double credit() {
        return this.credit = credit;
    }
}
