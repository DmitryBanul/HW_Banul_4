package com.itacademy.task.hw4;


/**
 * 3. Написать программу, отображающую статистику по осадкам за N дней. N вводится пользователем.
 *    Пользователь также должен ввести N целых чисел, обозначающих величину осадков в день.
 *    Программа должна выводить:
 * a. Количество дней
 * b. Сумму осадков за этот период
 * c. Среднее количество осадков за этот период
 * d. Максимальное количество дневных осадков за этот период
 */

public class task3 {

    public static void main(String[] args) {
        int value = 5;
        System.out.println("Количество дней: " + value);

        int value1 = 0;
        int value2 = 1;
        int value3 = 0;
        int value4 = 15;
        int value5 = 44;
        double result1 = value1 + value2 + value3 + value4 + value5;
        System.out.println("Сумма осадков: " + result1);

        double result2 = result1 / value;
        System.out.println("Среднее количество осадков: " + result2);

    }

}
