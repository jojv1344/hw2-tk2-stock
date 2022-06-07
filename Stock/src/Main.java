public class Main {
    public static void main(String[] args) {

        int startingScore = 100;
        int topUpAmount = 100;
        int bonus;

        if (topUpAmount > 1000) {
            bonus = topUpAmount / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Итоговый счёт: " + (startingScore + topUpAmount + bonus));

        System.out.println("Количество бонусных рублей: " + bonus);
    }
}
