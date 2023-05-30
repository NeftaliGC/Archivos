package com.nintech.veterinaria;

import javax.swing.*;

public class Veterinaria {
    public static void main(String[] args) {
        boolean exe = true;
        do {
            int val = menu();
            switch (val) {
                case 1:
                    subMenu("dar de alta");
                    break;
                case 2:
                    subMenu("dar consulta");
                    break;
                case 3:
                    exe = false;
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema de la veterinaria", "Veterinaria", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        } while (exe);
    }

    public static int menu() {
        String[] menus = {
            "1. Dar de alta a mascota",
            "2. Dar consulta a mascota",
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
            "Seleccione la mascota " + action,
            "Veterinaria",
            JOptionPane.QUESTION_MESSAGE,
            null,
            menu,
            menu[0]
        );

        if (selectedOption != null) {
            if (action == "dar de alta" && selectedOption != "Volver" && selectedOption == "Perro") {
                javax.swing.JOptionPane.showMessageDialog(null, "Dar de alta a " + selectedOption);
                RellenarFormulario("Perro");
            } else if (action == "dar de alta" && selectedOption != "Volver" && selectedOption == "Gato") {
                javax.swing.JOptionPane.showMessageDialog(null, "Dar de alta a " + selectedOption);
                RellenarFormulario("Gato");
            } else if (action == "dar de alta" && selectedOption != "Volver" && selectedOption == "Loro") {
                javax.swing.JOptionPane.showMessageDialog(null, "Dar de alta a " + selectedOption);
                RellenarFormulario("Loro");
            }   
            else if (action == "dar consulta" && selectedOption != "Volver") {
                javax.swing.JOptionPane.showMessageDialog(null, "Consulta de " + selectedOption + "s");
            }  
        }
    }

    public static void RellenarFormulario(String tipoMascota) {
        if (tipoMascota == "Perro") {
            String nombreDueno = JOptionPane.showInputDialog(null, "Ingrese el nombre del dueño", "Veterinaria", JOptionPane.QUESTION_MESSAGE);
            String nombreMascota = JOptionPane.showInputDialog(null, "Ingrese el nombre de la mascota", "Veterinaria", JOptionPane.QUESTION_MESSAGE);
            int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad de la mascota", "Veterinaria", JOptionPane.QUESTION_MESSAGE));
            String direccion = JOptionPane.showInputDialog(null, "Ingrese la dirección del dueño", "Veterinaria", JOptionPane.QUESTION_MESSAGE);
            String telefono = JOptionPane.showInputDialog(null, "Ingrese el teléfono del dueño", "Veterinaria", JOptionPane.QUESTION_MESSAGE);
            int prioridad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la prioridad de la mascota", "Veterinaria", JOptionPane.QUESTION_MESSAGE));
            String raza = JOptionPane.showInputDialog(null, "Ingrese la raza de la mascota", "Veterinaria", JOptionPane.QUESTION_MESSAGE);
            String tamano = JOptionPane.showInputDialog(null, "Ingrese el tamaño de la mascota", "Veterinaria", JOptionPane.QUESTION_MESSAGE);
            Consultorio.registrarMascotaPerro(tipoMascota, nombreDueno, nombreMascota, edad, direccion, telefono, prioridad, raza, tamano);
        } else if (tipoMascota == "Gato") {
            String nombreDueno = JOptionPane.showInputDialog(null, "Ingrese el nombre del dueño", "Veterinaria", JOptionPane.QUESTION_MESSAGE);
            String nombreMascota = JOptionPane.showInputDialog(null, "Ingrese el nombre de la mascota", "Veterinaria", JOptionPane.QUESTION_MESSAGE);
            int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad de la mascota", "Veterinaria", JOptionPane.QUESTION_MESSAGE));
            String direccion = JOptionPane.showInputDialog(null, "Ingrese la dirección del dueño", "Veterinaria", JOptionPane.QUESTION_MESSAGE);
            String telefono = JOptionPane.showInputDialog(null, "Ingrese el teléfono del dueño", "Veterinaria", JOptionPane.QUESTION_MESSAGE);
            int prioridad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la prioridad de la mascota", "Veterinaria", JOptionPane.QUESTION_MESSAGE));
            String color = JOptionPane.showInputDialog(null, "Ingrese el color de la mascota", "Veterinaria", JOptionPane.QUESTION_MESSAGE);
            String tamano = JOptionPane.showInputDialog(null, "Ingrese el tamaño de la mascota", "Veterinaria", JOptionPane.QUESTION_MESSAGE);
            Consultorio.registrarMascotaGato(tipoMascota, nombreDueno, nombreMascota, edad, direccion, telefono, prioridad, color, tamano);
        } else if (tipoMascota == "Loro") {
            String nombreDueno = JOptionPane.showInputDialog(null, "Ingrese el nombre del dueño", "Veterinaria", JOptionPane.QUESTION_MESSAGE);
            String nombreMascota = JOptionPane.showInputDialog(null, "Ingrese el nombre de la mascota", "Veterinaria", JOptionPane.QUESTION_MESSAGE);
            int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad de la mascota", "Veterinaria", JOptionPane.QUESTION_MESSAGE));
            String direccion = JOptionPane.showInputDialog(null, "Ingrese la dirección del dueño", "Veterinaria", JOptionPane.QUESTION_MESSAGE);
            String telefono = JOptionPane.showInputDialog(null, "Ingrese el teléfono del dueño", "Veterinaria", JOptionPane.QUESTION_MESSAGE);
            int prioridad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la prioridad de la mascota", "Veterinaria", JOptionPane.QUESTION_MESSAGE));
            String[] colores = JOptionPane.showInputDialog(null, "Ingrese los colores de la mascota", "Veterinaria", JOptionPane.QUESTION_MESSAGE).split(",");
            boolean vuela = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "¿La mascota vuela?", "Veterinaria", JOptionPane.QUESTION_MESSAGE));
            boolean canta = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "¿La mascota canta?", "Veterinaria", JOptionPane.QUESTION_MESSAGE));
            Consultorio.registrarMascotaLoro(tipoMascota, nombreDueno, nombreMascota, edad, direccion, telefono, prioridad, colores, vuela, canta);
        }
            
    }
}