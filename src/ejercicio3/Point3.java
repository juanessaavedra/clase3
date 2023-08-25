package ejercicio3;

public class Point3 {
    public double cost;
    public int type;
    public double commission;

    public void calculateCommission() {
        if (type == 1) {
            commission = cost * 0.10;
        } else if (type == 2) {
            commission = cost * 0.12;
        }
    }
}