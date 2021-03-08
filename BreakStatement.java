public class BreakStatement{
    public static void main(String[]args){
        System.out.println("Break Statement in For loop");
        int i;
        for (i = 10; i <=20; i++){
            if(i == 15){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Break Statement in while loop");
       int j = 10;
        while(j<=50){
            if (j==25){
                break;
            }
            System.out.println(j);
            j++;
        }
    }
}