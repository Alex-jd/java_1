package Alexeenko.Alexandr.BattleShipv1_1;

/**
 * Created by Alex_JD on 06.11.2015.
 */
public class ShipXY {
    int i;
    int j;
    int[][] shipArray = new int[10][10];

    ShipXY () {

    }

    ShipXY (int i, int j) {
        this.i = i;
        this.j = j;
    }

    public void setShipArray (int i, int j) {
        shipArray [i][j] = 1;
    }
}
