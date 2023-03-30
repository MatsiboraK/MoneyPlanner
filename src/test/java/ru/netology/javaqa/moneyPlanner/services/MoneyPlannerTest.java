package ru.netology.javaqa.moneyPlanner.services;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
// import ru.netology.javaqa.moneyPlanner.services.MoneyPlanner;

public class MoneyPlannerTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/planner.csv")
    void ShouldCalculateTheNumberOfMonthOfRest(int expected, int income, int expenses, int thershold) {
        MoneyPlanner vacationSpending = new MoneyPlanner();

//        // подготавливаем данные:
//        int income = 10_000;
//        int expenses = 3_000;
//        int thershold = 20_000;
//        int expected = 3;

        // Вызов целевого метода
        int actual = vacationSpending.calculate(income, expenses, thershold);

        // Сравниваем ожидаемый и фактический результат
        Assertions.assertEquals(expected, actual);

    }

     /*@Test
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


        }*/
}