import java.util.Scanner;

public class Main{
    public static boolean Palindrome(String word) {
        char[] karakter = word.toCharArray();
        int i = 0;
        int j = karakter.length - 1;
        while (i < j) {
            if (karakter[i] == karakter[j]) {
                return true;}
            i++;
            j--; }
        return false; }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();
        System.out.println("Apakah kalimat palindrome: ");
        System.out.println(Palindrome(kalimat));
    }
}