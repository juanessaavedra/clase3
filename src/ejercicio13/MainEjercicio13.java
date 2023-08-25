package ejercicio13;

import javax.swing.*;
import java.util.Scanner;

public class MainEjercicio13 {
    public static void main(String[] args) {

        Ejercicio13 ejercicio13 = new Ejercicio13();
        ejercicio13.option = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la marca que desea 1. Chevrolet 2. Mazda 3. Renault"));
        ejercicio13.referencias1 = Integer.parseInt(JOptionPane.showInputDialog(" Que referencia desea 1. Captiva \n 2. Tracker"));
        ejercicio13.referencias2 = Integer.parseInt(JOptionPane.showInputDialog(" Que referencia desea 1. Mazda 3 \n 2. Mazda 6"));
        ejercicio13.referencias3 = Integer.parseInt(JOptionPane.showInputDialog(" Que referencia desea 1. Kwid \n 2. Sptepway "));
        ejercicio13.showOption();


    }
}