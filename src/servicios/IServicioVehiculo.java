package servicios;
import modelos.Vehiculo;

import java.util.ArrayList;
import java.util.HashMap;

public interface IServicioVehiculo {
    HashMap<String, Vehiculo> vehiculos = new HashMap<>();
    ArrayList<Vehiculo> alquiladosPorMatricula();

    public void addVehiculo(Vehiculo vehiculo);

}
