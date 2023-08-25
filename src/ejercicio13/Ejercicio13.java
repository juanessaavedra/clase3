package ejercicio13;

public class Ejercicio13 {
    public int option;

    public int referencias1;

    public int referencias2;

    public int referencias3;

    public void showOption() {
        switch (option) {
            case 1: {
                if (referencias1 == 1) {
                    System.out.println ("El chevrolet captiva se ofrece en España con cuatro motorizaciones, \n" +
                            "            dos gasolina y dos diésel. Las de gasolina son un cuatro cilindros de 2.4 litros y 167CV,\n" +
                            "             que solo puede ir asociado a tracción delantera, y un 3.0 V6 de 258CV con tracción total y \n" +
                            "             cambio automático que es un auténtico rara avis en nuestras carreteras. Las mecánicas diésel \n" +
                            "             emplean el mismo motor 2.2 con potencias de 163 y 184CV.");


                } else if (referencias1 == 2) {
                    System.out.println("importantes novedades en el nuevo Chevrolet Tracker es su motor L4H Turbo de tres cilindros,\n" +
                            "         con 1.2 litros y 12 válvulas. Eroga 132 hp a 5.500 rpm y 190 Nm de torque desde 2.000 rpm, conectado\n" +
                            "          según versión a una caja manual de 5 velocidades o automática de 6 marchas. Esta última incorpora la posición “L” (LOW) para la operación en modo secuencial.");

                }
            }
            break;
            case 2: {
                if (referencias2 == 1) {
                    System.out.println("El mazda cx 60 es el primer modelo de la marca de contar con un motor hibrido ");


                } else if (referencias2 == 2) {
                    System.out.println("En el Mazda MX-30 las baterías eléctricas se sitúan en la parte inferior del coche, bajo los pies del habitáculo.\n" +
                            "     Esto nos deja un maletero libre de impedimentos y obstáculos.");


                }
            }
            break;
            case 3: {

                if (referencias3 == 1) {
                    System.out.println("El kwid es una gran opcion para moverse a bajo costo en ciudades como Bogota");


                } else if (referencias3 == 2) {
                    System.out.println("los Renault Stepway 2020 incorporan el nuevo motor H4M de cuatro cilindros, \n" +
                            "    con 1.6 litros y 16 válvulas.");


                }
            }
            break;
            default: {
                System.out.println("Opcion incorrecta");
                break;
            }
        }

    }
}