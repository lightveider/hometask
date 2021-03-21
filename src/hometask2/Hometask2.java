package hometask2;

import java.util.Scanner;

public class Hometask2 {
    public static void main(String[] args) {
        //Задание 1
        int count = 45;

        if (count == 100) {
            System.out.println("Оценка отлично");
        } else if (count >= 90) {
            System.out.println("Оценка отлично");
        } else if (count >= 60) {
            System.out.println("Оценка хорошо");
        } else if (count >= 40) {
            System.out.println("Оценка удовлетворительно");

        } else if (count >= 0) {
            System.out.println("Попробуйте в следующий раз");
        } else {
            System.out.println("Введите корректное количество баллов");

        }
        //Задание 2
        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число");
        int a = input.nextInt();

        System.out.println("Введите второе число");
        int b = input.nextInt();

        System.out.println("Введите третье число");
        int c = input.nextInt();

        switch (c) {
            case 3:
                System.out.println("Сумма " + (a + b + c));
                break;
            case 5:
                System.out.println("Разность " + (a - b - c));
                break;
            case 7:
                System.out.println("Произведение " + (a * b * c));
                break;
            case 9:
                System.out.println("Частоное " + (a / b / c));
                break;
            default:
                System.out.println("Третье число должно быть одним из списка 3 5 7 9 ");
        }
        //Задание 3
        Scanner counter = new Scanner(System.in);
        System.out.println("Введите число тарелок");
        int plate = counter.nextInt();
        System.out.println("Введите количество моющего средства");
        double washing = counter.nextDouble();

        while (plate != 0) {
            if (washing > 0) {
                washing = washing - 0.5;
                System.out.println("Моющего осталось " + washing);
                plate--;
                if (plate == 0) {
                    System.out.println("Моющего после того как закончились тарелки осталось " + washing);
                }


            } else if (plate > 0) {
                System.out.println("После окончания моющего осталось " + plate + " тарелок");
                break;


            }
        }
        //Задание 4
        int programNum = 5;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 1 до 9");
        int guess = in.nextInt();


        while (guess != programNum) {
            if (guess > programNum) {
                if (guess > 9) {
                    System.out.println("Введите корректное число");
                } else
                    System.out.println("Загаданное число меньше");

                guess = in.nextInt();


            } else if (guess == 0) {
                break;
            } else if (guess < programNum) {
                if (guess < 0) {
                    System.out.println("Введите корректно число");
                } else
                    System.out.println("Загаданное число больше");
                System.out.println();
                guess = in.nextInt();
            }
        }

        {
            if (guess == programNum) {
                System.out.println("Вы угадали");
            }
        }
        //задание 5
        // Задание 5
        double randomNum = Math.random();
        randomNum = (randomNum * 1000) % 1000;
        int number = (int) randomNum;


        while (number > 10) {

            if (number > 500) {
                randomNum = Math.random();
                randomNum = (randomNum * 1000) % 1000;
                number = (int) randomNum;

            } else {
                break;
            }
        }

        if (number > 25) {
            if (number < 200) {
                System.out.println("Число " + number + " содержится в интервале");
            } else System.out.println("Число " + number + " не содержится в интервале");


        } else System.out.println("Число " + number + "не содержится в интервале");
    }
}
