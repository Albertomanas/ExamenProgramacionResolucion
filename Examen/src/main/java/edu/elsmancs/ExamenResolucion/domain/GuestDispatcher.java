package edu.elsmancs.ExamenResolucion.domain;

/**
 * Interfaz para dicho programa
 * @author Alberto Mañas
 */
public interface GuestDispatcher {
    /**
     * Interfaz que checkea la tarjeta de crédito de cada usuario para el uso de ella en los
     * servicios de Risksy Business
     * @param creditCard
     */
    public void dispatch(CreditCard creditCard);
}
