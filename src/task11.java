import java.util.Random;
import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите размер массива:");
            int size = scanner.nextInt();

            int[] array = new int[size];
            Random random = new Random();

            // Заполнение массива случайными двузначными числами
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(90) + 10; // Генерация случайного двузначного числа
            }

            System.out.println("Четные значения:");
            for (int num : array) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }

            System.out.println("\nНечетные значения:");
            for (int num : array) {
                if (num % 2 != 0) {
                    System.out.print(num + " ");
                }
            }
        }
    }




