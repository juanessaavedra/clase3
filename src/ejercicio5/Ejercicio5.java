
package ejercicio5;
public class Ejercicio5 {
    float size;
    int quantity;
    int totalCost;

    public Ejercicio5 (float size, int quantity) {
        this.size = size;
        this.quantity = quantity;
    }

    public int calculateTotalCost() {
        if (size == 1) {
            totalCost = quantity * 4000;
        } else if (size == 2) {
            totalCost = quantity * 6000;
        } else {
            System.out.println("Tipo de dato invalido");
            return 0;
        }
        return totalCost;
    }

}