package Alexeenko.Alexandr.BattleShipv1_1;

/**
 * Created by Alex_JD on 06.11.2015.
 */
public class Ship {
    int x, y, length;
    String direction;

    Ship () {

    }

    Ship (int x, int y, int length, String direction, ShipXY ob) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.direction = direction;
    }

    public void createShip (int x, int y, int length, String direction, ShipXY ob) {
        if (direction == "horiz" || direction == null) {
            for (int i = x; i < (x + length); i++) {
                ob.setShipArray(i, y);
                //System.out.print("Ship x and y " + i + " " + y);
            }
        } else {
            for ( int i = y; i < (y + length); i++) {
                ob.setShipArray(x, i);
                //System.out.print("Ship x and y " + x + " " + i);
            }
        }
    }
}
