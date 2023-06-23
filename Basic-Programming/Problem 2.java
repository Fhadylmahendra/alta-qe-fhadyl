
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int StudentScore = 80;
    Scanner inputan = new Scanner(System.in);
    System.out.println("input nilai siswa (0-100): ");
    int nilaiAngka= inputan.nextInt();
        if (nilaiAngka >= 80 && nilaiAngka <=100) {
            char nilaiHuruf= 'A';
        System.out.println("nilai : "+ nilaiHuruf);}
        else if (nilaiAngka >= 65 && nilaiAngka <=79) {
                String nilaiHuruf= "B+";
                System.out.println("nilai : "+ nilaiHuruf);}
                else if (nilaiAngka >= 50 && nilaiAngka <=64) {
                   char nilaiHuruf= 'B';
                    System.out.println("nilai : "+ nilaiHuruf);}
                    else if (nilaiAngka >= 35 && nilaiAngka <=49) {
                           char nilaiHuruf= 'C';
                            System.out.println("nilai : "+ nilaiHuruf);}
                            else if (nilaiAngka >= 0 && nilaiAngka <=34) {
                               char nilaiHuruf= 'D';
                                System.out.println("nilai : "+ nilaiHuruf);}
                            else {System.out.println("nilai tidak valid");}
    }
}