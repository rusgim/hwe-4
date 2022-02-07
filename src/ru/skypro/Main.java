package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int p = 0;
        while (p < 10) {
            p++;
            System.out.print(" " + p);
        }
        System.out.print("\n");
        for (int rest = 10; rest > 0; rest--) {
            System.out.print(" " + rest);
        }
        System.out.print("\n");
        int friday = 4;
        for (int day = friday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница " + day + "-ое число. " + "Необходимо подготовить отчет.");
        }
        int year = 2022;
        int comet = year - 200;
        int cometForAllYears = year + 100;
        for (int all = comet; all < cometForAllYears; all++) {
            if (all % 79 == 0) {
                System.out.println(all);
            }
        }
    }
}
