package Alexeenko.Alexandr.bubbleSort;

/**
 * Created by alex_jd on 06.11.15.
 */
public class bubbleSort {
    public String [] userArray;

    bubbleSort () {

    }

    bubbleSort (String [] userArray) {
        this.userArray = userArray;
    }

    public String [] rightArray (String [] userArray) {
        String temp;
        for ( int i = 0; i <  userArray.length - 1; i++ ) {
            for ( int j = 0; j < userArray.length - i - 1; j++) {
                System.out.print("method " + userArray[j] + " j = " + j + "\n");
                if (Double.parseDouble(userArray[j]) > Double.parseDouble(userArray[j + 1])) {
                    System.out.print("befor sort j " + userArray[j] + "\n");
                    System.out.print("befor sort j+1 " + userArray[j + 1] + "\n");
                    temp = userArray[j];
                    System.out.print("temp " + temp + "\n");
                    //System.out.print("temp " + userArray[j] + "\n");
                    userArray[j] = userArray[j + 1];
                    System.out.print("after sort array[j] " + userArray[j] + "\n");
                    userArray[j + 1] = temp;
                    System.out.print("after sort array[j+1] " + userArray[j + 1] + "\n");
                }
            }
        }
        return userArray;
    }

}
