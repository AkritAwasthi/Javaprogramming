public class Forloop {
    public static void main(String[] args) {
        // variable declaration
        int x;
        int n = 2;

        // looping - repeat the task
        // will print 0 to 10 number
        System.out.println("This is your 0 to 10 numbers");
        for (x = 0; x <= 10; x++) {
            System.out.println("x = " + x);
        }
        System.out.println("This is your 0 to 5 numbers");
        for (x = 0; x <= 5; x++) {
            System.out.println("x = " + x);
        }
        System.out.println("this is 40 to 35 reverse numbers");
        for (x = 40; x >= 35; x--) {
            System.out.println("x = " + x);
        }
        System.out.println("This is your 1 to 10 square of same numbers");
        for (x = 1; x <= 10; x++) {
            System.out.println(x + " = " + x * x);
        }
        System.out.println("This is table of 2");
        for (x = 1; x <= 10; x++) {
            System.out.println(n + " * " + x + " = " + n * x);
        }
        System.out.println("This is your 1 to 10 cube of same numbers");
        for (x = 1; x <= 10; x++) {
            System.out.println(x + " = " + x * x * x);
        }

    }
}