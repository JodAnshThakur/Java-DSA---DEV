//                                  METHODS

public class Day6 {

    // Void Method -> Printing greeting
    public static void greeting(String name) {
        System.out.println("Hello " + name
                + "  You're such a legend, the way you deal with things and the level of your intellegance is unmatched, such an unfazed man you're. Salute to you. "
                + name);
    }

    // Return Method -> Maximum b/w 2 numbers
    public static int maxNum(int num1, int num2) {
        int maxnum = num1 > num2 ? num1 : num2;
        return maxnum;
    }

    // Method Overloading -> Area of rectangle and Circle
    public static int area(int length, int width) {
        return length * width;
    }

    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Method calling for all Method Types
    public static void main(String args[]) {
        // Void Method
        greeting("Ansh Thakur");
        // Return Method
        int maxnum = maxNum(100, 0);
        System.out.println(maxnum);
        // Method overloading
        System.out.println("Rectangle Area: " + area(5, 4)); // 20
        System.out.println("Circle Area: " + area(3.0)); // ~28.27
        // Recursive Method
        System.out.println(recursivesumUptoN(10));
    }

    // Recursive Method -> Printing sum of n
    public static int recursivesumUptoN(int n) {
        if (n <= 1) {
            return n;
        }
        int sum = n + recursivesumUptoN(n - 1);
        return sum;

    }

}
