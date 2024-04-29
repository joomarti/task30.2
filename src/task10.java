import java.util.Random;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(20,100); // generate random two-digit numbers
        }

        System.out.println("First half of the array:");
        for (int i = 0; i < size / 2; i++) {;
            System.out.print(array[i]+" ");
        }

    }
}
