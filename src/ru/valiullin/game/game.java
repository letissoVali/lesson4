package ru.valiullin.game;
import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Поиграем в игру? Я загадаю число от 0 до 100, а ты угадываешь его. Идет? Начнем!");
        //Загадываем число от 0 до 100
        int random = new Random().nextInt(101);

        System.out.println(random); // Выводим загаданное число
        //Так как диапазон рандомных значений от 0 до 100 то берем число большее 100
        int number = 101;
        //Ждем ввода числа от пользователя
        try{
            while (number != random) {
                System.out.print("Введи число от 0 до 100 которые как ты думаешь я загадал: ");
                number = scanner.nextInt();
                if (number != random) {
                    if (number > 100) { //условие проверки правила игры
                        System.out.println("Введи значение от 0 до 100!");
                    } else {
                        System.out.println("Неугадал, попробуй еще раз");
                    }
                } else {
                    System.out.println("Молодец у тебя получилось! Ты угадал.");
                    break;
                }
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println(e + " Введите число!");
        }
    }
}
