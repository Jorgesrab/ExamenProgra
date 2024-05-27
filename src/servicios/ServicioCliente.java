package servicios;

import modelos.Cliente;

public class ServicioCliente implements IServicoCliente{


    public void addCliente(Cliente cliente){

        if (clientes.containsKey(cliente.getDni())){
            System.out.println("Operacion incorrecta cliente ya existe");
        }else {
            clientes.put(cliente.getDni(), cliente);
            System.out.println("Operacion realizada con exito");
        }

    }
}
