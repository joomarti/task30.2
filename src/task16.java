import java.util.Random;

public class task16 {
    public static void main(String[] args) {
        int[] numbers = generateRandomArray(10);
        int n = 5;

        countOccurrences(numbers, n);
    }

    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(50) + 1; // генерируем случайное число от 1 до 50
        }

        return array;
    }

    public static void countOccurrences(int[] numbers, int n) {
        int count = 0;

        for (int number : numbers) {
            if (number == n) {
                count++;
            }
        }

        System.out.println("Число " + n + " повторяется " + count + " раз(а) в массиве.");
    }
}

