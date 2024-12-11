package usodepurador;

public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Introduce la cadena: ");
        String str = in.next();
        System.out.print("Número de vocales en la cadena: " + count_Vowels(str) + "\n");
    }

    public static int count_Vowels() {
        int cont = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'a' && str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                cont--;
            }

        }
        return cont;
    }

}
