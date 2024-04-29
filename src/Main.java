import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int divisor = random.nextInt(1,100);
        System.out.println("болунучу катары колдонгон рандом  сан: " + divisor);
        for (int i = 0; i < 20; i++) {
            int randomNumber = random.nextInt(1,100);
            if (randomNumber % divisor == 0) {
                System.out.println(randomNumber + " / " + divisor + " без остатка");
            }
        }
    }
    }
