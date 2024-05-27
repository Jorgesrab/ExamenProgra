package modelos;

import utiles.Constantes;
import utiles.Marcas;

import java.util.Objects;

public class Vehiculo {

    private final String matricula;
    private final Marcas marca;
    private final String modelo;
    private String color;
    private double PPdia;
    private boolean alquilado;
    private int dAlquilado;
    private  Persona personaAlquila;


    public Vehiculo(String modelo, String color, String matricula, Marcas marca, double PPdia) {
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.marca = marca;
        this.PPdia = PPdia;
        this.alquilado = false;
        this.dAlquilado = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    public Marcas getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPPdia() {
        return PPdia;
    }

    public void setPPdia(double PPdia) {
        this.PPdia = PPdia;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    public int getdAlquilado() {
        return dAlquilado;
    }

    public void setdAlquilado(int dAlquilado) {
        this.dAlquilado = dAlquilado;
    }

    public Persona getPersonaAlquila() {
        return personaAlquila;
    }

    public void setPersonaAlquila(Persona personaAlquila) {
        this.personaAlquila = personaAlquila;
    }

    @Override
    public String toString() {
        String clienteDias = ", dni y nombre del cliente= ";
        if(alquilado) clienteDias += personaAlquila.getDni() + ", " + personaAlquila.getNombre();
        else clienteDias += "ninguno";
        clienteDias += ", numDiasAlquilado=" + dAlquilado;

        return "Vehiculo: " +
                "matricula= '" + matricula + '\'' +
                ", marca= " + marca +
                ", modelo= '" + modelo + '\'' +
                ", color= '" + color + '\'' +
                ", precio sin IVA= " + PPdia +
                ", ¿está alquilado? " + alquilado +
                clienteDias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(matricula, vehiculo.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

    public double alquiler(Persona cliente, int dias){

        this.alquilado=true;
        this.personaAlquila=cliente;
        this.dAlquilado = dias;
        return this.getPPdia()*dias*(1+(Constantes.iva/100));
    }

    public void desalquilar(){
        this.dAlquilado=0;
        this.alquilado=false;
        this.personaAlquila=null;

    }
}
