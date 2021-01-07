public class Question1 {
 public static void main(String[] args) {
     int rollNumberArr[] = new int[5];
     rollNumberArr[0] = 1000;
     rollNumberArr[1] = 1001;
     rollNumberArr[2] = 1002;
     rollNumberArr[3] = 1003;
     rollNumberArr[4] = 1004;
     // Traversing the Array
     for(int i = 0; i<rollNumberArr.length; i++){
         System.out.println(rollNumberArr[i]);
     }
     //length of array
     int count = 0;
     for(int i = 0; i<rollNumberArr.length; i++){
         count =i + 1;
     }
     System.out.println(count);
        
    }
    
}
