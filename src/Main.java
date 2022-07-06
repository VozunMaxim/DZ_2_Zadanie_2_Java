public class Main {
    public static void main(String[] args) {
        int remains = 400; // Начальная сумма на счете
        int amount = 1999; // Сумма пополнения счета
        boolean A = true;

        int percent;
        if (A) {
            percent = 1;
        } else {
            percent = 0;
        }

        int bonus = amount / 100 * percent;
        if (bonus < 10) {
            bonus = percent = 0;
        }
        int total = remains + amount + bonus;

        System.out.println("Начальная сумма на счете: " + remains + " руб.");
        System.out.println("Сумма пополнения на счет: " + amount + " руб.");
        System.out.println("При пополнении от 1000 руб. получаем бонусных: " + bonus + " руб.");
        System.out.println("Общая сумма на счете включая остаток: " + total + " руб.");

    }
}
