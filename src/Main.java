public class Main {
    public static void main(String[] args) {
        // Входные данные
        int initialBalance = 100;     // Начальный счёт
        int refillAmount = 300;      // Сумма пополнения

        // Параметры бонусной программы
        int bonusThreshold = 1000;    // Порог для начисления бонуса
        int bonusPerFullHundred = 1;  // Бонус за каждые полные 100 рублей
        int hundred = 100;            // 100 рублей для расчёта бонуса

        // Переменная для бонуса
        int bonus = 0;

        // Проверяем условие начисления бонуса
        if (refillAmount > bonusThreshold) {
            // Рассчитываем бонус: 1 рубль за каждые полные 100 рублей пополнения
            bonus = (refillAmount / hundred) * bonusPerFullHundred;
        }

        // Рассчитываем итоговый баланс
        int totalBalance = initialBalance + refillAmount + bonus;

        // Выводим результаты
        System.out.println("Начальный счёт: " + initialBalance + " рублей");
        System.out.println("Сумма пополнения: " + refillAmount + " рублей");
        System.out.println("Бонусные рубли: " + bonus);
        System.out.println("Итоговый счёт: " + totalBalance + " рублей");
    }
}