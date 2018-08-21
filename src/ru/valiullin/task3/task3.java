package ru.valiullin.task3;


import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("Hi, this is task 3");
        try {
            int oneHourInSecs = 3600;
            Scanner scanner = new Scanner(System.in);
            //Вводим значение в cli
            System.out.print("Для выхода набирите exit. Введите количество секунд: ");
            while(scanner.hasNext()) {
                if(scanner.hasNextInt()) {
                    int secsIn = scanner.nextInt();
                    int totalHour = secsIn / oneHourInSecs;
                    //делим по модулю = остаток минут в секундах превращяем в минуты
                    int totalHour_module = secsIn%oneHourInSecs/60;
                    System.out.println("Количество часов в переданных секундaх " + totalHour+","+totalHour_module);
                } else {
                    System.out.println("Введите число!");
                    scanner.next();
                }
                System.out.print("Введите количество секунд: ");
                if(scanner.hasNext("exit")) {
                    System.out.println("На выход!");
                    break;
                }
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println(e + " Введите число!");
        }
    }
}
