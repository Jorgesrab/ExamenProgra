package servicios;

import modelos.Cliente;

import java.util.HashMap;

public interface IServicoCliente {

    HashMap<String, Cliente> clientes = new HashMap<>();

    public void addCliente(Cliente cliente);
}
