package ejercicio12;

import javax.swing.*;

public class Ejercicio12 {

        public boolean option;

        public int victorias1;

        public int puntuacion1;

        public String equipo1;

        public String equipo2;

        public int victorias2;

        public int puntuacion2;

        public void mostrarCiclo(){
            while (option) {
                if (equipo1.equals(equipo1)) {

                    puntuacion1 = (victorias1 * 3);
                    System.out.println("El equipo" + equipo1 + "Ha ganado con" + puntuacion1);


                } else if (equipo2.equals(equipo2)) {

                    puntuacion2 = (victorias2 * 3);
                    System.out.println("El equipo" + equipo2 + "Ha ganado con" + puntuacion2);
                } else {
                    System.out.println("Opcion incorrecta");
                }
            }
        }
    }


