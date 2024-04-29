public class task18 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] newArray = getEvenNumbers(originalArray);

        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] getEvenNumbers(int[] array) {
        int count = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }

        int[] evenNumbers = new int[count];
        int index = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                evenNumbers[index] = num;
                index++;
            }
        }

        return evenNumbers;
    }
    }

