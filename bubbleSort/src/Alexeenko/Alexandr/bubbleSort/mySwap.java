package Alexeenko.Alexandr.bubbleSort;

/**
 * Created by alex_jd on 06.11.15.
 */
public class mySwap {
    double first;
    double second;
    double temp;

    mySwap () {

    }

    mySwap (int first, int second) {
        this.first = first;
        this.second = second;
    }

    mySwap (double first, double second) {
        this.first = first;
        this.second = second;
    }

    public void swap (double first, double second) {
        temp = first;
        first = second;
        second = temp;

    }

}
