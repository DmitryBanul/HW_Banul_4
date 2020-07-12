package com.itacademy.task.hw4;

import java.util.Scanner;

/**
 * 2. Написать программу, вычисляющую и отображающую все числа Фибоначчи меньше введённого пользователем целого числа.
 */

public class task2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int value = in.nextInt();

        int value1 = 1;
        int value2 = 1;

        System.out.print(value1 + " " + value2 + " ");

        for (int i = 2; i != value; i++) {
            int result;
            result = value1 + value2;
            value1 = value2;
            value2 = result;
            if (result < value) {
                System.out.print(result + " ");
            }


        }


    }


}

