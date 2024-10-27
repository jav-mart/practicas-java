package org.javmart.poointerfaces.repositorio;

import org.javmart.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio implements OrdenablePaginableCrudRepositorio {

    private List<Cliente> dataSOurce;

    public ClienteListRepositorio() {
        this.dataSOurce = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSOurce;
    }

    @Override
    public Cliente porId(Integer id) {
        Cliente c = null;

        for(Cliente cli: dataSOurce) {
            if (cli.getId().equals(id)) {
                c = cli;
                break;
            }
        }

        return c;
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSOurce.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(Integer id) {
        Cliente c = this.porId(id);
        this.dataSOurce.remove(c);
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSOurce);

        listaOrdenada.sort((a, b) -> {
            int resultado = 0;

            if (dir == Direccion.ASC) {
                resultado = ordenar(campo, a, b);
            } else if (dir == Direccion.DESC) {
                resultado =  ordenar(campo, b, a);
            }

            return resultado;
        });

        return listaOrdenada;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSOurce.subList(desde, hasta);
    }

    @Override
    public int total() {
        return this.dataSOurce.size();
    }

    public static int ordenar(String campo, Cliente a, Cliente b) {
        {
            int resultado = 0;

            switch (campo) {
                case "id" ->
                        resultado = a.getId().compareTo(b.getId());
                case "nombre" ->
                        resultado = a.getNombre().compareTo(b.getNombre());
                case "apellido" ->
                        resultado = a.getApellido().compareTo(b.getApellido());

            }

            return resultado;
        }
    }

}
