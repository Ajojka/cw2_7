import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Liczby musza byc parzyste, rozne od zera i w zakresie <-10;10>");

        System.out.println("Podaj pierwsza liczbe calkowita: ");
        int a = scanner.nextInt();

        System.out.println("Podaj druga liczba calkowita: ");
        int b = scanner.nextInt();

        if (!czyPoprawna(a) || !czyPoprawna(b)) {
            System.out.println("Blad wprowadzenia liczb");
        } else {
            if (a > b) {
                System.out.println("Wieksza liczba to: " + a);
            } else if (b > a) {
                System.out.println("Wieksza liczba to: " + b);
            } else {
                System.out.println("Liczby sa rowne.");
            }
        }

        scanner.close();
    }

    public static boolean czyPoprawna(int n) {
        return n != 0 && n % 2 == 0 && n >= -10 && n <= 10;
    }
}
