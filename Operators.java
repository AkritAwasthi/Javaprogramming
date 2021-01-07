public class Operators {
    public static void main(String[] args) {
        /*
         * operators - is a symbol which performs any operation
         *  Arithmetic operators - +, -,  *, /, %modulor, +, 
         *  Unary operators - unary operators need only one operand.
         * Logical operators - logical AND &&, logical or ||
         *  ASsignment operators - +=, -=, *=, /=, %= 
         * Bitwise operators - right shift(>>), left shift(<<) operators
         * precedence - BODMAS
         *  ternary operator - condition ? (true) : false
         */

        int x = 50;
        ++x;

        // --x;
        System.out.println("value=" + x);
        x = x + 2;
        System.out.println("increament by 2 =" + x);

    }

}
