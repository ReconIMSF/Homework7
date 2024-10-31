//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        //Задача 1
        System.out.println("Задача 1");
        int income = 15000;
        int total = 0;
        short i = 0;
        while (total <= 2_459_000) {
            total = total + income;
            i += 1;
        }
        System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");

        //Задача 2
        System.out.println("Задача 2");
        byte j = 0;
        while (j <= 9) {
            j += 1;
            System.out.print(j + " ");
        }
        System.out.println(" ");
        for (; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println(" ");

        //Задача 3
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRatePer1000 = 17;
        int deathRatePer1000 = 9;
        int yearNow = 2024;
        int year = yearNow;
        while (year <= yearNow + 10) {
            population += population * birthRatePer1000 / 1000 - population * deathRatePer1000 / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
            year += 1;
        }

        //Задача 4
        System.out.println("Задача 4");
        int interest = 15000;
        int f = 0;
        while (interest <= 12_000_000) {
            interest = interest + (interest / 100) * 7;
            System.out.println("Месяц " + f + ", сумма накоплений равна " + interest + " рублей");
            f += 1;
        }

        //Задача 5
        System.out.println("Задача 5");
        int interest1 = 15000;
        int f1 = 0;
        while (interest1 <= 12_000_000) {
            interest1 = interest1 + (interest1 / 100) * 7;
            f1 += 1;
            if (f1 % 6 == 0) {
                System.out.println("Месяц " + f1 + ", сумма накоплений равна " + interest1 + " рублей");
            }
        }

        //Задача 6
        System.out.println("Задача 6");
        int interest2 = 15000;
        int f2 = 0;
        while (f2 <= 9 * 12) {
            interest2 = interest2 + (interest2 / 100) * 7;
            f2 += 1;
            if (f2 % 6 == 0) {
                System.out.println("Месяц " + f2 + ", сумма накоплений равна " + interest2 + " рублей");
            }
        }
        //Задача 7
        System.out.println("Задача 7");
        int friday = 3;
        int k = friday;
        int z = 1;
        while (k <= 31) {
            k += 1;
            if (k == friday + z * 7) {
                System.out.println("Сегодня пятница, " + k + "-е число. Необходимо подготовить отчет.");
                z += 1;
            }
        }

        //Задача 8
        System.out.println("Задача 8");
        int yearComet = 0;
        int currentYear = 2024;
        int year200before = currentYear - 200;
        int year100after = currentYear + 100;
        do {
            yearComet = yearComet + 79;
            if (yearComet > year200before && yearComet < year100after) {
                System.out.println(yearComet);
            }
        } while (yearComet < year100after);

    }
}