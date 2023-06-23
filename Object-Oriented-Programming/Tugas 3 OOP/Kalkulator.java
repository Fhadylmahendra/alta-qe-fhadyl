import java.util.Scanner;

public class Kalkulator {
    float angka1;
    float angka2;

    public void inputan() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextFloat();
        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextFloat();

    }
}
