import java.util.Scanner;

public class ValidNumber {
    public static void main(String[] args) {
        System.out.println("Type a number between 1 and 10: ");
        boolean shouldAsk = true;

        while (shouldAsk) {

            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();

            if (num >=1 && num <= 10) {
                shouldAsk = false;
            } else {
                System.out.println("You must enter a number between 1 and 10, please try again.");
            }

        }

    }
}

