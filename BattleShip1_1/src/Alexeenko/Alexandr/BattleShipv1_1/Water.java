package Alexeenko.Alexandr.BattleShipv1_1;

/**
 * Created by alex_jd on 06.11.15.
 */
public class Water {
    int x, y;

    Water () {

    }

    Water (int x, int y) {
        this.x = x;
        this.y = y;
    }


    Water (int x, int y, ShipXY ob) {
        this.x = x;
        this.y = y;
    }

    public  void waterField (int x, int y, ShipXY ob) {
        //Отрисовка координатной оси X
        for (int i = 0; i <= y; i++) {
            //Подгоняем для удобного восприятия
            if (i == 0) {
                //Выводим 2 пробела перед 0
                System.out.print("  " + i);
            } else {
                System.out.print(" " + i);
            }
        }
        System.out.print("\n");
        for (int i = 0; i <= x; i++) {
            //Отрисовка координатной оси Y
            System.out.print(i + " ");
            for (int j = 0; j <= x; j++) {
                //Сверка с "базой данных" кораблей
                if (ob.shipArray[j][i] == 0) {
                    System.out.print("~ ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.print("\n");
        }
    }
}
