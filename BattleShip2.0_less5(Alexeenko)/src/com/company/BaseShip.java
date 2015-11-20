package com.company;

/**
 * Created by alex_jd on 20.11.15.
 */
public abstract class BaseShip {
    int x, y;
    String direction;
    public static String p = "X";

    BaseShip () {

    }

    BaseShip (int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;

    }

    public void showShip () {
        System.out.print("X");

    }
}
