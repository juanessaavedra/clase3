package ejercicio4;

public class Ejercicio4 {
    int selectedService;
    int typeWashing;
    int quantity;
    int totalCost;

    public Ejercicio4 (int selectedService, int typeWashing, int quantity) {
        this.selectedService = selectedService;
        this.typeWashing = typeWashing;
        this.quantity = quantity;
    }

    public int calculateTotalCost() {
        if (selectedService == 1) {
            if (typeWashing == 1) {
                totalCost = quantity * 2000;
            } else if (typeWashing == 2) {
                totalCost = quantity * 1500;
            } else {
                System.out.println("Tipo de lavado invalido");
                return 0;
            }
        } else if (selectedService == 2) {
            totalCost = quantity * 1800 + 3000;
        } else {
            System.out.println("Opcion invalida");
            return 0;
        }
        return totalCost;
    }
}