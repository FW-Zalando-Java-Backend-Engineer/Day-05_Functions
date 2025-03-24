public class Greeter {

    //  Overloading by Number of Parameters
    public static void greet() {
        System.out.println("Hello!");
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        greet();
        greet("Alice");
        // greet("Bob", "evening"); No overloading provided
    }

}
