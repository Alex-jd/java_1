package Alexeenko.Alexandr.BattleShipv1_1;

public class Main {

    public static void main(String[] args) {
	// write your code here


        ShipXY shipDataBase = new ShipXY();

        Ship Ship1 = new Ship();
        Ship1.createShip(2, 1, 2, "horiz", shipDataBase);
        Ship1.createShip(0, 8, 3, "horiz", shipDataBase);
        Ship1.createShip(2, 3, 3, "vert", shipDataBase);
        Ship1.createShip(7, 3, 3, "horiz", shipDataBase);
        //Ship1.createShip(3, 7, 4, "horiz", shipDataBase);
        Ship1.createShip(5, 6, 4, "vert", shipDataBase);

        //ShipXY test = new ShipXY();
        /*for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(shipDataBase.shipArray[j][i]);
            }
            System.out.print("\n");
        }*/

        Water sea = new Water();
        sea.waterField(9, 9, shipDataBase);
    }
}
