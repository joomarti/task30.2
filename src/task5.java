import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите целое число:");
//        int number = scanner.nextInt();
//        printEvenOddDigits(number);
//    }
//    public static void printEvenOddDigits(int number) {
//        int digit;
//        System.out.print("Четные цифры: ");
//        while (number > 0) {
//            digit = number % 10;
//            if (digit % 2 == 0) {
//                System.out.print(digit + " ");
//            }
//            number /= 10;
//        }
//        System.out.println();
//        number = number;
//        System.out.print("Нечетные цифры: ");
//        while (number > 0) {
//            digit = number % 10;
//            if (digit % 2 != 0) {
//                System.out.print(digit + " ");
//            }
//            number /= 10;
//        }

        Scanner scanner = new Scanner(System.in);
        int nam1 =  scanner.nextInt();
        namber(nam1);

    }
    public static  void namber (int nam){
        int nam2 ;
        while (nam>0){
            nam2=nam%10;
            if (nam2%2==0){
                System.out.print(nam2);
            }
            nam/=10;
        }


    }
}










