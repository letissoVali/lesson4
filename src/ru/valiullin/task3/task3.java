package ru.valiullin.task3;


import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("Hi, this is task 3");
        try {
            int oneHourInSecs = 3600;
            //Вводим значение в cli
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите количество секунд: ");
            int secsIn = scanner.nextInt();
            int totalHour = secsIn / oneHourInSecs;
            //делим по модулю = остаток минут в секундах превращяем в минуты
            int totalHour_module = secsIn%oneHourInSecs/60;
            System.out.println("Количество часов в переданных секундaх " + totalHour+"."+totalHour_module);
        } catch (java.util.InputMismatchException e) {
            System.out.println(e + " Введите число!");
        }
    }
}
