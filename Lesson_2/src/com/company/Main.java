package com.company;

import java.util.Scanner;

public class Main {

    public static class User {
        private String name;
        private int age;
        private static final String RACE = "HUNAM";

        User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getInfo() {
            String info = "User name: " + name + "\nUser age: " + age;
            return info;
        }
    }

    public static void main(String[] args) {
        int a = 0;
        long b = 561;
        double d = 45.5;
        char ch = 'a';
        //Просим пользователя ввести свое имя, выводя на консоль
        String str = "Enter your name : ";
        System.out.print(str);
        //Берем из консоли введенное значение
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();

        //Просим пользователями ввести свой возраст
        System.out.print("Enter your age : ");
        //Берем из консоли введенный возраст
        Scanner input2 = new Scanner(System.in);
        int age = input2.nextInt();

        //Создаем объект класса User с именем teacher
        User teacher = new User(userName, age);

        //Вызываем строку с информацией о пользователе и выводим ее на консоль
        System.out.print(teacher.getInfo());
        // write your code here
    }
}
