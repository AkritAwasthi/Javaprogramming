import java.util.*;
public class UserValue{
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        int x, y, z;
        System.out.println("Enter your First Number");
        x = obj.nextInt();
        System.out.println("Enter your Second Number");
        y = obj.nextInt();
        z = x + y;
        System.out.println("your result is = "+z);

    }
}