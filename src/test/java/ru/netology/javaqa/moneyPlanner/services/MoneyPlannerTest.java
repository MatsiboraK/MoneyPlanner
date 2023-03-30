package ru.netology.javaqa.moneyPlanner.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
// import ru.netology.javaqa.moneyPlanner.services.MoneyPlanner;

public class MoneyPlannerTest {
    @Test
    void ShouldCalculateTheNumberOfMonthOfRest() {
        MoneyPlanner vacationSpending = new MoneyPlanner();

        //подготавливаем данные:
        int income = 10_000;
        int expenses = 3_000;
        int thershold = 20_000;
        int expected = 3;

        // Вызов целевого метода
        int actual = vacationSpending.calculate(income, expenses, thershold);

        // Сравниваем ожидаемый и фактический результат
        Assertions.assertEquals(expected, actual);

    }

     @Test
        void ShouldCalculateTheNumberOfMonthOfRestWithAnotherParams () {
            MoneyPlanner vacationSpending = new MoneyPlanner();

            //подготавливаем данные:
            int income = 100_000;
            int expenses = 60_000;
            int thershold = 150_000;
            int expected = 2;

            // Вызов целевого метода
            int actual = vacationSpending.calculate(income, expenses, thershold);

            // Сравниваем ожидаемый и фактический результат
            Assertions.assertEquals(expected, actual);


        }
}