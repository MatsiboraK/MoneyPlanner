package ru.netology.javaqa.moneyPlanner.services;

public class MoneyPlanner {
    public int calculate(int income, int expenses, int thershold) {
        int count = 0; // счётчик месяцев
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= thershold) { // отдыхает
                count++; // увеличиваем счетчик месяца
                int prevMoney = money; // запоминаем количество денег на текущий момент
                money = money - expenses; // вычитаем обязательные траты
                int moneyBeforeRest = money; // запоминаем количество денег до трат на отдых
                money = money / 3; // на отдых потратили 2/3, т.е 1/3 осталась у нас
                System.out.println("Месяц " + (month + 1) + ". Денег " + prevMoney + ". Буду отдыхать. Потратил - " + expenses + ", а затем ещё -" + (moneyBeforeRest - money));
            } else { // работает
                int prevMoney = money; // Деньги на начало периода отсчета
                money = money + income - expenses;
                System.out.println("Месяц " + (month + 1) + ". Денег " + prevMoney + ". Придётся работать. Заработал " + income + ", потратил -" + expenses);
            }
        }
        System.out.println("Всего месяцев отдыха: " + count);

        return count;
    }
}
