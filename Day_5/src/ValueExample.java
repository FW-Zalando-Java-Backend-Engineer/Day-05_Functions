public class ValueExample {
    public static void changeNumber(int num){
        num += 100; // num = num +100;
        System.out.println("num is: "+num);
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println("x is: "+x);
        changeNumber(x);
        System.out.println("x is: "+x);
    }
}
