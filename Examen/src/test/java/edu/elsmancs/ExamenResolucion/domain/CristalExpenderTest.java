package edu.elsmancs.ExamenResolucion.domain;

import org.junit.Test;
import static org.junit.Assert.*;

public class CristalExpenderTest {


    @Test
    public void crearPackTest() {
        CristalExpender cristalExpender = new CristalExpender(3, 50d);
        double delta = 0d;
        assertNotNull(cristalExpender);
        assertEquals(3, cristalExpender.stock(), delta);
    }

    @Test
    public void dispatchPackTest() {
        CristalExpender cristalExpender = new CristalExpender(3, 50d);
        CreditCard creditCard = new CreditCard("Abradolf Lincler", "3452234634523457");
        double delta = 0d;
        cristalExpender.dispatch(creditCard);
        assertEquals(2, cristalExpender.stock(), delta);
        assertEquals(1950, creditCard.credit(), delta);
    }

}
