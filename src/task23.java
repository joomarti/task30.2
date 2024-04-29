import java.util.Arrays;

public class task23 {
    public static void main(String[] args) {
        int n = 5;
        int[] result = generateIncreasingArray(n);
        System.out.println(Arrays.toString(result));
    }

    public static int[] generateIncreasingArray(int n) {
        int[] array = new int[n];
        array[0] = (int) (Math.random() * 100); // первый элемент массива - случайное число
        for (int i = 1; i < n; i++) {
            array[i] = array[i-1] + (int) (Math.random() * 100) + 1; // каждое следующее число больше предыдущего
        }
        return array;
    }
}


