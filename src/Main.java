public class Main {
    public static void main(String[] args) {
        System.out.println("execise 1");
        double moneyForaMonth = 15_000;
        double moneyWithPercent = 0;
        int month = 0;
        while (moneyWithPercent < 2_459_000) {
            moneyWithPercent = moneyWithPercent * 1.01 + moneyForaMonth;
            month = month + 1;
            System.out.printf("Месяц %s, сумма накоплений равна %.2f рублей.%n",
                    month, moneyWithPercent);
        }
                System.out.println(" ");
        System.out.println("execise 3");
        int peopleAmount = 12_000_000;
        int increasePerThousand = 17;
        int decreasePerThousand = 8;
        int year = 0;
        while (year < 10) {
            peopleAmount = peopleAmount + peopleAmount * increasePerThousand /
                    1000 - peopleAmount * decreasePerThousand / 1000;
            year++;
            System.out.printf("Год %s численность населения составляет %s,%n", year, peopleAmount);
        }
    }
}