import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.println("masukkan alas: ");
        float alas = inputan.nextFloat();
        System.out.println("masukkan tinggi: ");
        float tinggi = inputan.nextFloat();
        float Luas = alas * tinggi/2;
        System.out.println("Luas Segitiga : " + Luas);

    }
}