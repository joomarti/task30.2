import java.util.Random;

public class task20 {
    public static void main(String[] args) {
        int[] array = new int[15];
        fillArrayWithRandomEvenNumbers(array);
        printArray(array);
    }

    public static void fillArrayWithRandomEvenNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50 + 10) * 2;
        }
    }

    public static void  printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
    }

    }
