package com.nintech.veterinaria;

import java.io.*;

public class Consultorio {
    
    public void registrarMascotaPerro(String clave, String nombreDueno, String nombreMascota, int edad, String direccion, String telefono, Double prioridad, String raza, String tamano) {
        
    }

    public void registrarMascotaGato(String clave, String nombreDueno, String nombreMascota, int edad, String direccion, String telefono, Double prioridad, String color, String tamano) {
        
    }

    public void registrarMascotaLoro(String clave, String nombreDueno, String nombreMascota, int edad, String direccion, String telefono, Double prioridad, String[] colores, boolean vuela, boolean canta) {
        
    }

    public void consultarMascota(String archivo) {
        
    }

    public double calcularCostoConsulta(int prioridad, double costoConsulta) throws Exception{
        if(prioridad == 1){
            return costoConsulta + (costoConsulta * 0.10);
        } else if (prioridad == 2) {
            return costoConsulta;
        } else if (prioridad == 3){
            return costoConsulta - (costoConsulta * 0.10);
        } else {
            throw new Exception("Prioridad no valida");
        }
    }


}
