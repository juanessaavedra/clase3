package ejercicio3;

import javax.swing.*;

public class MainPoint3 {

    public static void main(String[] args) {
        Point3 property = new Point3();
        property.cost = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo de la casa:"));
        property.type = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de inmueble: 1.Usado 2.Nuevo:"));
        property.calculateCommission();

        System.out.println("Comisión de la inmobiliaria: $" + property.commission);
        System.out.println("Valor que recibe el propietario: $" + (property.cost - property.commission));
    }
}