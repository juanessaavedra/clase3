package ejercicio12;

import javax.swing.*;

public class MainEjercicio12 {

    public static void main(String[] args) {
        Ejercicio12 ejercicio12 = new Ejercicio12();

        ejercicio12.option = true;
        ejercicio12.equipo1 = JOptionPane.showInputDialog("Ingrese su equipo1 de futbol");
        ejercicio12.victorias1  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de victorias de su equipo"));
        ejercicio12.equipo2 = JOptionPane.showInputDialog("Ingrese su equipo2 de futbol ");
        ejercicio12.victorias1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de victorias de su equipo2"));

        ejercicio12.mostrarCiclo();

    }
}
