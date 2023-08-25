
package ejercicio5;

import javax.swing.*;

public class MainEjercicio5 {
    public static void main (String[] args){
        int size = Integer.parseInt(JOptionPane.showInputDialog(null,"Bienvenido, de que tamaño desea sus stickers?: 1. Pequeño 2. Grande"));
        if (size == 1){
            int quantity = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de stickers que desea comprar"));
            if (quantity >=10) {
                Ejercicio5 point5 = new Ejercicio5(1, quantity);
                int totalCost = point5.calculateTotalCost();
                JOptionPane.showMessageDialog(null, "El costo total por los stickers es de:" + totalCost);
            }else if (quantity <= 10){
                JOptionPane.showMessageDialog(null,"La cantidad escogida no es valida");
            }
        }if (size == 2) {
            int quantity = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de stickers que desea comprar"));
            if(quantity>=10) {
                Ejercicio5 point5 = new Ejercicio5(2, quantity);
                int totalCost = point5.calculateTotalCost();
                JOptionPane.showMessageDialog(null, "El costo total por los stickers es de:" + totalCost);
            }else if (quantity <10){
                JOptionPane.showMessageDialog(null,"La cantidad escogida no es valida");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Opcion no valida");
        }
    }
}