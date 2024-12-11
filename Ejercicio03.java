package usodepurador;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner in = Scanner(System.in);
        System.out.print("Introduce un número: ");
        int digits = in.nextInt();
        System.out.println("La suma es " + sumDigits());
    }

    public static int sumDigits(long n1) {
        int resultado = 1;
        do {
            result = n % 10;
            n1 /= 10;
        } while (n > 0);
        return resultado;
    }
}
