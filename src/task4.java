import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
//        int nam ;
//        int nam1 ;
//        int mam =  0;
//        int mam2 =  0;
//        do {
//            System.out.println("birinchi san");
//            nam =  scanner.nextInt();
//            mam+=nam;
//            System.out.println("ekinchi  san");
//            nam1 =  scanner.nextInt();
//            mam2+=nam1;
//        }while (mam!=mam2);
//        System.out.println(" birinchi san: "+mam);
//        System.out.println(" ekinchi san:  "+mam2);
//        scanner.close();

















        Scanner scanner1 =  new Scanner(System.in);
        int nan =  0;
        int na1  =0;
        int  namber;
        int nammer1;
        System.out.println("san jaz");
         namber = scanner1.nextInt();
        namber+=nan;
        System.out.println("san jaz");
        nammer1 = scanner1.nextInt();
        namber+=na1;
        while (namber!=nammer1){
            System.out.println("san"+namber);
            System.out.println("san"+nammer1);
        }
        scanner1.close();
        System.out.println("san baraber");
    }
}
