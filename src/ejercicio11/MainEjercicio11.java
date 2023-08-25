package ejercicio11;

import javax.swing.*;

public class MainEjercicio11 {
    public static void main(String[] args) {


            int valor = Integer.parseInt(JOptionPane.showInputDialog("1. Billete 2. Moneda"));

            if (valor == 1) {
                int tipo = Integer.parseInt(JOptionPane.showInputDialog("1. 2000 2. 5000"));
                if (tipo == 1) {
                    System.out.println("Su devuelta es de 1500");
                } else {
                    System.out.println("Su devuelta es de 4500");
                }
            } else if (valor == 2){
                valor = Integer.parseInt(JOptionPane.showInputDialog("1. 500 2. 1000"));
                if (valor == 1) {
                    System.out.println("Su devuelta es de 0 pesos");
                } else {
                    System.out.println("Su devuelta es de 500");
                }
            } else {
                System.out.println("Valor incorrecto");
            }
        }
    }

