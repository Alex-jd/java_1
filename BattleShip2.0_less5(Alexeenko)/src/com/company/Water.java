package com.company;

/**
 * Created by Alex_JD on 21.11.2015.
 */
public class Water {
    int x, y;
    int[][] waterArray = new int[10][10];

    Water () {


    }

    Water (int x, int y) {
        this.x = x;
        this.y = y;
    }


    Water (int x, int y, Water ob) {
        this.x = x;
        this.y = y;
    }

    Water (int[][] array) {

    }

    public void waterField ( int[][] array) {



        for (int i = 0; i <= (waterArray.length - 1); i++) {

            for (int j = 0; j <= (waterArray[i].length - 1); j++) {

                for (int ii = 0; ii <= (array.length -1 ); ii++ ) {
                       if ( j == array[ii][0] && i == array[ii][1]) {
                                     waterArray[j][i] = 1;

                       }

                }
            }

        }
    }
}