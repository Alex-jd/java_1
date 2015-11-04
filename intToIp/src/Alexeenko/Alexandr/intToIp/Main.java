package Alexeenko.Alexandr.intToIp;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String Ip = "192.168.1.1";
        IpToInt numIp = new IpToInt(Ip);

        System.out.print(numIp.aton(Ip) + "\n");


        IntToIp IP = new IntToIp(numIp.aton(Ip));

        System.out.print(IP.ntoa(numIp.aton(Ip)));
    }
}
