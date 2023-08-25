package ejercicio9;

import javax.swing.*;

public class Ejercicio9 {
    public int votosgeneral;

    public int votosana;

    public int votosdiego;

    public int votacion;

    public void showDoWhile(){
        do{
            if (votacion == 1) {votosana++;}
            else if (votacion == 2) {votosdiego++;}
            votosgeneral++;
        }while (votosgeneral!= 10);
        if (votosana > votosdiego) {
            JOptionPane.showMessageDialog(null, "Ana es la ganadora y Diego es el perdedor");
        }
        else if (votosdiego > votosana) {
            JOptionPane.showMessageDialog(null, "Diego es el ganador y Ana es la perdedora");
        }
        else {
            JOptionPane.showMessageDialog(null, "Opcion incorrecta");
        }
    }
}