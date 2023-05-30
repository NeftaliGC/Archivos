package com.nintech.veterinaria;

public class Loro extends Mascota {
    private String[] colores;
    private boolean vuela;
    private boolean canta;
    private double constoConsulta = 300;

    public Loro(String clave, String nombreDueno, String nombreMascota, int edad, String direccion, String telefono, int prioridad, String[] colores, boolean vuela, boolean canta) {
        super(clave, nombreDueno, nombreMascota, edad, direccion, telefono, prioridad);
        this.colores = colores;
        this.vuela = vuela;
        this.canta = canta;
    }

    public String[] getColores() {
        return colores;
    }

    public boolean isVuela() {
        return vuela;
    }

    public boolean isCanta() {
        return canta;
    }

    public double getCostoConsulta() {
        return constoConsulta;
    }

    public void setCostoConsulta(int constoConsulta) {
        this.constoConsulta = constoConsulta;
    }

}
