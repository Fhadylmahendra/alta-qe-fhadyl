import java.util.Scanner;

public class Main {
    private static boolean primeNumber(int number) {
        int prime = 0;
        int x;
        for (x = 1; x <= number; x++) {
            if (number % x == 0) {
                prime = prime + 1;
            }
        }
        if (prime > 2)
            return false;
        else
            return true;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input bilangan: ");
        int angka = input.nextInt();
        System.out.println("apakah bilangan prima: ");
        System.out.println(primeNumber(angka));
    }

}