import java.util.jar.JarOutputStream;

public class ReferenceExample {
    public static void modifyArray(int[] arr) {
        System.out.println(arr); // the reference @7b23ec81 is what has been passed
        arr[0] = 99;
        arr[1] = 77;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3}; // created with reference @7b23ec81
        System.out.println(numbers);
       // System.out.println("First element: " + numbers[0]); // 1
        modifyArray(numbers);
      //  System.out.println("First element: " + numbers[0]); // 99

    }

}
