package com.company;
/* „естно говор€, абсолютна€ фигн€, а не код.
ѕо сути повторение предыдущего решени€, только по другому...
„ерез создание массивов кораблей, куда занесены их координаты
 */

public class Main {

    public static void main(String[] args) {
	// write your code here

        Ship small = new Ship();
        ShipBig big = new ShipBig();
        ShipMedium medium = new ShipMedium();

        // —оздаем массивы кораблей, где указываем начальные координаты и положение
        // v - вертикальное, h - горизонтальное
        int[][] smallArray = small.createShip(5, 5, "v");
        int[][] mediumArray = medium.createShip(2, 1, "h");
        int[][] bigArray = big.createShip(2, 8, "h");



        Water sea = new Water();
        //ѕередаем массивы кораблй методу класса Water.
        // “аким образом создаем массив waterArray с учетом координат кораблей.
        sea.waterField(smallArray);
        sea.waterField(mediumArray);
        sea.waterField(bigArray);


        //¬ыводим воду и корабли......, то есть выводим массив waterArray
        //ќтрисовка координатной оси X
        for (int i = 0; i <= 9; i++) {
            //ѕодгон€ем дл€ удобного воспри€ти€
            if (i == 0) {
                //¬ыводим 2 пробела перед 0
                System.out.print("  " + i);
            } else {
                System.out.print(" " + i);
            }
        }
        System.out.print("\n");


        for (int i = 0; i <= (10 - 1); i++) {
            //ќтрисовка координатной оси Y
            System.out.print(i + " ");
            for (int ii = 0; ii <= (10 - 1); ii++) {
                if (sea.waterArray[ii][i] == 0) {
                    System.out.print("~ ");
                } else {
                    System.out.print("X ");
                }

            }
            System.out.print("\n");
        }
    }





}
