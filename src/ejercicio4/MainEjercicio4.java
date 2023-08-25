package ejercicio4;

import javax.swing.*;

public class MainEjercicio4 {
    public static void main(String[] args){
        int selectedService = Integer.parseInt(JOptionPane.showInputDialog(null,"Bienvenido a lavan ya, que servicio desea?: 1. Lavado  2. Planchado"));
        if (selectedService == 1){
            int typeWashing = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione el tipo de lavado que desea: 1. En seco 2. Normal"));
            int quantity = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de prendas:"));
            Ejercicio4 point4 = new Ejercicio4(selectedService, typeWashing, quantity);
            int totalCost = point4.calculateTotalCost();
            JOptionPane.showMessageDialog(null,"El costo total del lavado es:" +totalCost);
        }else if (selectedService == 2) {
            int quantity = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de prendas que va a lavar"));
            Ejercicio4 point4 = new Ejercicio4(selectedService, 0, quantity);
            int totalCost = point4.calculateTotalCost();
            JOptionPane.showMessageDialog(null, "El costo total del planchado es de:" + totalCost);
        }else {
            JOptionPane.showMessageDialog(null,"Opcion no valida");
        }
    }
}