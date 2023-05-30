/**
 * @author Guia Cruz Fabian Neftaly
 * @author Rico Bernal Fatima Sofia
 * @author Sanchez Gutierrez Haide
**/


package com.nintech.veterinaria;

import javax.swing.*;

public class Veterinaria {
    public static void main(String[] args) {
        boolean exe = true;

        // Ejecutar el menu principal
        do {
            int val = menu();
            switch (val) {
                case 1:
                    // Ejecutar el sub menu en modo de dar de alta una mascota
                    subMenu("dar de alta");
                    break;
                case 2:
                    // Ejecutar el sub menu en modo de consultar a una mascota
                    subMenu("consulta");
                    break;
                case 3:
                    exe = false;
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema de la veterinaria", "Veterinaria", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        } while (exe);
    }

    // Renderiza el menu principal
    public static int menu() {
        String[] menus = {
            "1. Dar de alta a mascota",
            "2. consulta una mascota",
            "3. Salir"
        };

        String selectedOption = (String) JOptionPane.showInputDialog(
            null,
            "Bienvenido a la veterinaria\nSeleccione una opción",
            "Veterinaria",
            JOptionPane.QUESTION_MESSAGE,
            null,
            menus,
            menus[0]
        );

        if (selectedOption != null) {
            return Integer.parseInt(selectedOption.split("\\.")[0]);
        } else {
            return 0;
        }
    }

    public static void subMenu(String action) {
        String[] menu = {
            "Perro",
            "Gato",
            "Loro",
            "Volver"
        };
        
        String selectedOption = (String) JOptionPane.showInputDialog(
            null,
            "Seleccione la mascota a " + action,
            "Veterinaria",
            JOptionPane.QUESTION_MESSAGE,
            null,
            menu,
            menu[0]
        );

        if (selectedOption != null) {
            if (selectedOption != "Volver") {
                if (action == "dar de alta") {
                    javax.swing.JOptionPane.showMessageDialog(null, "Dar de alta a " + selectedOption);
                    RellenarFormulario(selectedOption);
                } else if (action == "consulta") {
                    String mascotas = Consultorio.consultarMascota(selectedOption);
                    javax.swing.JOptionPane.showMessageDialog(null, "Consulta de " + selectedOption + "s\n" + mascotas);
                }
            }
        }
        
    }

    public static void RellenarFormulario(String tipoMascota) {
        try {
            String nombreDueno = JOptionPane.showInputDialog(null, "Ingrese el nombre del dueño", "Veterinaria", JOptionPane.QUESTION_MESSAGE);
            String nombreMascota = JOptionPane.showInputDialog(null, "Ingrese el nombre de la mascota", "Veterinaria", JOptionPane.QUESTION_MESSAGE);
            int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad de la mascota", "Veterinaria", JOptionPane.QUESTION_MESSAGE));
            String direccion = JOptionPane.showInputDialog(null, "Ingrese la dirección del dueño", "Veterinaria", JOptionPane.QUESTION_MESSAGE);
            String telefono = JOptionPane.showInputDialog(null, "Ingrese el teléfono del dueño", "Veterinaria", JOptionPane.QUESTION_MESSAGE);
            int prioridad = (Integer) JOptionPane.showInputDialog(null, "Ingrese la prioridad de la mascota", "Veterinaria", JOptionPane.QUESTION_MESSAGE, null, new Object[] {1, 2, 3}, 1);
            
            if (tipoMascota.equals("Perro")) {
                String[] tamaños = {"Pequeño", "Mediano", "Grande"};
                String raza = JOptionPane.showInputDialog(null, "Ingrese la raza de la mascota", "Veterinaria", JOptionPane.QUESTION_MESSAGE);
                String tamano = (String) JOptionPane.showInputDialog(null, "Seleccione el tamaño de la mascota", "Veterinaria", JOptionPane.QUESTION_MESSAGE, null, tamaños, tamaños[0]);
                Consultorio.registrarMascotaPerro(tipoMascota, nombreDueno, nombreMascota, edad, direccion, telefono, prioridad, raza, tamano);
            } else if (tipoMascota.equals("Gato")) {
                String color = JOptionPane.showInputDialog(null, "Ingrese el color de la mascota", "Veterinaria", JOptionPane.QUESTION_MESSAGE);
                String tamano = JOptionPane.showInputDialog(null, "Ingrese el tamaño de la mascota en cm. Ejemplo: 60cm", "Veterinaria", JOptionPane.QUESTION_MESSAGE);
                Consultorio.registrarMascotaGato(tipoMascota, nombreDueno, nombreMascota, edad, direccion, telefono, prioridad, color, tamano);
            } else if (tipoMascota.equals("Loro")) {
                String[] colores = JOptionPane.showInputDialog(null, "Ingrese los colores de la mascota separados por , Ejemplo: Rojo,Verde", "Veterinaria", JOptionPane.QUESTION_MESSAGE).split(",");
                boolean vuela = (boolean) JOptionPane.showInputDialog(null, "¿La mascota vuela?", "Veterinaria", JOptionPane.QUESTION_MESSAGE, null, new Object[] {true, false}, true);
                boolean canta = (boolean) JOptionPane.showInputDialog(null, "¿La mascota canta?", "Veterinaria", JOptionPane.QUESTION_MESSAGE, null, new Object[] {true, false}, true);
                Consultorio.registrarMascotaLoro(tipoMascota, nombreDueno, nombreMascota, edad, direccion, telefono, prioridad, colores, vuela, canta);
            }

            JOptionPane.showMessageDialog(null, "Mascota registrada correctamente", "Veterinaria", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar mascota intentelo nuevamente " + e, "Veterinaria", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}