public class Method2 {
    public static void main(String[] args) {
        //this is Object of the class
        Method2 obj = new Method2();
        // this is Method calling
        obj.myFirstMethod();
        
        obj.mySecondMethod(50, 30);
    int p = obj.myThirdMethod();
    System.out.println("Multiplication" + p);
    float q = obj.myFourthMethod(15, 10);
    System.out.println("Division = " +q );
        
    }
    //no parameter no return type
    void myFirstMethod(){
        int x = 10;
        int y = 20;
        int z = x + y;
        System.out.println("sum = " + z);
    }
    //with parameter no return type
    void mySecondMethod(int x, int y){
        int z = x - y;
        System.out.println("Subtraction = " + z);
    }
    // no parameter with return type
    int myThirdMethod(){
        int x = 15;
        int y = 20;
        int z = x * y;
        return z;

    }
    // with parameter with return type
    float myFourthMethod(float x, float y){
        float z = x / y;
        return z;

    }
    
}
