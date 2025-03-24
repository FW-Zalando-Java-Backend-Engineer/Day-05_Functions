public class Adder {

    // Simple Overload (Different Types)
    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) {
        return a + b;
    }

    // Invalid - only return type differs!
//    public static int sum(int a, int b) {
//      return a + b;
//    }

    // ERROR: same signature, different return type
//    public static double sum(int b, int a) {
//        return (double)(a + b);
//    }

    public static void main(String[] args) {
        System.out.println(add(5, 3));       // 8
        System.out.println(add(2.5, 3.5));   // 6.0
    }

}
