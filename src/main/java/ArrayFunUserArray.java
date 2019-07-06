import java.util.Scanner;

public class ArrayFunUserArray {
    public static void main(String[] args) {
        int inputArray[] = new int[5];
        for (int i=0; i<5; i++) {
            System.out.println("Please type an integer: ");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            inputArray[i] = num;
        }
        for (int i=0; i<5; i++) {
            System.out.println(inputArray[i]);
        }
    }
}
