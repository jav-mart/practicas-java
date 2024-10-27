package org.javmart.poointerfaces.repositorio;

import org.javmart.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
