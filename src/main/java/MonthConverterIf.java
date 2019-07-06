import java.util.Scanner;

public class MonthConverterIf {
    public static void main(String [] args) {
        System.out.println("Type a number between 1 and 12");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num == 1) {
            System.out.println("1 is January");
        } else if (num == 2) {
            System.out.println("2 is February");
        } else if (num == 3) {
            System.out.println("3 is March");
        }else if (num == 4) {
            System.out.println("4 is April");
        }else if (num == 5) {
            System.out.println("5 is May");
        }else if (num == 6) {
            System.out.println("6 is June");
        }else if (num == 7) {
            System.out.println("7 is July");
        }else if (num == 8) {
            System.out.println("8 is August");
        }else if (num == 9) {
            System.out.println("9 is September");
        }else if (num == 10) {
            System.out.println("10 is October");
        }else if (num == 11) {
            System.out.println("11 is November");
        }else if (num == 12) {
            System.out.println("12 is December");

        }else {
            System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye");
        }

    }
}


