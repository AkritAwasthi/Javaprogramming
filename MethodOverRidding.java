public class MethodOverRidding {
    public static void main(String[] args) {
        Test2 obj =new Test2 ();
        obj.printMe(); 
    }
       
    }
    
    class Test {
       public void printMe(){
           System.out.println("Printed From Class Test");
       }
       public void printMe2(){
        System.out.println("Printed From Class Test1");
    }
    }
    class Test2 extends Test{
       public void printMe(){
           super.printMe();
           super.printMe2();
           System.out.println("Printed From Class Tst2");
    
       }
    
}
