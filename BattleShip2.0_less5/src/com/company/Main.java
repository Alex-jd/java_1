package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ShipSmall small = new ShipSmall();

        int[][] smallArray = small.createShip(10, 545, "v");

        for (int i = 0; i <= (smallArray.length - 1); i++) {
            for (int ii = 0; ii <= (smallArray[i].length - 1); ii++) {
                System.out.print(smallArray[i][ii] + " ");
            }
            System.out.print("\n");
        }
    }
}
