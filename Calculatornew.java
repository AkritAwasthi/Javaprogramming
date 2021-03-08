public class Calculatornew {
    public static void main(String[] args) {
        sum obj1 = new sum();

        multiply obj2 = new multiply();
        obj2.multiplcation();
     int result =   obj1.addition(10, 20);
        System.out.println("Sum = " + result);
    }

    
}
class sum {
    public int addition(int a, int b){
        return a + b;
    }
}
class multiply {
    public void multiplcation(){
        int x, y , z;
        x = 50;
        y = 10;
        z = x * y;
        System.out.println("multiplication = " + z);
    }
}