package Alexeenko.Alexandr;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Link_ship small_1 = new Link_ship();
        Link_ship big_1 = new Link_ship();
        Link_ship medium_1 = new Link_ship();
        ListShip lShip = new ListShip();

        small_1.ship("C", 6, "v", 2);
        big_1.ship("B", 3, "v", 4);
        medium_1.ship("D", 6, "h", 3);
        //System.out.print(small_1.link);


        lShip.listOfShip(small_1.link);
        lShip.listOfShip(big_1.link);
        lShip.listOfShip(medium_1.link);

        System.out.print(lShip.listLocal + "\n");
        System.out.print(lShip.listLocal.get(1));
        for (String s: lShip.listLocal) {
            System.out.print(s.indexOf("C 3"));
        }



    }
}
