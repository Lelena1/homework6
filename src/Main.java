public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task21();
        task22();
        task23();
        task31();
        task32a();
        task32b();
    }

    // Homework 1. Task 1
    // С помощью цикла for выведите в консоль все числа от 1 до 10
    public static void task1() {
        System.out.println("Homework 1. Task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    // Homework 1. Task 2
    // С помощью цикла for выведите в консоль все числа от 10 до 1
    public static void task2() {
        System.out.println("Homework 1. Task 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    // Homework 1. Task 3
    // Выведите в консоль все четные числа от 0 до 17
    public static void task3() {
        System.out.println("Homework 1. Task 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
    }

    // Homework 1. Task 4
    // Выведите в консоль все числа от 10 до - 10 от бОльшего числа к меньшему
    public static void task4() {
        System.out.println("Homework 1. Task 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    // Homework 2. Task 1
    // Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096.
    // В консоль результат должен выводиться в формате "… год является високосным"
    public static void task21() {
        System.out.println("Homework 2. Task 2.1");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
    }

    // Homework 2. Task 2
    // Напишите программу, которая выводит в консоль последовательность цифр:
    // 7 14 21 28 35 42 49 56 63 70 77 84 91 98
    public static void task22() {
        System.out.println("Homework 2. Task 2.2");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Homework 2. Task 3
    // Напишите программу, которая выводит в консоль последовательность цифр:
    // 1 2 4 8 16 32 64 128 256 512
    public static void task23() {
        System.out.println("Homework 2. Task 2.3");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Homework 3. Task 1
    // Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете
    // откладывать по 29 000 рублей "в банку". Выведите сумму накоплений за каждый месяц
    // в консоль в формате "Месяц … , сумма накоплений равна … рублей"
    public static void task31() {
        System.out.println("Homework 3. Task 3.1");
        int contribution = 29000;
        int total = 0;

        for (int i = 1; i <= 12; i++) {
            total = total + contribution;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    // Homework 3. Task 2
    // Перепишите решение задачи выше при условии, что деньги вы откладывать будете не "в банку",
    // а в банк под проценты – 12% годовых. Выведите сумму накоплений за каждый месяц в консоль
    // в формате "Месяц … , сумма накоплений равна … рублей"
    public static void task32a() {
        System.out.println("Homework 3. Task 3.2a");
        int contribution = 29000;
        int total = 0;

        for (int i = 1; i <= 12; i++) {
            total = total + contribution;
            total = total + total / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task32b() {
        System.out.println("Homework 3. Task 3.2b"); // второй варинат решения
        int contribution = 29000;
        double percent = 0.12;
        double sumWithPercent = 0;

        for (int i = 1; i <= 12; i++) {
            sumWithPercent = (sumWithPercent + contribution) * (1 + percent / 12);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumWithPercent + " рублей");
        }
    }
}