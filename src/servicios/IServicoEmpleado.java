package servicios;

import modelos.Empleado;

import java.util.HashMap;

public interface IServicoEmpleado {

    HashMap<String, Empleado> empleados = new HashMap<>();

    public void addEmpleado(Empleado empleado);


}
