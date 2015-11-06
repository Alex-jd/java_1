package Alexeenko.Alexandr.bubbleSort;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int str;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов одномерного массива: ");
        str = in.nextInt();
        //String[] test_hex[str];

        int[] unsortArray = new int [str];
        for (int i = 0; i < unsortArray.length; i++) {
            System.out.print("Введите элемент массива типа int [" + i + "]:");
            unsortArray[i] = in.nextInt();
        }

        /*for (int i = 0; i < unsortArray.length; i++) {
            System.out.print(unsortArray[i] + "\n");
        }
        */


        BubbleSort sort = new BubbleSort();
        sort.rightArray(unsortArray);

        for ( int i = 0; i < unsortArray.length; i++) {
            System.out.print(unsortArray[i] + "\n");
        }



        /*String str = "Please,enter the array : ";
        System.out.print(str);
        //Берем из консоли введенное значение
        Scanner input = new Scanner(System.in);
        String input_number = input.nextLine();
        */





    }
}
