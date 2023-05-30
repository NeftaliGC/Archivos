package com.nintech.veterinaria;

public class Mascota {
    protected String clave;
    protected String nombreDueno;
    protected String nombreMascota;
    protected int edad;
    protected String direccion;
    protected String telefono;
    protected int prioridad;
    
    public Mascota(String clave, String nombreDueno, String nombreMascota, int edad, String direccion, String telefono, int prioridad) {
        this.clave = clave;
        this.nombreDueno = nombreDueno;
        this.nombreMascota = nombreMascota;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.prioridad = prioridad;
    }

    public String getClave() {
        return clave;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getPrioridad() {
        return prioridad;
    }
}
