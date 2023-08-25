package ejercicio9;

import javax.swing.*;

public class MainEjercicio9 {
    public static void main(String[] args) {

        Ejercicio9 ejercicio9 = new Ejercicio9();
        ejercicio9.votosgeneral = 0;
        ejercicio9.votosana = 0;
        ejercicio9.votosdiego = 0;
        ejercicio9.votacion = Integer.parseInt(JOptionPane.showInputDialog("Desea votar por: 1. Ana 2. Diego "));
        ejercicio9.showDoWhile();


    }
}