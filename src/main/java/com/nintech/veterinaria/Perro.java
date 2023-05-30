package com.nintech.veterinaria;

public class Perro extends Mascota {
    private String raza;
    protected String tamano;
    private double constoConsulta = 500;

    public Perro(String clave, String nombreDueno, String nombreMascota, int edad, String direccion, String telefono, int prioridad, String raza, String tamano) {
        super(clave, nombreDueno, nombreMascota, edad, direccion, telefono, prioridad);
        this.raza = raza;
        this.tamano = tamano;
    }

    public String getRaza() {
        return raza;
    }

    public String getTamano() {
        return tamano;
    }

    public double getCostoConsulta() {
        return constoConsulta;
    }

    public void setCostoConsulta(double constoConsulta) {
        this.constoConsulta = constoConsulta;
    }


    
}
