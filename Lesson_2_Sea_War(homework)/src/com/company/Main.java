package com.company;

import java.util.Scanner;

public class Main {

    public static final int SMALL = 7;
    public static final int MEDIUM = 5;
    public static final int BIG = 3;

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
        private int x;
        private int y;

        Ship(String _type, int _x, int _y){
            this.type = _type;
            this.x = _x;
            this.y = _y;
        }
    }



    public static void main(String[] args) {
	// write your code here
        //�����������
        System.out.print("Welcome to \"Battle Ship\" \n");

        //������ ������������ ������ ���� ���, ������ �� �������
        String str = "Please,enter your name : ";
        System.out.print(str);
        //����� �� ������� ��������� ��������
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();

        //������ �������������� ������ ���� �������
        System.out.print("Please, enter your nikname : ");
        //����� �� ������� ��������� �������
        Scanner input2 = new Scanner(System.in);
        String nikName = input2.nextLine();

        //������� ������ ������ User � ������ teacher
        User teacher = new User(userName, nikName);

        Ship sh_small = new Ship("small", 10, 10);


        //�������� ������ � ����������� � ������������ � ������� �� �� �������
        System.out.print(teacher.getInfo());
        // write your code here
    }

}