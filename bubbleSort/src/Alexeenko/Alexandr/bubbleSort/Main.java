package Alexeenko.Alexandr.bubbleSort;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] test_hex;

        test_hex = new String [] {"54", "58", "98", "2"};

        for (int i = 0; i < test_hex.length - 1; i++) {
            System.out.print(test_hex[i] + "\n");
        }


        bubbleSort sort = new bubbleSort();
        sort.rightArray(test_hex);

        for ( int i = 0; i < test_hex.length - 1; i++) {
            System.out.print(test_hex[i] + "\n");
        }



        /*String str = "Please,enter the array : ";
        System.out.print(str);
        //Берем из консоли введенное значение
        Scanner input = new Scanner(System.in);
        String input_number = input.nextLine();
        */





    }
}
