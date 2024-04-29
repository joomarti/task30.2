import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите размер массива: ");
//        int size = scanner.nextInt();
//
//        int[] array = new int[size];
//        Random random = new Random();
//
//        for (int i = 0; i < size; i++) {
//            array[i] =  random.nextInt(1,9000); // Генерация случайного четырехзначного числа
//        }
//        System.out.println("Сгенерированный массив:");
//        for (int i = 0; i < size; i++) {
//            System.out.print(array[i] + " ");
//        }
//    }

        int[] metod = {1,23,3,45,4,56,6,67};
        System.out.println(Arrays.toString(metod(metod)));

    }
    public static int[] metod (int[] araru ) {
        for (int i = 0; i < araru.length - 1; i++) {
            for (int i1 = 0; i1 < araru.length - 1; i1++) {
                if (araru[i1] > araru[i1] + 1) {
                    int namber = araru[i];
                    araru[i1] = araru[i1 + 1];
                    araru[i1 + 1] = namber;


                }

            }

        }
        return araru;
    }
}

