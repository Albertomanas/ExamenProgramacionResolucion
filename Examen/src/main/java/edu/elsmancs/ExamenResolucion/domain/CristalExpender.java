package edu.elsmancs.ExamenResolucion.domain;

public class CristalExpender {
    private int stock = 0;
    private double itemCost = 50d;

    public CristalExpender(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }

    public int stock() {
        return stock;
    }

}
