import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4};

        float mean = perhitunganMean(arr);
        System.out.println("Mean dari array adalah: " + mean);
    }

    public static float perhitunganMean(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        float mean = (float) sum / arr.length;
        return mean;
    }
}