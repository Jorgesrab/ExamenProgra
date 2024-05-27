package servicios;

import modelos.Vehiculo;

import java.util.HashMap;
import modelos.Vehiculo;

public class ServicioVehiculo implements IServicioVehiculo {



    public void addVehiculo(Vehiculo vehiculo){

        if (vehiculos.containsKey(vehiculo.getMatricula())){
            System.out.println("Operacion incorrecta el vehiculo ya existe");
        }else {
            vehiculos.put(vehiculo.getMatricula(),vehiculo);
            System.out.println("Operacion realizada con exito");
        }

    }
}
