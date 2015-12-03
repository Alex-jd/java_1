package Alexeenko.Alexandr;

import java.util.*;
import java.util.List;

/**
 * Created by Alex_JD on 27.11.2015.
 */
public class Link_ship {

    List<String> link = new LinkedList<String>();
    String Y;
    int X;
    String direction;
    int life;
    String[] alf = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

    Link_ship() {

    }

    Link_ship(String Y, int X, String direction) {
        this.Y = Y;
        this.X = X;
        this.direction = direction;

    }

    public void ship (String Y, int X, String direction, int life) {
        if (direction == "h") {
            int j = 0;
            for (int i = X; i < (life + X); i++) {
                String temp = Y + " " + i;
                link.add(temp);
                //System.out.print(link.get(j) + "\n");
                j++;
            }
        } else {
            for (int i = 0; i <= 9; i++) {
                if (Y == alf[i]) {
                    for (int j = 0; j <= life; j++) {
                        String temp = alf[i] + " " + X;
                        link.add(temp);
                        //System.out.print(link.get(j) + "\n");
                        i++;
                    }
                    break;

                }

            }

        }
    }



}
