interface MyMethodInterface{
   public void test1();
   public void test2();

}


public class MyInterface implements MyMethodInterface{
    
    public void test1(){
    System.out.println("implim3entation of function");

     }
     public void test2(){
         System.out.println("Implimentation of test2");
     }
public static void main(String[] args) {
    MyInterface obj = new MyInterface();
    obj.test1();
    obj.test2();

}  
}



