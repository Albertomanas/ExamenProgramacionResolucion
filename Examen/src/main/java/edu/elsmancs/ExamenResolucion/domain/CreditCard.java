package edu.elsmancs.ExamenResolucion.domain;

public class CreditCard {

    private String owner = "";
    private String number = "";
    private double credit = 3000d;
    private String symbol = "EZIS";

    private String name= "";

    public CreditCard(String name, String number) {
        this.name = name;
        this.number = number;
    }
}
