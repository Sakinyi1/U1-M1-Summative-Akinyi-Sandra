import java.util.Scanner;

public class ArrayFun5Words {
    public static void main(String[] args) {
        String inputArray[] = new String[5];
        for (int i=0; i<5; i++) {
            System.out.println("Please type a String: ");
            Scanner scanner = new Scanner(System.in);
            String word = scanner.nextLine();
            inputArray[i] = word;
        }
        for (int i=0; i< 5; i++) {
            System.out.println(inputArray[i]);
        }
    }
}