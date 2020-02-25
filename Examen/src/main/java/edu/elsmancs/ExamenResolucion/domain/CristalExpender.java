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


    //DISPATCH
    private void require(Boolean holds) throws  Exception {
        if (!holds) {
            throw new Exception();
        }
    }
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
}
