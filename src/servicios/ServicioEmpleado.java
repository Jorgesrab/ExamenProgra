package servicios;

import modelos.Empleado;

public class ServicioEmpleado implements IServicoEmpleado{


    public void addEmpleado(Empleado empleado){

        if (empleados.containsKey(empleado.getUsuario())){
            System.out.println("Operacion incorrecta empleado ya existe");
        }else {
            empleados.put(empleado.getUsuario(),empleado);
            System.out.println("Operacion realizada con exito");
        }



    }

}
