
package ejercicio10;

import javax.swing.*;

public class MainEjercicio10 {
    public static void main(String[] args) {
        int question1 = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Como se llama la lengua nativa en China? 1. Mandarin 2. Ingles"));
        if (question1 == 1) {
            int quantity =+ 10;

        } else {
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta");
        }

        int question2 = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cual es la moneda de Inglaterra? 1. Dolar 2. Libra"));
        if (question2 == 2) {
            int quantity =+ 10;
        } else {
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta");
        }

        int question3 = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Que planeta esta mas cerca del sol? 1. Mercurio 2. Saturno"));
        if (question3 == 1) {
            int quantity =+ 10;
        } else {
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta");
        }

        int question4 = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cual es el valor de PI? 1. 3.14 2. 4.23"));
        if (question4 == 1) {
            int quantity =+ 10;

        } else {
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta");
        }

        int question5 = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuantos huesos tiene el cuerpo humano? 1. 192 2. 206"));
        if (question5 == 2) {
            int quantity =+ 10;
        } else {
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta");
        }

    }
}



