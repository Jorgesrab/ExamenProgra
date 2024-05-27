package modelos;

import java.util.ArrayList;

public class Cliente extends Persona{

    private String ciudad;
    private ArrayList <Vehiculo> vehiculos;

    public Cliente(String dni, String nombre, String cliente) {
        super(dni, nombre);
        this.ciudad = cliente;
        this.vehiculos = new ArrayList<>();
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    @Override
    public String toString() {
        String vehiculoCad = " y ";
        if(!vehiculos.isEmpty()){
            vehiculoCad += "ha alquilado " + vehiculos.size() + " coches, que son:";
            for(Vehiculo v : vehiculos){
                vehiculoCad += " - " + v.getMatricula();
            }
        } else
            vehiculoCad += "no tiene vehiculos alquilados.";

        return "Cliente con " + super.toString() +
                " vive en '" + ciudad + '\''
                +vehiculoCad;
    }

}
