package Alexeenko.Alexandr.BattleShipv1_1;

/**
 * Created by alex_jd on 06.11.15.
 */
public class Water {
    int x, y;

    Water (int x, int y) {
        this.x = x * 2;
        this.y = y * 2;
    }

    public  void waterField () {
        //Отрисовка координатной оси Y
        for (int i = 0; i <= (y / 2); i++) {
            System.out.print(i + "   ");
        }
        System.out.print("\n");
        for (int i = 0; i <= x; i++) {
            //Отрисовка координатной оси X
            System.out.print(i + " ");
            for (int j = y; j != 0; j--) {
                System.out.print(". ");
            }
            System.out.print("\n");
        }
    }
}
