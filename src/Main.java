//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i ++) {
            System.out.println(i + " ");
        }
        System.out.println();
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i --) {
            System.out.println(i + " ");
        }
        System.out.println();
        System.out.println("Задание 3");
        for (int i = 0; i < 17; i ++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i --) {
            System.out.println(i + " ");
        }
        System.out.println();
        System.out.println("Задание 5");
        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + " год является высокосным");
            }
        System.out.println();
        System.out.println("Задание 6");
            for (int i = 7; i <= 98; i += 7) {
                System.out.println(i + " ");
            }
        System.out.println();
        System.out.println("Задание 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i + " ");
        }
        System.out.println();
        System.out.println("Задание 8");
        int amount = 29000;
        int sum = 0;
        for (int month = 1; month <= 12; month ++) {
            sum += amount;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + sum + " рублей.");
        }
        System.out.println();
        System.out.println("Задание 9");
        sum = 0;
        double percent = 1D / 100;
        for (int month = 1; month <= 12; month ++) {
            sum += amount;
            sum = (int) (sum * (1 + percent));
            System.out.println("Месяц " + month + " , сумма накоплений равна " + sum + " рублей.");
        }
        System.out.println();
        System.out.println("Задание 10");
        for (int multiplier = 1; multiplier <= 10; multiplier ++) {
            System.out.printf("%d х %d = %d%n", 2, multiplier, 2 * multiplier);
        }
        }
        }


