package cli;

import modelos.*;
import servicios.*;

import utiles.Marcas;

import java.util.Scanner;

public class Renting {
    private static final ServicioVehiculo servicioVehiculo = new ServicioVehiculo();
    private static final ServicioEmpleado sercicioEmpleado = new ServicioEmpleado();
    private static final ServicioCliente servicioCliente = new ServicioCliente();

    public static void main(String[] args) {
        cargarDatos();
        cargarDatos(); // los introduzco dos veces para comprobar que funciona lo de que no se repitan los datos

        Scanner sc = new Scanner(System.in);




    }

    private static void cargarDatos(){
        Vehiculo coche1 = new Vehiculo("A5", "Negro", "1111AAA", Marcas.Audi, 200);
        Vehiculo coche2 = new Vehiculo("Ibiza", "Gris", "2222BBB", Marcas.Seat, 100);
        Vehiculo coche3 = new Vehiculo("Focus", "Azul", "3333CCC", Marcas.Ford, 75.50);
        Vehiculo coche4 = new Vehiculo("Polo", "Blanco", "4444DDD", Marcas.Volkswagen, 60.50);

        servicioVehiculo.addVehiculo(coche1);
        servicioVehiculo.addVehiculo(coche2);
        servicioVehiculo.addVehiculo(coche3);
        servicioVehiculo.addVehiculo(coche4);

        Empleado empleado1 = new Empleado("12345678A", "Ana Iglesias", "profesorAna", "contraseniaSegura");

        Cliente cliente1 = new Cliente("111111111A", "Juan López", "Villanueva de la Cañada");
        Cliente cliente2 = new Cliente("22222222B", "Marina Pinteño", "Cádiz");
        Cliente cliente3 = new Cliente("33333333C", "Amanda García", "Valladolid");
        Cliente cliente4 = new Cliente("44444444D", "Rafael Caro", "Devon");
        Cliente cliente5 = new Cliente("55555555E", "Manuel Ceballos", "Sanlúcar");

        servicioCliente.addCliente(cliente1);
        servicioCliente.addCliente(cliente2);
        servicioCliente.addCliente(cliente3);
        servicioCliente.addCliente(cliente4);
        servicioCliente.addCliente(cliente5);
        sercicioEmpleado.addEmpleado(empleado1);

    }

    private static void mostrarMenuInicial() {
        System.out.println("Menú principal. Login");
        System.out.println("=====================");
        System.out.println("1. Entrar");
        System.out.println("2. Salir");


    }

    private static void login(String usuario, String contrasenia){

        Empleado empleado = sercicioEmpleado.empleados.get(usuario);

        if (!sercicioEmpleado.empleados.containsKey(usuario)){
            System.out.println("El usuario no existe");
        }else{
            if (empleado.getUsuario().equals(usuario) && empleado.getContrasenia().equals(contrasenia)){
                System.out.println("acceso concedido");
                menuGestion();

            }
        }

    }
    private static void menuGestion(){

    }

}
