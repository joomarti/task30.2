import java.util.Scanner;

public class pult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ok;

            do {
                System.out.println("ТЕЛЕФИЗОРДУ ЖАНДУРУУ КНОПКАСЫ  'ok'  БАСЫНЫЗ⁉️");
                ok = scanner.nextLine();
                if (!ok.contains("ok")) {
                }
            } while (!ok.contains("ok"));
            System.out.println("КОШ КЕЛИНИЗ ");
            System.out.println("""
                    1  ЭЛТЕР
                    2 КТРКА
                    3 БАЛАСТАН
                    4 КЫРГЫЗСТАН
                    5 РАССИЯ""");
            while (true){
            switch (scanner.nextInt()) {

                case 1:
                    System.out.println("КОШ КЕЛИНИЗ ЭЛТЕР КАНАЛЫНА");
                    String namber;
                    do {
                        System.out.println("ТЕЛЕВИЗОРДУ ОЧУУРУ КНОПКАСЫ  't'");
                        namber = scanner.nextLine();
                        if (namber.contains("t")) {
                        }
                    } while (!namber.contains("t"));


                    String manber1;
                    do {
                        System.out.println("КОШ КЕЛИНИЗ КТРКА КАНАЛЫНА");
                        System.out.println("ТЕЛЕВИЗОРДУ КУЙГУУЗУ КНОПКАСЫ 'ok' ");
                        manber1 = scanner.nextLine();
                        if (manber1.contains("ok")) {
                            System.out.println("КОШ КЕЛИНИЗ");
                            System.out.println("""
                                    1  ЭЛТЕР
                                    2 КТРКА
                                    3 БАЛАСТАН
                                    4 КЫРГЫЗСТАН
                                    5 РАССИЯ
                                    СИЗ ЭЛТЕР КАНАЛЫНДА ТУРАСЫЗ""");

                        }
                    } while (!manber1.contains("ok"));
                    break;
                case 2:

                    String namber2;
                    do {
                        System.out.println("КОШ КЕЛИНИЗ КТРКА КАНАЛЫНА");
                        System.out.println("ТЕЛЕВИЗОРДУ ОЧУУРУ КНОПКАСЫ  't'");
                        namber2 = scanner.nextLine();
                        if (namber2.contains("t")) {

                        }
                    } while (!namber2.contains("t"));

                    String manber3;
                    do {
                        System.out.println("ТЕЛЕВИЗОРДУ КУЙГУУЗУ КНОПКАСЫ 'ok' ");
                        manber3 = scanner.nextLine();
                        if (manber3.contains("ok")) {
                            System.out.println("КОШ КЕЛИНИЗ");

                            System.out.println("""
                                    1  ЭЛТЕР
                                    2 КТРКА
                                    3 БАЛАСТАН
                                    4 КЫРГЫЗСТАН
                                    5 РАССИЯ
                                    СИЗ КТРКА КАНАЛЫНДА ТУРАСЫЗ""");

                        }
                    } while (!manber3.contains("ok"));
                    break;


                case 3:
                    System.out.println("КОШ КЕЛИНИЗ БАЛАСТАН КАНАЛЫНА");
                    String namber4;
                    do {
                        System.out.println("ТЕЛЕВИЗОРДУ ОЧУУРУ КНОПКАСЫ  't'");
                        namber4 = scanner.nextLine();
                        if (namber4.contains("t")) {

                        }
                    } while (!namber4.contains("t"));

                    String manber5;
                    do {
                        System.out.println("ТЕЛЕВИЗОРДУ КУЙГУУЗУ КНОПКАСЫ 'ok' ");
                        manber5 = scanner.nextLine();
                        if (manber5.contains("ok")) {
                            System.out.println("КОШ КЕЛИНИЗ");
                            System.out.println("""
                                    1  ЭЛТЕР
                                    2 КТРКА
                                    3 БАЛАСТАН
                                    4 КЫРГЫЗСТАН
                                    5 РАССИЯ
                                    СИЗ БАЛАСТАН  КАНАЛЫНДА ТУРАСЫЗ""");

                        }
                    } while (!manber5.contains("ok"));
                    break;


                case 4:
                    System.out.println("КОШ КЕЛИНИЗ КЫРГЫЗСТАН КАНАЛЫНА");
                    String namber3;
                    do {
                        System.out.println("ТЕЛЕВИЗОРДУ ОЧУУРУ КНОПКАСЫ  't.'");
                        namber3 = scanner.nextLine();
                        if (namber3.contains("t")) {

                        }
                    } while (!namber3.contains("t"));

                    String manber11;
                    do {
                        System.out.println("ТЕЛЕВИЗОРДУ КУЙГУУЗУ КНОПКАСЫ 'ok' ");
                        manber11 = scanner.nextLine();
                        if (manber11.contains("ok")) {
                            System.out.println("КОШ КЕЛИНИЗ");
                            System.out.println("""
                                    1  ЭЛТЕР
                                    2 КТРКА
                                    3 БАЛАСТАН
                                    4 КЫРГЫЗСТАН
                                    5 РАССИЯ
                                    СИЗ КЫРГЫЗСТАН  КАНАЛЫНДА ТУРАСЫЗ""");


                        }
                    } while (!manber11.contains("ok"));
                    break;


                case 5:
                    System.out.println("ДОБРА ПОЖАЛАВАТЬ РУССИЕ КАНАЛЫ");
                    String namber12;
                    do {
                        System.out.println("ТЕЛЕВИЗОРДУ ОЧУУРУ КНОПКАСЫ  't'");
                        namber12 = scanner.nextLine();
                        if (namber12.contains("t")) {

                        }
                    } while (!namber12.contains("t"));

                    String manber113;
                    do {
                        System.out.println("ТЕЛЕВИЗОРДУ КУЙГУУЗУ КНОПКАСЫ 'ok' ");
                        manber113 = scanner.nextLine();
                        if (manber113.contains("ok")) {
                            System.out.println("КОШ КЕЛИНИЗ");
                            System.out.println("""
                                    1  ЭЛТЕР
                                    2 КТРКА
                                    3 БАЛАСТАН
                                    4 КЫРГЫЗСТАН
                                    5 РАССИЯ
                                    СИЗ РАСИЯ КАНАЛЫНДА ТУРАСЫЗ""");

                        }
                    } while (!manber113.contains("ok"));
            }
        }

    }

}












