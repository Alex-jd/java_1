package Alexeenko.Alexandr.bubbleSort;

/**
 * Created by alex_jd on 06.11.15.
 */
public class BubbleSort {
    public int [] userArray;

    BubbleSort () {

    }

    BubbleSort (int [] userArray) {
        this.userArray = userArray;
    }

    public int [] rightArray (int [] userArray) {
        int temp;
        for ( int i = 0; i <  userArray.length - 1; i++ ) {
            for ( int j = 0; j < userArray.length - i - 1; j++) {

                if (userArray[j] > userArray[j + 1]) {

                    temp = userArray[j];

                    userArray[j] = userArray[j + 1];

                    userArray[j + 1] = temp;

                }
            }
        }
        return userArray;
    }

}
