package Alexeenko.Alexandr.intToIp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str = "Enter the Ip number (integer Ip) : ";
        System.out.print(str);

        Scanner input = new Scanner(System.in);
        String IP_addr = input.nextLine();


        //String Ip = IP_addr;
        //IpToInt numIp = new IpToInt(Ip);
        //System.out.print(numIp.aton(Ip) + "\n");

        //IntToIp IP = new IntToIp(numIp.aton(Ip));
        //System.out.print(IP.ntoa(numIp.aton(Ip)) + "\n");

        Long number = Long.parseLong(IP_addr);
        IntToIp IP = new IntToIp(number);
        System.out.print(IP.ntoa(number) + "\n");

        //IntToIp mask_32 = new IntToIp(-1);
        //System.out.print(mask_32.ntoa(-1) + "\n");
    }
}
