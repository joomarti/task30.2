import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in
);
    int[] array = {5, 10, 15, 20, 25};
    int n =scanner.nextInt() ;
    checkNumber(array, n);
}

public static void checkNumber(int[] array, int n) {
    boolean found = false;
    for (int num : array) {
        if (num >= n) {
            found = true;
            break;
        }
    }
    System.out.println(found);
}
}