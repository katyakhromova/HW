package src;

import static java.lang.Integer.sum;

public class Main {

    public static void main(String[] args) {
        sumDouble(3, 5);
    }

    private static void sumDouble() {
        System.out.println("sumDouble ");
    }

    public static int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b) {
            sum = sum * 2;
        }
        System.out.println("sumDouble = " + (a + b)*2);
        return sum;
    }
}

