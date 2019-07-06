import java.util.Scanner;

public class SomeMath {
    public static void main(String[] args) {
        int num1 = total5(1, 2, 3, 4, 5);
        double num2 = average5(1, 3, 5, 7, 9);
        double num3 = largest5(42.0, 35.1, 2.3, 40.2, 15.6);

        System.out.println(total5);
        System.out.println(average);
        System.out.println(largest);

    }

    public static int total5(int a, int b, int c, int d, int e) {
        int sum = a + b + c + d + e;
        return (a + b + c + d + e);
    }

    public static double average5(int a, int b, int c, int d, int e) {
        double average = ((a + b + c + d + e)/5);
        return (average);
    }

    public static double largest5(double a, double b, double c, double d, double e) {
        double inputArray[] = new double[]{a, b, c, d, e};
        double max = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > max) {
                max = inputArray[i];
            }
        }
        return max;
    }
}