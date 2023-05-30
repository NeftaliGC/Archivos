package com.nintech.veterinaria;

import java.io.*;

public class Consultorio {
    
    public static void registrarMascotaPerro(String clave, String nombreDueno, String nombreMascota, int edad, String direccion, String telefono, int prioridad, String raza, String tamano) {
        Perro perro = new Perro(clave, nombreDueno, nombreMascota, edad, direccion, telefono, prioridad, raza, tamano);
        perro.setCostoConsulta(calcularCostoConsulta(prioridad, perro.getCostoConsulta()));
        try {
            File file = new File("src/main/java/com/nintech/veterinaria/datos/Perros.txt");
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(perro.getClave() + "," + perro.getNombreDueno() + "," + perro.getNombreMascota() + "," + perro.getEdad() + "," + perro.getDireccion() + "," + perro.getTelefono() + "," + perro.getPrioridad() + "," + perro.getRaza() + "," + perro.getTamano() + "," + perro.getCostoConsulta() + "\n");
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("Error al registrar mascota");
        }
    }
    
    public static void registrarMascotaGato(String clave, String nombreDueno, String nombreMascota, int edad, String direccion, String telefono, int prioridad, String color, String tamano) {
        Gato gato = new Gato(clave, nombreDueno, nombreMascota, edad, direccion, telefono, prioridad, color, tamano);
        gato.setCostoConsulta(calcularCostoConsulta(prioridad, gato.getCostoConsulta()));
        try {
            File file = new File("src/main/java/com/nintech/veterinaria/datos/Gatos.txt");
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(gato.getClave() + "," + gato.getNombreDueno() + "," + gato.getNombreMascota() + "," + gato.getEdad() + "," + gato.getDireccion() + "," + gato.getTelefono() + "," + gato.getPrioridad() + "," + gato.getColor() + "," + gato.getTamano() + "cm" + "," + gato.getCostoConsulta() + "\n");
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("Error al registrar mascota");
        }
    }

    public static void registrarMascotaLoro(String clave, String nombreDueno, String nombreMascota, int edad, String direccion, String telefono, int prioridad, String[] colores, boolean vuela, boolean canta) {
        Loro loro = new Loro(clave, nombreDueno, nombreMascota, edad, direccion, telefono, prioridad, colores, vuela, canta);
        loro.setCostoConsulta(calcularCostoConsulta(prioridad, loro.getCostoConsulta()));
        try {
            File file = new File("src/main/java/com/nintech/veterinaria/datos/Loros.txt");
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(loro.getClave() + "," + loro.getNombreDueno() + "," + loro.getNombreMascota() + "," + loro.getEdad() + "," + loro.getDireccion() + "," + loro.getTelefono() + "," + loro.getPrioridad() + "," + loro.getColores() + "," + loro.isVuela() + "," + loro.isCanta() + "," + loro.getCostoConsulta() + "\n");
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("Error al registrar mascota");
        }
    }

    public static String consultarMascota(String archivo) {
        String mascotas = "";
        String line = "";
        try {
            File file = new File("src/main/java/com/nintech/veterinaria/datos/" + archivo + "s" + ".txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                mascotas += line + "\n";
            }
            bufferedReader.close();
            return mascotas;
        } catch (Exception e) {
            return "No hay mascotas registradas";
        }
    }

    public static double calcularCostoConsulta(int prioridad, double costoConsulta) {
        if(prioridad == 1){
            return costoConsulta + (costoConsulta * 0.10);
        } else if (prioridad == 3){
            return costoConsulta - (costoConsulta * 0.10);
        } else {
            return costoConsulta;
        }
    }


}
