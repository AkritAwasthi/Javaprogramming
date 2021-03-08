public class Inheritance1 {
   
    public static void main(String[] args) {
        Two obj = new Two();
        obj.multiply();
        obj.divide();
    }
    
}

class One {
    void multiply(){
        int x =10;
        int y = 20;
        int z = x * y;
        System.out.println("Multiplication is " +z);
    }
}

class Two extends One{
    void divide(){
        int x =10;
        int y = 5;
        int z = x / y;
        System.out.println("Divide is " +z);
    }
}
