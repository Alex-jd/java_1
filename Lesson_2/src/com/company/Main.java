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
        //������ ������������ ������ ���� ���, ������ �� �������
        String str = "Enter your name : ";
        System.out.print(str);
        //����� �� ������� ��������� ��������
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();

        //������ �������������� ������ ���� �������
        System.out.print("Enter your age : ");
        //����� �� ������� ��������� �������
        Scanner input2 = new Scanner(System.in);
        int age = input2.nextInt();

        //������� ������ ������ User � ������ teacher
        User teacher = new User(userName, age);

        //�������� ������ � ����������� � ������������ � ������� �� �� �������
        System.out.print(teacher.getInfo());
        // write your code here
    }
}
