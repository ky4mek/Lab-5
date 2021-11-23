package com.company;

import java.nio.charset.StandardCharsets;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void arrayInput(float[] arr, int N, Scanner sc) throws InputMismatchException, IllegalArgumentException { // Метод для ввода элементов массива, принимающий в качестве параметров массив, его длину и объект Scanner
        System.out.println("Введите элементы массива (числа):");
        for (int i = 0; i < N; i++) { // Цикл для ввода элементов массива negativeNumbers
            float newItem = sc.nextFloat(); // Заполнение массива числом что вводит пользователь программы
            if (newItem > 0) {
                throw new IllegalArgumentException(); // Генерация исключения
            }
            arr[i] = newItem;
        }
    }

    public static void printArray(float[] arr, int N) {
        for (int i = 0; i < N; i++) { // Цикл для вывода элементов массива negativeNumbers
            System.out.print(arr[i] + " ");
        }
    }

    public static int getMinNumberIndex(float[] arr, int N) { // Метод для получения индекса минимального элемента массива, принимающий в качестве параметров массив и его длину
        int minIdx = 0;
        float min = arr[0]; // Для начала следует взять первый элемент массива, а затем сравнить его в ци
        for (int i = 0; i < N; i++) { // Цикл для поиска минимума
            if (min > arr[i]) { // если минимальное число больше текущего числа в массива
                min = arr[i];
                minIdx = i;
            }
        }
        return minIdx;
    }


    public static void main(String[] args) { // Главный метод main
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8); // Создание экземляра класса Scanner для считывания и обработки вводимых данных
        int N = 5; // Количество элементов массива
        float[] negativeNumbers = new float[N]; // одномерный массив из 5 элементов типа float

        boolean isInputValid = false;
        while (!isInputValid) {
            try {
                arrayInput(negativeNumbers, N, sc);
                isInputValid = true;
            } catch (InputMismatchException e) { // перехват и обработка ошибки
                System.out.println("Вводить можно только числа!");
                sc.nextLine();
            } catch (IllegalArgumentException e) { // перехват и обработка ошибки
                System.out.println("В массиве присутствуют неотрицательные числа!");
                sc.nextLine();
            }
        }

        int minNumberIndex = getMinNumberIndex(negativeNumbers, N);
        float min = negativeNumbers[minNumberIndex];
        System.out.println();
        System.out.println("Минимальное число в массиве = " + min + " с индексом " + minNumberIndex);
    }
}
