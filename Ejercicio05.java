package usodepurador;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String str = str.nextLine();
        System.out.print("El carácter medio en la cadena es: " + middle(str) + "\n");
    }

    public static void middle(String str) {
        int position;
        int length = 1;
        if (str.length % 2 != 0) {
            position = str.length() / 2 - 1;
            length = 0;
        } else {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position + 1, position + length);
    }
}
