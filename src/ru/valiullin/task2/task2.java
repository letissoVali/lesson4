package ru.valiullin.task2;
import java.util.Scanner;
//верси 2 с валидацией данных

public class task2 {
    public static void main(String[] args) {
        System.out.println("Hi, this is task 2");
        try {
            Scanner scanner = new Scanner(System.in);
            //Вводим значение с cli
            System.out.print("Для выхода набирите exit. Введите Вашу ЗП: ");
            while(scanner.hasNext()){
                if(scanner.hasNextInt()){
                    int salary = scanner.nextInt();
                    double prcnt = 0.13;
                    //Выводим результат
                    System.out.println("Чистыми на руки " + (salary-(salary * prcnt)));
                } else {
                    System.out.println("Введите число!");
                    scanner.next();
                }
                System.out.print("Введите Вашу ЗП: ");
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

