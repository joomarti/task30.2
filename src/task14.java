import java.util.Random;

public class task14 {
    public static void main(String[] args) {
        int[] array = generateRandomArray(10);
        filterNumbers(array);
    }

    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(50) + 1;
        }
        return array;
    }
    public static void filterNumbers(int[] array) {
        System.out.println("Numbers greater than 20:");
        for (int number : array) {
            if (number > 20) {
                System.out.println(number);
            }
        }
    }
}


