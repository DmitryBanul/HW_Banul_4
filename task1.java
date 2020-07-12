package com.itacademy.task.hw4;

import java.util.Scanner;

/**
     * 1. Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.
    */

public class task1 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите целое число: ");

            int value = in.nextInt();
            int result = sum(value);
            System.out.println(result);
        }

        public static int sum(int value) {
            int result = 0;
            for (int newValue = value; newValue != 0; newValue /= 10) {
                result += newValue %10;
            }

            return result;
        }
    }
