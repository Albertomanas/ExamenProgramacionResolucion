package edu.elsmancs.ExamenResolucion.domain;

/**
 * Dicha clase representa la tarjeta de crédito de los invitados.
 * @author Alberto Mañas
 */

public class CreditCard {

    private String owner = null;
    private String number = null;
    private double credit = 3000d;
    private final String SYMBOL = "EZI";

    /**
     * Constructuror de la tarjeta de crédito.
     * @param owner
     * @param number
     */

    public CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }

    public CreditCard() {}

    /**
     * Método que devuelve los owners.
     * @return String owner
     */
    public String owner() {
        return owner;
    }

    /**
     * Método que devuelve el número de tarjeta de crédito (público).
     * @return String number
     */
    public String number() {
        return number;
    }

    /**
     * Método que devuelve dicho crédito de la tarjeta.
     * @return double credit
     */
    public double credit() {
        return this.credit = credit;
    }

    /**
     * Método que convierte los getters del código en string, override a partir de la interfaz.
     * @return String
     */
    @Override
    public String toString() {
        return "\n" + "Owner = " + owner() + "\n" +
                "Number = " + number() + "\n" +
                "Credit = " + credit() + this.SYMBOL +
                "\n";
    }

    /**
     * Método que resta el pago al crédito de la tarjeta tras algún movimiento de esta.
     * @param pago
     * @return credit >= pago
     */
    public boolean pay(double pago) {
        if (credit >= pago){
            credit -= pago;
        }
        return credit >= pago;
    }

}
