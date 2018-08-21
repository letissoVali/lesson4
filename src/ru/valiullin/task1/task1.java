package ru.valiullin.task1;
import java.util.Scanner;
//верси 2 с валидацией данных
public class task1 {
    public static void main(String[] args) {
        System.out.println("Hi, this is task 1");
        try{
            Scanner scanner = new Scanner(System.in);
            //Вводим значение в cli
            System.out.print("Для выхода набирите exit. Введите количество литров топлива: ");
            while(scanner.hasNext()){
                if(scanner.hasNextInt()){
                    int liters = scanner.nextInt();
                    int price = 43;
                    System.out.println("Цена бензина " + liters*price + " руб.");
                } else {
                    System.out.println("Введите число!");
                    scanner.next();
                }
                System.out.print("Введите количество литров топлива: ");
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
