package alexeenko.alexandr.battleShip;

import java.util.Scanner;

public class Main {

    public static final int SMALL = 2;
    public static final int MEDIUM = 1;
    public static final int BIG = 2;

    public static class User {
        private String name;
        private String nikname;


        User(String name, String nikname) {
            this.name = name;
            this.nikname = nikname;
        }

        public String getInfo() {
            String info = "User name: " + name + "\nUser nikname: " + nikname + "\n";
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

        public String messegeOut() {
            String messege = "Create a " + type + " ship\n";
            return messege;
        }

    }

    public static void main(String[] args) {
	// write your code here
        //�����������
        System.out.print("Welcome to \"Battle Ship\" \n");

        //������ ������ ������ ���� ���, ������ �� �������
        String str = "Please,enter your name : ";
        System.out.print(str);
        //����� �� ������� ��������� ��������
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();

        //������ ������ ������ ���� ���
        System.out.print("Please, enter your nikname : ");
        //����� �� ������� ��������� ���
        Scanner input2 = new Scanner(System.in);
        String nikName = input2.nextLine();

        //������� ������ ������ User � ������ player
        User player = new User(userName, nikName);
        //�������� ������ � ����������� � ������ � ������� �� �� �������
        System.out.print(player.getInfo());

        //������� ������ ������ Ship � ������ small_ship1
        //�������� ������������ ���� ������� � ��� ����������
        Ship small_ship1 = new Ship("small", 10, 10);
        //������� ������ � �����������, ��� ������ ������� ������������� ����
        System.out.print(small_ship1.messegeOut());
        //������� ������ ������ Ship � ������ small_ship2
        //�������� ������������ ���� ������� � ��� ����������
        Ship small_ship2 = new Ship("small", 12, 5);
        //������� ������ � �����������, ��� ������ ������� ������������� ����
        System.out.print(small_ship2.messegeOut());

        //������� ������ ������ Ship � ������ medium_ship1
        //�������� ������������ ���� ������� � ��� ����������
        Ship medium_ship1 = new Ship("medium", 1,1);
        //������� ������ � �����������, ��� ������ ������� ������������� ����
        System.out.print(medium_ship1.messegeOut());

        //������� ������ ������ Ship � ������ big_ship1
        //�������� ������������ ���� ������� � ��� ����������
        Ship big_ship1 = new Ship("big", 3,4);
        //������� ������ � �����������, ��� ������ ������� ������������� ����
        System.out.print(big_ship1.messegeOut());
        //������� ������ ������ Ship � ������ big_ship2
        //�������� ������������ ���� ������� � ��� ����������
        Ship big_ship2 = new Ship("big", 34,13);
        //������� ������ � �����������, ��� ������ ������� ������������� ����
        System.out.print(big_ship2.messegeOut());

    }

}
