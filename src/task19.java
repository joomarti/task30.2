import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {
        int dayNumber = 3;
        String dayOfWeek = getDayOfWeek(dayNumber);
        System.out.println("День недели: " + dayOfWeek); // Вывод: Среда

    }
        public static String getDayOfWeek(int dayNumber) {
            String day = "";

            switch(dayNumber) {
                case 1:
                    day = "Понедельник";
                    break;
                case 2:
                    day = "Вторник";
                    break;
                case 3:
                    day = "Среда";
                    break;
                case 4:
                    day = "Четверг";
                    break;
                case 5:
                    day = "Пятница";
                    break;
                case 6:
                    day = "Суббота";
                    break;
                case 7:
                    day = "Воскресенье";
                    break;
                default:
                    day = "Некорректный номер дня";
                    break;
            }

            return day;
        }}