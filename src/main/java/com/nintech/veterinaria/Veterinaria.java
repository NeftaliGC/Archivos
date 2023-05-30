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
            if (action == "dar de alta" && selectedOption != "Volver") {
                javax.swing.JOptionPane.showMessageDialog(null, "Dar de alta a " + selectedOption);
            } else if (action == "dar consulta" && selectedOption != "Volver") {
                javax.swing.JOptionPane.showMessageDialog(null, "Consulta de " + selectedOption + "s");
            }  
        }
    }
}