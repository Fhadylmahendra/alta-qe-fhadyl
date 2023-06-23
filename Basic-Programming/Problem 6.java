import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("masukkan height: ");
        Scanner input = new Scanner(System.in);
        int tinggi = input.nextInt();
        drawXYZ(tinggi);
    }

    public static void drawXYZ(int height) {
        char[] simbol = {'X', 'Y', 'Z'};
        int indeks = 0;
        for (int kolom = 0; kolom < height; kolom++) {
            System.out.println();
                for (int baris = 0; baris < height; baris++) {
                    indeks = indeks + 1;
                    if ((indeks) % 3 == 0) {
                        System.out.print(" x ");
                    } else {
                        if ((indeks) % 2 == 0) {
                            System.out.print(" z ");
                        } else if ((indeks) % 2 == 1)
                            System.out.print(" y ");
                    }
                }
            }
        }
    }













