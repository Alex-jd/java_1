package Alexeenko.Alexandr.DecToHex;

/**
 * Created by Alex_JD on 06.11.2015.
 */
public class getHexByDec {
    int dec;
    private String[] hex_arr;

    {
        hex_arr = new String[]{"A", "B", "C", "D", "E", "F"};
    }

    getHexByDec() {

    }
    getHexByDec (int dec) {
        this.dec = dec;
    }

    public String hex (int dec) {
        String currentHex;
        switch (dec) {
            case 10:
                currentHex = hex_arr[0];
                break;
            case 11:
                currentHex = hex_arr[1];
                break;
            case 12:
                currentHex = hex_arr[2];
                break;
            case 13:
                currentHex = hex_arr[3];
                break;
            case 14:
                currentHex = hex_arr[4];
                break;
            case 15:
                currentHex = hex_arr[5];
                break;
            default:
                currentHex = Integer.toString(dec);
        }
        return currentHex;
    }
}
