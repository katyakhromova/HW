public class Main {

// This is my Calculator

    public static void main(String[] args) {
        calculatorMethod();
        sumMethod();
        int sum = sum(5, 9);
        minusMethod();
        int substract = subtract(9, 5);
        multiplyMethod();
        int multiply = multiply(15, 3);
        devideMethod();
        int devide = devide(15, 3);

    }
    // Here are the methods

    public static void calculatorMethod() {
        System.out.println("This is a Calculator: ");
    }

    //sumMethod
    public static void sumMethod() {
        System.out.println("Sum");
    }

    public static int sum(int a, int b) {
        int x = a + b;
        System.out.println("Sum = " + (a + b));
        return x;
    }

    //minusMethod
    public static void minusMethod() {
        System.out.println("Minus");
    }

    public static int subtract(int a, int b) {
        int x = a - b;
        System.out.println("Difference = " + (a - b));
        return x;
    }

    //multiplyMethod
    public static void multiplyMethod() {
        System.out.println("Multiply");
    }

    public static int multiply(int a, int b) {
        int x = a * b;
        System.out.println("Multiplication = " + (a * b));
        return x;
    }

    //devideMethod
    public static void devideMethod() {
        System.out.println("Devide");
    }

    public static int devide(int a, int b) {
        int x = a / b;
        System.out.println("Division = " + (a / b));
        return x;
    }

}




