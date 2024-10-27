package org.javmar.poointerfaces.imprenta.modelo;

public interface Imprimible {
    // Puede tener atributos constantes
    // son de tipo final, pero en interfaces no se escribe el final porque es redundante
    //String ATRIBUTO_EJEMPLO = "ATRIBUTO DE EJEMPLO";

    String imprimir();


    // Los metodos de las interfaces por lo general no pueden o no deben ser implementados
    // sin embargo existe la opción de crear métodos implementados, lo que da la opción de que
    // quien implementa la interfaz no esté obligado a implementar el método, lo que en algunos casos puede ser útil

    /*default String imprimir() {
        return "Imprimiendo un valor por defecto";
    }*/

    // También puede tener metodos static
}
