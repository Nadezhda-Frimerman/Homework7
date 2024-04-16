public class Main {
    public static void main(String[] args) {
        System.out.println("execise 1");
        double moneyForaMonth = 15_000;
        double moneyWithPercent = 0;
        int month = 0;
        while (moneyWithPercent < 2_459_000) {
            moneyWithPercent = (moneyWithPercent * 1.01) + moneyForaMonth;
            month = month + 1;
            System.out.printf("Месяц %s, сумма накоплений равна %.2f рублей.%n", month, moneyWithPercent);
        }
        System.out.println("");
        System.out.println("execise 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println(" ");
        System.out.println("execise 3");
        int peopleAmount = 12_000_000;
        int increasePerThousand = 17;
        int decreasePerThousand = 8;
        int year = 0;
        while (year < 10) {
            peopleAmount = peopleAmount + peopleAmount * increasePerThousand / 100 - peopleAmount * decreasePerThousand / 1000;
            year++;
            System.out.printf("Год %s численность населения составляет %s,%n", year, peopleAmount);
        }
        System.out.println(" ");
        System.out.println("execise 4");
        double vasiliyMoneyWithPercent = 15_000;
        int vasiliymonth = 0;
        while (vasiliyMoneyWithPercent < 12_000_000) {
            vasiliyMoneyWithPercent = (vasiliyMoneyWithPercent * 1.07);
            vasiliymonth++;
            System.out.printf("Месяц %s, сумма накоплений равна %.2f рублей.%n", vasiliymonth, vasiliyMoneyWithPercent);
        }
        System.out.println(" ");
        System.out.println("execise 5");
        double vasMoneyWithPercent = 15_000;
        int vasmonth = 0;
        while (vasMoneyWithPercent < 12_000_000) {
            vasMoneyWithPercent = (vasMoneyWithPercent * 1.07);
            vasmonth = vasmonth + 1;
            if (vasmonth % 6 == 0) {
                System.out.printf("Месяц %s, сумма накоплений равна %.2f рублей.%n", vasmonth, vasMoneyWithPercent);
            }
        }
        System.out.println(" ");
        System.out.println("execise 6");
        double vasMoney = 15_000;
        int vasI = 0;
        while (vasI < 108) {
            vasMoney = (vasMoney * 1.07);
            vasI = vasI + 1;
            if (vasI % 6 == 0) {
                System.out.printf("Месяц %s, сумма накоплений равна %.2f рублей.%n", vasI, vasMoney);
            }
        }
        System.out.println(" ");
        System.out.println("execise 7");
        int friday = 3;
        while (friday <= 31) {
            System.out.printf("Сегодня пятница, %s-е число. Необходимо подготовить отчет%n", friday);
            friday = friday + 7;
        }
        System.out.println(" ");
        System.out.println("execise 8");
        int yearNow = 2024;
        int yearBegin = yearNow - 200;
        int yearfinish = yearNow + 100;
        int yearComet = yearBegin + (79 - yearBegin % 79);
        while (yearComet <= yearfinish) {
            System.out.println(yearComet);
            yearComet = yearComet + 79;
        }
    }
}
