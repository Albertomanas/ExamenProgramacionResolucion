package edu.elsmancs.ExamenResolucion.domain;

/**
 * Clase CrystalExpender la cual implementa la interfaz GuestDispatcher
 * @author Alberto Mañas
 */
public class CrystalExpender implements GuestDispatcher {
    private int stock = 0;
    private double itemCost = 50d;

    /**
     * Constructor de la clase CrystalExpender
     * @param int stock
     * @param double itemCost
     */
    public CrystalExpender(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }

    /**
     * Método que devuelve el stock disponible
     * @return int stock
     */
    public int stock() {
        return stock;
    }

    /**
     * Método que capta excepciones para try y catch
     * @param boolean holds
     * @throws Exception
     */
    //DISPATCH
    private void require(Boolean holds) throws  Exception {
        if (!holds) {
            throw new Exception();
        }
    }

    /**
     * Método que capta excepciones, comprueba que hay items en stock y que el saldo de la tarjeta
     * es mayor o igual al coste del item. (Barricada).
     * @param CreditCard creditCard
     */
   // BARRICADA comprobar que hay items en stock y que el saldo de la tarjeta de >= al coste del item
    public void dispatch(CreditCard creditCard) {
        try {
            require(this.stock > 0);
            require(creditCard.credit() >= itemCost);
            /* Descontar de la tarjeta de crédito el coste del pack
             * Restar 1 al stock cuando se realiza el pago
             */
            creditCard.pay(itemCost);
            this.stock -= 1;
        }catch (Exception e){}
    }

    /**
     * Método que convierte los parámetros pasados a string.
     * @return String
     */
    @Override
    public String toString() {
        return "\n" + "Stock: " + stock() + "\n" +
                "Cost: " + this.itemCost;
    }
}
