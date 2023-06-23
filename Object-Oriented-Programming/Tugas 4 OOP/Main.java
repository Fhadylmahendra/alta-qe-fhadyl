import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Perhitungan Harga Ongkos Kirim Fhadyl Express: ");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang (cm): ");
        float panjang = input.nextFloat();
        System.out.print("Masukkan lebar (cm): ");
        float lebar = input.nextFloat();
        System.out.print("Masukkan tinggi (cm): ");
        float tinggi = input.nextFloat();
        System.out.print("Masukkan berat (kg): ");
        float berat = input.nextFloat();

        Pengiriman pengiriman = new Pengiriman(panjang,lebar,tinggi, berat);

        int harga = pengiriman.hitungHarga();
        System.out.println("Harga Ongkir: Rp " + harga);
    }
}