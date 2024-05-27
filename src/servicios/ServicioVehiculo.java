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

    public void eliminarVehicilo(String matricula) {
        Vehiculo vehiculo = vehiculos.get(matricula);
        if (!vehiculos.containsKey(matricula)){
            System.out.println("Lo siento el vehiculo qu edesea eliminar no existe");
        }else if (vehiculo.isAlquilado()){
            System.out.println("el vehiculo no se puede eliminar pq esta alquilado ");

        }else {
            vehiculos.remove(matricula);
        }

    }



}
