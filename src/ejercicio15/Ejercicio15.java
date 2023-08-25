package ejercicio15;

public class Ejercicio15 {
    public String a;

    public String b;

    public String c;

    public String d;

    public String e;

    public void mostrarCiclo() {
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                e = a;
            } else {
                e = b;
            }
            System.out.println((e + c));
        }
        System.out.println(d);

    }
}
