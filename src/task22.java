public class task22 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        String name = "Charlie";
        boolean result = findNameAndIndexIsEven(names, name);
        System.out.println(result);
    }

    public static boolean findNameAndIndexIsEven(String[] array, String name) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(name) && i % 2 == 0) {
                return true;
            }
        }
        return false;
    }
    }

