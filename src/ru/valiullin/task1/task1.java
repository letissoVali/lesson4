package ru.valiullin.task1;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Hi, this is task 1");
        try{
            Scanner scanner = new Scanner(System.in);
            //Вводим значение в cli
            System.out.print("Введите количество литров топлива: ");
            int liters = scanner.nextInt();
            System.out.print("Введите цену топлива за литр: ");
            int price = scanner.nextInt();
            //Выводим результат
            System.out.println("Цена бензина " + liters*price + " руб.");
        } catch (java.util.InputMismatchException e) {
            System.out.println(e + " Введите число!");
        }
    }
}
