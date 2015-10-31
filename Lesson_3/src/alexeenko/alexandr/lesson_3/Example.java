package alexeenko.alexandr.lesson_3;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Alex_JD on 31.10.2015.
 */
public class Example {
    private static final boolean CONDITION = true;
    private boolean condition2;
    private boolean condition3;
    private boolean condition4;
    private String condition5;
    private String condition6;

    Example (boolean condition, boolean condition2, boolean condition3, int condtion4,
             String condition5, String condition6) {
        this.condition = condition;
        this.condition2 = condition2;
        this.condition3 = condition3;
        this.condition4 = condition4;
        this.condition5 = condition5;
        this.condition6 = condition6;
    }

    Example () {
        this.condition = false;
        this.condition2 = false;
        this.condition3 = condition3;
        this.condition4 = 0;
        this.condition5 = condition5;
        this.condition6 = condition6;
    }

    public int methodIf() {
        int param = 0;

        if( (CONDITION == true || this.condition2 == false) && this.condition3 == true & this.condition4 <= 5) {
            param++;
        } else {
            param--;
        }

        if( (this.condition == true || this.condition2 == false) && this.condition3 == true & this.condition4 <= 5) {
            param++;
        } else if (this.condition5.equals(this.condition6)){
            param--;
        }

        switch (this.condition4 + 1) {
            case 4:
                param += 5;
                break;
            case 5:
                param -= 5;
                break;
            case 6:
                param += 9;
                break;
            default:
                param = 0;
                break;
        }



        return 0;
    }

    public static int methodIf(boolean condition,boolean condition2,
                               boolean condition3,int condition4,
                               String condition5, String condition6) {
        int param = 0;

        if( (condition == true || condition2 == false) && condition3 == true & condition4 <= 5) {
            param++;
        } else {
            param--;
        }

        if( (condition == true || condition2 == false) && condition3 == true & condition4 <= 5) {
            param++;
        } else if (condition5.equals(condition6)){
            param--;
        }

        switch (condition4 + 1) {
            case 4:
                param += 5;
                break;
            case 5:
                param -= 5;
                break;
            case 6:
                param += 9;
                break;
            default:
                param = 0;
                break;
        }



        return 0;
    }

    public static int methodIf(int condition4, int param) {
        CONDITION
        switch (condition4 + 1) {
            case 4:
                param += 5;
                break;
            case 5:
                param -= 5;
                break;
            case 6:
                param += 9;
                break;
            default:
                param = 0;
                break;
        }
        return 0;
    }

    public static void methodCycleSimple() {
        for (int i = 1; i < 10; i++) {
            //System.out.print(i);
            nalog = 10;
            nalog2 = nalog + 11;
        }

        int j = 20;
        while (j > 10 && j < 25){
            //System.out.print(j + " ");
            //j--;
            break;//чтобы не было зацкливани€, пример...
        }
        //20 19 18 17 16 15 14 13 12 11


        //≈сли нужно, чтобы блок выплонилс€ хот€ бы один раз
        do {
            System.out.print(j + " ");
            j--;
        } while (j < 10);
        return;


    }

    public static void ternar (int param, int condition4) {
        if(param == 0) {
            param = 1;
        }
        else {
            param = 2;
        }

        param = param == 0 ? 1 : 2; //тернальна€ операци€, как в —++

        int nalog = (condition4 == 5 ? 809809 : 7595121) +(param == 0 ? 1 : 2);
        int nalog2 = (condition4 == 5 ? (param == 0 ? 1 : 2) + 1 : 56 );
    }

    public static void methodCycleIput(boolean condition) {
        //пример с вводом строк.
        String  input = "";
        do {
            Scanner scan = new Scanner(System.in);
            input = scan.nextLine();
        }
        while (input.equals("a") == false);

        //ћы даже не попадем в цикл.
        while (input.equals("a") == false){
            Scanner scan = new Scanner(System.in);
            input = scan.nextLine();
        }

        while (true) {
            System.out.print("Forever\n");
            if (condition == true) {
                break;
            }
        }

        for (int k = 0; k < 10; k++) {
            if (k == 5)
                continue;//позволил пропустить данную иттерацию. ¬се что дальше continue не исполн€етс€
            System.out.print(k);
        }
        //012346789
    }

    public static void methodMatrix() {
        //«аполнение матрицы
        int [][] arr = new int [4][4];
        for (int a = 0; a < 4; a++) {
            for(int b = 0; b < 4; b++) {
                Random rand = new Random();
                arr[a][b] = rand.nextInt(5);
            }
        }
        //вывод матрицы
        for (int a = 0; a < 4; a++) {
            for(int b = 0; b < 4; b++) {
                System.out.print(arr[a][b] + " ");
            }
            System.out.print("\n");
        }

        //вывод только верхней половины матрицы по диагонали
        for (int a = 0; a < 4; a++) {
            for(int b = 0; b < 4; b++) {
                if (b <= a)
                    continue;
                System.out.print(arr[a][b] + " ");
            }
            System.out.print("\n");
        }
    }

}
