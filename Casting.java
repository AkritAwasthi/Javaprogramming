public class Casting {
 public static void main(String[] args) {
  // way of converted one datatype to another
  // 1) emplicit, explicit
  // 2)wedning , narrowing
  //wedning- small type to large type
  // type narrowing large type to small type

  int iValue = 55;
  //Emplicit
  double dValue = iValue; // This will be done by compiler
  System.out.println("Now Int Value is converted into Double " + dValue);
   
  double dValue2 = 23.43;
  //Explicit - forcefully
  int iValue2 =  (int) dValue2;
  System.out.println("Now Float Value is converted into Int " + iValue2);


}

   
    
}
