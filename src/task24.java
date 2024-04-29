import java.util.Arrays;

public class task24 {
    public static void main(String[] args) {
        int[] a1 = {6,4,5,6,7,6,67};
        System.out.println(Arrays.toString(metod(a1)));
    }
    public static  int[]  metod (int[] arau){
        for (int i = 0; i < arau.length-1; i++) {
            for (int j = 0; j < arau.length-1; j++) {
                int a1 = arau[j];
                if (arau[j]>arau[j+1]){
                    arau[j]= arau[j+1];
                    arau[j+1]=a1;

                }

            }

        }
        return arau;
    }
}
