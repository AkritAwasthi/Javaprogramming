public class PolymorphismRuntime {
    
public static void main(String[] args) {
    B obj = new B();
    obj.printMe(); 
}
   
}

class A {
   public void printMe(){
       System.out.println("Printed From Class A");
   }
   public void printMe2(){
    System.out.println("Printed From Class A 2");
}
}
class B extends A{
   public void printMe(){
       super.printMe();
       super.printMe2();
       System.out.println("Printed From Class B");

   }
}
