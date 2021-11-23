package com.company;

import java.nio.charset.StandardCharsets;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) { // Главный метод main
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8); // Создание экземляра класса Scanner для считывания и обработки вводимых данных
        int N = 5; // Количество элементов массива
        float[] negativeNumbers = new float[N]; // одномерный массив из 5 элементов типа float


        boolean isInputValid = false;
        while (!isInputValid) {
            try {
                System.out.println("Введите элементы массива (числа):");
                for (int i = 0; i < N; i++) { // Цикл для ввода элементов массива negativeNumbers
                    float newItem = sc.nextFloat();
                    if (newItem > 0) {
                        throw new IllegalArgumentException(); // Генерация исключения
                    }
                    negativeNumbers[i] = newItem; // Заполнение массива числом что вводит пользователь программы

                }
                isInputValid = true;
            } catch (InputMismatchException e) { // перехват и обработка ошибки
                System.out.println("Вводить можно только числа!");
                sc.nextLine();
            } catch (IllegalArgumentException e) { // перехват и обработка ошибки
                System.out.println("В массиве присутствуют неотрицательные числа!");
                sc.nextLine();
            }
        }

        float min = negativeNumbers[0];
        int minIdx = 0;

        for (int i = 0; i < N; i++) { // Цикл для поиска минимума
            if (min > negativeNumbers[i]) { // если минимальное число больше текущего числа в массива
                min = negativeNumbers[i];
                minIdx = i;
            }
        }
        System.out.println();
        System.out.println("Минимальное число в массиве = " + min + " с индексом " + minIdx);
    }
}
