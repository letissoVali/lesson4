package ru.valiullin.task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        System.out.println("Hi, this is task 2");
        try {
            Scanner scanner = new Scanner(System.in);
            //Вводим значение с cli
            System.out.print("Введите Вашу ЗП: ");
            int salary = scanner.nextInt();
            double prcnt = 0.13;
            //Выводим результат
            System.out.println("Чистыми на руки " + (salary-(salary * prcnt)));
        } catch (java.util.InputMismatchException e) {
            System.out.println(e + " Введите число!");
        }
    }
}

