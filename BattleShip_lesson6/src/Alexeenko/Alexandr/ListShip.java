package Alexeenko.Alexandr;

import java.util.*;
/**
 * Created by Alex_JD on 28.11.2015.
 */
public class ListShip {
    List<String> linkShip;
    List listLocal = new ArrayList();

    ListShip () {

    }

    ListShip (List<String> linkShip) {
        this.linkShip = linkShip;
    }

    public void listOfShip (List<String> linkShip) {
        listLocal.add(linkShip);
    }


}
