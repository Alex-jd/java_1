package Alexeenko.Alexandr.intToIp;

/**
 * Created by Alex_JD on 04.11.2015.
 */
public class IpToInt {
    long number;
    String Ip;

    IpToInt (String Ip){
        this.Ip = Ip;
    }

    public long aton(String Ip) {
        Oct ipPart = new Oct(Ip);
        ipPart.splitIp(Ip);
        //System.out.print(Ip);
        //System.out.print((ipPart.ip1 * 256 * 256 * 256) + "\n");
        return number = (ipPart.ip1 * (256 * 256 * 256)) + (ipPart.ip2 * (256 * 256)) +
                (ipPart.ip3 * 256) + ipPart.ip4;
        //System.out.print(number);

    }
}
