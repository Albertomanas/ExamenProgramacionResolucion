package edu.elsmancs.ExamenResolucion.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase automatiza los servicios que pueden adquirir los usuarios
 * @author Alberto Mañas
 */
public class Receptivo {

    List<GuestDispatcher> dispatchers = new ArrayList<>();

    /**
     * Registra los items implementados por la interfaz.
     * @param dispatch
     */
    public void registra(GuestDispatcher dispatch) {
        this.dispatchers.add(dispatch);
    }

    /**
     * Método que recorre la estructura de dispatchers para todos los usuarios.
     * @param CreditCard usuario
     */
    public void dispatch(CreditCard usuario) {
        dispatchers.forEach( type -> type.dispatch(usuario)); //Expresión lambda (Parámetro) -> (Expresión)
    }
}
