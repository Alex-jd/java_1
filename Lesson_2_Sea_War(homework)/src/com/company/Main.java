package com.company;

import java.util.Scanner;

public class Main {

    public static final int small = 7;
    public static final int medium = 5;
    public static final int big = 3;

    public static class User {
        private String name;
        private String nikname;
        

        User(String name, String nikname) {
            this.name = name;
            this.nikname = nikname;
        }

        public String getInfo() {
            String info = "User name: " + name + "\nUser nikname: " + nikname;
            return info;
        }
    }

    public static class Ship {
        private String type;
        private int x
    }

    public static void main(String[] args) {
	// write your code here
        //Приглашение
        System.out.print("Welcome to \"Battle Ship\" \n");

        //Просим пользователя ввести свое имя, выводя на консоль
        String str = "Please,enter your name : ";
        System.out.print(str);
        //Берем из консоли введенное значение
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();

        //Просим пользователями ввести свой возраст
        System.out.print("Please, enter your nikname : ");
        //Берем из консоли введенный возраст
        Scanner input2 = new Scanner(System.in);
        String nikName = input2.nextLine();

        //Создаем объект класса User с именем teacher
        User teacher = new User(userName, nikName);

        //Вызываем строку с информацией о пользователе и выводим ее на консоль
        System.out.print(teacher.getInfo());
        // write your code here
    }

}
