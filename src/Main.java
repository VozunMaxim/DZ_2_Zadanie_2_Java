public class Main {
    public static void main(String[] args) {
        int remains = 10; // Начальная сумма на счете
        int amount = 100_000; // Сумма пополнения счета

        int bonus = amount / 100; // Бонус = сумма пополнения разделить на 100
        if (bonus < 10)          //  Если бонус меньше 10ти, тогда бонус = 0
            bonus = 0;

        int total = remains + amount + bonus; // Общая сумма = сумма на счету + сумма пополнения + сумма бонуса

        System.out.println("Начальная сумма на счете: " + remains + " руб.");
        System.out.println("Сумма пополнения на счет: " + amount + " руб.");
        System.out.println("При пополнении от 1000 руб. получаем бонусных: " + bonus + " руб.");
        System.out.println("Общая сумма на счете включая остаток: " + total + " руб.");

    }
}
