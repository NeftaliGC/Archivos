package com.nintech.veterinaria;

public class Gato extends Mascota {
    private String color;
    private String tamano;
    private double constoConsulta = 400;

    public Gato(String clave, String nombreDueno, String nombreMascota, int edad, String direccion, String telefono, int prioridad, String color, String tamano) {
        super(clave, nombreDueno, nombreMascota, edad, direccion, telefono, prioridad);
        this.color = color;
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public String getTamano() {
        return tamano;
    }

    public double getCostoConsulta() {
        return constoConsulta;
    }

    public void setCostoConsulta(Double constoConsulta) {
        this.constoConsulta = constoConsulta;
    }

}
