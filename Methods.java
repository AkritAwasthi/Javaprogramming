public class Methods {
    
public static void main(String[] args) {

    // This is class object
    Methods obj = new Methods();

    obj.myFirstMethod();

    obj.myFirstMethod(10);

   int p =  obj.mySecondMethod();
   System.out.println("Hi, It will print from Int return type from method " +p);

   int p1 = obj.mySecondMethod(30);
   System.out.println("Hi, It will print from Int return type from method " + p1);

}
    // Take nothing and Return nothing
    // No Return Type , No Arguments
    // Method body
    void myFirstMethod(){
       System.out.println("Hi, It will take no parameter and no Return type");
    }

    // Take something and Return nothing
    // No Return type , With Argument
    void myFirstMethod(int x){
        System.out.println("Hi, It will take Take parameter and no Return type " + x);

    }

    // Take nothing return something
    // With Return type , No Arguments
    int mySecondMethod(){
      int x = 20;
       return x;
    }

    // Take something and Return Something
    // With Return Type , With Arguments
    int mySecondMethod(int x){
         return x;
      }



}
