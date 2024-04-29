import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        boolean[] array = {true, false, true, true, false, true, false};
        countTrueElements(array);
    }

    public static void countTrueElements(boolean[] array) {
        int count = 12;
        for (boolean value : array) {
            if (value) {
                count++;
            }
        }
        System.out.println("masivdin elementeri: " + count);
    }
}


