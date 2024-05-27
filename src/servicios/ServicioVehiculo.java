package servicios;

import modelos.Vehiculo;

import java.util.ArrayList;
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


    public ArrayList <Vehiculo> alquiladosPorMatricula(){
        ArrayList <Vehiculo> vehiculosPorMatricula = new ArrayList<Vehiculo>();

        for (Vehiculo v : vehiculos.values()) {
            if (v.isAlquilado()==true) {
                vehiculosPorMatricula.add(v);
            }
        }


        //nombreArrayList.sort((n1, n2) -> Integer.compare(n1.getNota(), n2.getNota()));
        //nombreArrayList.sort((n1, n2) -> Double.compare(n1.getNota(), n2.getNota()));

        vehiculosPorMatricula.sort((c1,c2)-> c1.getMatricula().compareTo(c2.getMatricula()));
        return vehiculosPorMatricula;

    }



}
