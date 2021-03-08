
interface Into{
    public void mult();
}
interface Subtraction{
    public void subtract();
}

public class PracticeInterface {
    public static void main(String[] args) {
        Testing obj = new Testing();
        obj.mult();
        obj.subtract();
        
    }
    
}
class Testing implements Into, Subtraction{
    public void mult(){
        int a = 15;
        int b = 50;
        int c = a * b;
        System.out.println("Multiplication = " + c);
    }
    public void subtract(){
        int a = 15;
        int b = 50;
        int c = a - b;
        System.out.println("Subtraction = " + c);
    }
}
