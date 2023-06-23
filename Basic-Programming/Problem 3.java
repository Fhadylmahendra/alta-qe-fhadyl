import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int bilangan;
    Scanner inputan = new Scanner(System.in);
    System.out.println("mencari faktor bilangan");
    System.out.println("input bilangan");
    bilangan = inputan.nextInt();
    int i;
    System.out.println("Faktor Bilangannya adalah: " );
    for (i =1; i<=bilangan; i++) {
        if (bilangan%i==0) {
            System.out.println(i);
        }
    }
    }
}