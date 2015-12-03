package com.company;
/* ������ ������, ���������� �����, � �� ���.
�� ���� ���������� ����������� �������, ������ �� �������...
����� �������� �������� ��������, ���� �������� �� ����������
 */

public class Main {

    public static void main(String[] args) {
	// write your code here

        Ship small = new Ship();
        ShipBig big = new ShipBig();
        ShipMedium medium = new ShipMedium();

        // ������� ������� ��������, ��� ��������� ��������� ���������� � ���������
        // v - ������������, h - ��������������
        int[][] smallArray = small.createShip(5, 5, "v");
        int[][] mediumArray = medium.createShip(2, 1, "h");
        int[][] bigArray = big.createShip(2, 8, "h");



        Water sea = new Water();
        //�������� ������� ������� ������ ������ Water.
        // ����� ������� ������� ������ waterArray � ������ ��������� ��������.
        sea.waterField(smallArray);
        sea.waterField(mediumArray);
        sea.waterField(bigArray);


        //������� ���� � �������......, �� ���� ������� ������ waterArray
        //��������� ������������ ��� X
        for (int i = 0; i <= 9; i++) {
            //��������� ��� �������� ����������
            if (i == 0) {
                //������� 2 ������� ����� 0
                System.out.print("  " + i);
            } else {
                System.out.print(" " + i);
            }
        }
        System.out.print("\n");


        for (int i = 0; i <= (10 - 1); i++) {
            //��������� ������������ ��� Y
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
