package org.javmart.poointerfaces;

import org.javmart.poointerfaces.modelo.Cliente;
import org.javmart.poointerfaces.repositorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {
        ClienteListRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Javier", "Beltran"));
        repo.crear(new Cliente("Andrea", "Mejia"));

        List<Cliente> clientes = repo.listar();

        for(Cliente cl: clientes) {
            System.out.println(cl);
        }

        System.out.println("\n");

        List<Cliente> paginable = ((PaginableRepositorio)repo).listar(0, 1);

        paginable.forEach(System.out::println);

        System.out.println("\n");

        System.out.println("====== ORDENAR =======\n");
        List<Cliente> clientesOrdenAsc = ((OrdenableRepositorio)repo).listar("nombre", Direccion.ASC);

        clientesOrdenAsc.forEach(cliente -> System.out.println(cliente));


        System.out.println("====== EDITAR =======\n");
        Cliente javierActualizar = new Cliente("Ricardo", "Beltran");
        javierActualizar.setId(1);

        repo.editar(javierActualizar);

        clientes.forEach(System.out::println);

        Cliente clienteEditar = repo.porId(1);
        clienteEditar.setApellido("Martinez");
        repo.editar(clienteEditar);

        clientes.forEach(cliente -> System.out.println(cliente));

        System.out.println("\n");
        System.out.println("====== ELIMINAR =======\n");
        repo.eliminar(2);

        clientes.forEach(cliente -> System.out.println(cliente));

        System.out.println("\n");
        System.out.println("====== TOTAL =======\n");
        System.out.println("Total de registro: " + repo.total());

    }
}
