package org.javmart.generics;

import org.javmart.poointerfaces.modelo.Cliente;
import org.javmart.poointerfaces.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("Javier", "Beltran"));

        Cliente javier = clientes.get(0);

        Cliente[] clientesArreglo = {
                new Cliente("Pablo", "Beltran"),
                new Cliente("Minnie", "Beltran")
        };
        Integer[] enterosArreglo = {1,2,3};

        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Andres", "Pepe", "Lucy", "Bea", "Jhon"}, enterosArreglo);
        nombres.forEach(System.out::println);

        List<ClientePremium> clientesPremium = fromArrayToList(
                new ClientePremium[]{new ClientePremium("Jhoana", "Perez")}
        );

        clientesPremium.forEach(System.out::println);
    }

    public static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T extends Number> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T extends Cliente> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] g) {

        for(G elemento: g) {
            System.out.println(elemento);
        }

        return Arrays.asList(c);
    }
}
