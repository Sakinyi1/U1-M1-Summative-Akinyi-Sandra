import java.util.Scanner;

public class ArrayFunReverseIt {
    public static void main(String[] args) {
        int inputArray[] = new int[]{1, 2, 3, 4, 5};
        int reverseArray[] = new int[5];
        for (int i=0; i< inputArray.length; i++) {
            reverseArray[4-i] = inputArray[i];
        }
        for (int i=0; i< inputArray.length; i++) {
            System.out.println(inputArray[i]);
            System.out.println(reverseArray[i]);
        }
    }
}
