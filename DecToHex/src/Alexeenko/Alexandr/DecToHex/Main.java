package Alexeenko.Alexandr.DecToHex;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	// write your code here
        String test_hex;

        String str = "Please,enter the decimal number : ";
        System.out.print(str);
        //Берем из консоли введенное значение
        Scanner input = new Scanner(System.in);
        String input_number = input.nextLine();


        decToHex convert1 = new decToHex();

        test_hex = convert1.decToHex(Integer.parseInt(input_number));
        System.out.print(test_hex);


    }
}
