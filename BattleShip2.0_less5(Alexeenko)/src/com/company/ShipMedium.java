package com.company;

/**
 * Created by Alex_JD on 21.11.2015.
 */
public class ShipMedium extends BaseShip {
    static int lenght = 4;

    ShipMedium () {

    }

    ShipMedium (int x, int y, String direction) {
        super (x, y, direction);

    }

    public int[][] createShip (int x, int y, String direction) {
        int[][] smallArr = new int[lenght][2];
        int temp;

        if (direction == "h") {
            for (int i = 0; i <= (lenght-1) ; i++) {
                temp = x;
                for (int ii = 0; ii <= (2 - 1); ii++){
                    if (ii == 1) {
                        temp = y;
                    }
                    smallArr[i][ii] = temp;
                }
                x++;
            }
        } else {
            for (int i = 0; i <= (lenght-1) ; i++) {
                temp = y;
                for (int ii = (2 - 1); ii >= 0; ii--) {
                    if (ii == 0) {
                        temp = x;
                    }
                    smallArr[i][ii] = temp;
                }
                y++;
            }
        }

        return smallArr;
    }

}

