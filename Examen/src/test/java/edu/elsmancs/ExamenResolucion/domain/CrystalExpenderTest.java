package edu.elsmancs.ExamenResolucion.domain;

import org.junit.Test;
import static org.junit.Assert.*;

public class CrystalExpenderTest {


    @Test
    public void crearPackTest() {
        CrystalExpender crystalExpender = new CrystalExpender(3, 50d);
        double delta = 0d;
        assertNotNull(crystalExpender);
        assertEquals(3, crystalExpender.stock(), delta);
    }

    @Test
    public void dispatchPackTest() {
        CrystalExpender crystalExpender = new CrystalExpender(3, 50d);
        CreditCard creditCard = new CreditCard("Abradolf Lincler", "3452234634523457");
        double delta = 0d;
        crystalExpender.dispatch(creditCard);
        assertEquals(2, crystalExpender.stock(), delta);
        assertEquals(1950, creditCard.credit(), delta);
    }

}
