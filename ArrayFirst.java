public class ArrayFirst {
    public static void main(String[] args){
      int arr[] = new int[5];
      int sum = 0;
      int max = 0;
      arr[0] = 5;
      arr[1] = 15;
      arr[2] = 25;
      arr[3] = 95;
      arr[4] = 65;

      for(int i = 0; i<arr.length; i++){
          sum = sum + arr[i];
      }
      System.out.println("Your sum is "+ sum);

      for (int j = 0; j<arr.length; j++){
        if(max<arr[j]){
          max = arr[j];
        }
      }
      System.out.println("Your Maximum is "+ max);


    }
}
