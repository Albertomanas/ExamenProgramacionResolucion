package edu.elsmancs.ExamenResolucion.domain;

import java.util.HashMap;
import java.util.Map;

public class UfosPark {

    private final double fee = 500d;
    /* Implementación de Mapa, tenemos que recorrer el Mapa
     * Éste mapa le entra una String(ufosID) y su tarjeta de crédito (CreditCard)
     * En conjunto <String, CreditCard> flota
     */
    private Map<String, CreditCard> flota = new HashMap<>();


    public Map<String, CreditCard> getFlota() {
        return this.flota;
    }

    // Añadir a flota 2 ovnis 2 UFOS

    public void add(String ufosID) {
        this.flota.put(ufosID, null);

        /* El diagrama UML nos dice que es un void y que es String
         * Para añadir objetos a un diccionario se aplica .put
         * Así que el método add añadirá al Map flota ufosID inicializado en null(CreditCard)
         */
    }


    /*public String getUfoOf(String creditNumber) {
        return getFlota().getOrDefault(creditNumber, );
    }
    * NO ME HA SALIDO ASÍ
     */

    public String getUfoOf(String creditNumber) {
        CreditCard tarjeta = new CreditCard(); //inicializar varibles
        String ufoOf = "null";
        for (String ufoID : flota.keySet()) { // Recorre todas las claves del mapa
            if (flota.get(ufoID) != null) {
                tarjeta = flota.get(ufoID);
                if (tarjeta.number() == creditNumber) {
                    ufoOf = ufoOf;
                }
            }
        }
        return ufoOf;
    }

    private int numUfos() {  //Devuelve la longitud de flota
        return getFlota().size();
    }

    private boolean isHuecoLibre() {  //Usado para dispatch
        int ufosAsignados = 0; //contador
        for (CreditCard tarjeta : flota.values()) {
            if (tarjeta != null) {
                ufosAsignados += 1;
            }
        }
        if (ufosAsignados != numUfos()) {
            return true;

        } else {
            return false;
        }
    }

    private boolean isTarjetaAsignada (CreditCard creditCard) {
        //Comprobación booleana si está la tarjeta de credito en mapa
        for (String ufoID : flota.keySet()) {
            if (flota.get(ufoID) != creditCard) {
                return true;
            }
        }return false;
    }

    private void require(Boolean holds) throws Exception{
        //Booleano que si hold es distinto a lo esperado, salta excepción
        if (!holds) {
            throw new Exception();
        }
    }


    /* Requisitos: ufo libre, tener dinero, y que no hayas pedido otro ufo(credit card sin asignar)
     *
     */

    /* public void dispatch(CreditCard creditCard) {

        // Barricada try catch para capturar Excepciones

        try {
            // require(isHuecoDisponible());
            require(creditCard.credit() >= fee);

        } catch (Exception e){}
        }
    }

     */


}
