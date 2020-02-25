package edu.elsmancs.ExamenResolucion.domain;


import org.junit.Test;
import static org.junit.Assert.*;

public class CreditCardTest {


    @Test
    public void comprobarDatosTarjetaTest() {
        CreditCard creditCard = new CreditCard("Abradolf Lincler", "3452234634523457");
        assertEquals(creditCard.getOwner(), "Abradolf Lincler");
        assertNotNull(creditCard.number(), "3452234634523457");
    }

    @Test
    public void crearTarjetaTest() {
        CreditCard creditCard = new CreditCard("Abradolf Lincler","3452234634523457");
        double delta = 0;
        assertEquals(3000d, creditCard.credit(), delta);
        assertNotNull(creditCard);
    }

}
