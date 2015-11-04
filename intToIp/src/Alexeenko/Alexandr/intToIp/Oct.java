package Alexeenko.Alexandr.intToIp;

/**
 * Created by Alex_JD on 04.11.2015.
 */
public class Oct {
    String Ip;
    long ip1;
    long ip2;
    long ip3;
    long ip4;

    Oct(String Ip) {
        this.Ip = Ip;
    }

    public void splitIp (String Ip) {
        String[] parts = Ip.split("\\.");
        ip1 = Long.parseLong(parts[0]);
        ip2 = Long.parseLong(parts[1]);
        ip3 = Long.parseLong(parts[2]);
        ip4 = Long.parseLong(parts[3]);
    }
}
