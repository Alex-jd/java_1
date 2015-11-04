package Alexeenko.Alexandr.intToIp;

/**
 * Created by Alex_JD on 04.11.2015.
 */
public class IntToIp {
    long number;
    String Ip;

    IntToIp (long number) {
        this.number = number;
    }

    public String ntoa (long number) {
        long temp;
        for (int i = 1; i <= 4; i++ ) {
            temp = number % 256;
            if (Ip == null) {
                Ip = temp + "";
            } else {
                Ip = temp + "." + Ip;
            }

            number = number/256;

        }
        return Ip;
    }
}
