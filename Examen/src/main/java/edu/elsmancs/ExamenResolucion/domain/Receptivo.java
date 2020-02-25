package edu.elsmancs.ExamenResolucion.domain;

import java.util.ArrayList;
import java.util.List;

public class Receptivo {

    List<GuestDispatcher> dispatchers = new ArrayList<>();

    public void registra(GuestDispatcher dispatch) {
        this.dispatchers.add(dispatch);
    }

    public void dispatch(CreditCard usuario) {
        dispatchers.forEach( type -> type.dispatch(usuario)); //Expresión lambda (Parámetro) -> (Expresión)
    }
}
