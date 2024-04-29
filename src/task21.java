import java.util.Scanner;

public class task21 {
    public static void main(String[] args) {

        int n = 5;
        boolean b = true;
        char[] result = generateCharArray(n, b);
        System.out.println(new String(result));
    }

    public static char[] generateCharArray(int n, boolean b) {
        char[] array = new char[n];
        for(int i=0;i<n;i++){
            char c = (char)((int)'A' + (int)(Math.random()*26));
            if(!b){
                c = Character.toLowerCase(c);
            }
            array[i] = c;
        }
        return array;
    }
}

