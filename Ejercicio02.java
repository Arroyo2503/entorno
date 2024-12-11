package usodepurador;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double x = in.nextInt();
        System.out.print("Introduce el segundo número: ");
        int y = in.nextDouble();
        System.out.print("Introduce el tercer número: ");
        int z = in.nextInt();
        System.out.print("El promedio es " + average(x, y) + "\n");
    }

    public static double average(double x, double y, double z) {
        return (x + y + z) / 2;
    }
}
