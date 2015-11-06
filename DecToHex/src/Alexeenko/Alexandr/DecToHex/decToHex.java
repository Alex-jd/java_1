package Alexeenko.Alexandr.DecToHex;

/**
 * Created by Alex_JD on 05.11.2015.
 */
public class decToHex {
    long number;
    String hex;

    decToHex () {

    }

    decToHex(long number) {
        this.number = number;
    }

    public String decToHex (long  number) {
        int modNumber;
        String temp_hex;
        getHexByDec getHex = new getHexByDec();

        while (number != 0) {
            modNumber = (int) (number % 16);
            //System.out.print("dec " + modNumber + "\n");
            temp_hex = getHex.hex(modNumber);
            if (hex == null) {
                hex = temp_hex;
            } else {
                hex = temp_hex + hex;
            }
            //System.out.print("hex " + temp_hex + "\n");

            number = number / 16;
        }
        return hex;
    }



}
