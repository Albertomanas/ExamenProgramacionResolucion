package edu.elsmancs.ExamenResolucion.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase UfosPark la cual implementa la interfazz GuestDispatcher
 * Esta clase tiene como finalizar proporcionar a los usuarios ufos.
 * @author Alberto Mañas
 */
public class UfosPark implements GuestDispatcher{

    private final double fee = 500d;
    /* Implementación de Mapa, tenemos que recorrer el Mapa
     * Éste mapa le entra una String(ufosID) y su tarjeta de crédito (CreditCard)
     * En conjunto <String, CreditCard> flota
     */
    private Map<String, CreditCard> flota = new HashMap<>();

    /**
     * Devuelve el mapa que pertenece a la flota de ovnis
     * @return Map <String, CreditCard> flota
     */
    public Map<String, CreditCard> getFlota() {
        return this.flota;
    }

    // Añadir a flota 2 ovnis 2 UFOS

    /**
     * Añade a la flota la id y la disponibilidad de cada una de ellas.
     * @param string ufosID
     */
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
    *
     */

    /**
     * Devuelve los ufos disponibles
     * @param string creditNumber
     * @return string ufoOf
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

    /**
     * Devuelve la longitud de la flota
     * @return getFlota().size()
     */
    private int numUfos() {  //Devuelve la longitud de flota
        return getFlota().size();
    }

    /**
     * Devuelve un booleano si hay ufos disponibles
     * @return boolean inHuecoLibre
     */
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

    /**
     * Comprueba que la tarjeta de crédito del usuario está en el mapa que usamos como almacenamiento
     * de los registros.
     * @param CreditCard creditCard
     * @return boolean
     */
    private boolean isTarjetaAsignada (CreditCard creditCard) {
        //Comprobación booleana si está la tarjeta de credito en mapa
        for (String ufoID : flota.keySet()) {
            if (flota.get(ufoID) != creditCard) {
                return true;
            }
        }return false;
    }

    /**
     * Require para captar excepciones
     * @param boolean holds
     * @throws Exception
     */
    private void require(Boolean holds) throws Exception{
        //Booleano que si hold es distinto a lo esperado, salta excepción
        if (!holds) {
            throw new Exception();
        }
    }

    /**
     * Tratamiento de excepciones de los métodos anteriores
     * @param CreditCard creditCard
     */
    public void dispatch(CreditCard creditCard) {

        // Barricada try catch para capturar Excepciones

        try {
            require(isHuecoLibre());
            require(creditCard.credit() >= fee); // saldo mayor o igual al coste del pack
            require(isTarjetaAsignada(creditCard)); //Que x ufo no ha recibido ya un pack
            String ufoDisponibleID = null;
            for (String ufoID : flota.keySet()) {
                if (flota.get(ufoID) == null) {
                    ufoDisponibleID = ufoID;
                }
            }
            this.getFlota().put(ufoDisponibleID, creditCard);
            creditCard.pay(this.fee);//Cobro del pack

        } catch (Exception e){}
    }

    /**
     * Conversión de parametros a toString.
     * @return String
     */
    public String toString() {
        return "\n" + flota.keySet().toString();
    }

}

