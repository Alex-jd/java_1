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
        //Приглашение
        System.out.print("Welcome to \"Battle Ship\" \n");

        //Просим игрока ввести свое имя, выводя на консоль
        String str = "Please,enter your name : ";
        System.out.print(str);
        //Берем из консоли введенное значение
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();

        //Просим игрока ввести свой ник
        System.out.print("Please, enter your nikname : ");
        //Берем из консоли введенный ник
        Scanner input2 = new Scanner(System.in);
        String nikName = input2.nextLine();

        //Создаем объект класса User с именем player
        User player = new User(userName, nikName);
        //Вызываем строку с информацией о игроке и выводим ее на консоль
        System.out.print(player.getInfo());

        //Создаем объект класса Ship с именем small_ship1
        //Сообщаем конструктору типа корбаля и его координаты
        Ship small_ship1 = new Ship("small", 10, 10);
        //Выводим строку с информацией, что создан корабль определенного типа
        System.out.print(small_ship1.messegeOut());
        //Создаем объект класса Ship с именем small_ship2
        //Сообщаем конструктору типа корбаля и его координаты
        Ship small_ship2 = new Ship("small", 12, 5);
        //Выводим строку с информацией, что создан корабль определенного типа
        System.out.print(small_ship2.messegeOut());

        //Создаем объект класса Ship с именем medium_ship1
        //Сообщаем конструктору типа корбаля и его координаты
        Ship medium_ship1 = new Ship("medium", 1,1);
        //Выводим строку с информацией, что создан корабль определенного типа
        System.out.print(medium_ship1.messegeOut());

        //Создаем объект класса Ship с именем big_ship1
        //Сообщаем конструктору типа корбаля и его координаты
        Ship big_ship1 = new Ship("big", 3,4);
        //Выводим строку с информацией, что создан корабль определенного типа
        System.out.print(big_ship1.messegeOut());
        //Создаем объект класса Ship с именем big_ship2
        //Сообщаем конструктору типа корбаля и его координаты
        Ship big_ship2 = new Ship("big", 34,13);
        //Выводим строку с информацией, что создан корабль определенного типа
        System.out.print(big_ship2.messegeOut());

    }

}
