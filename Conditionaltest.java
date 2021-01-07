public class Conditionaltest {
    public static void main(String[]args){
        //simple if else
        int x = 5;
        if(x==10){
            System.out.println("it will execute in true case");
        }
        else
        {
            System.out.println("it will execute in false case");
        }
        //nested if else
        if(x==5){
            if(x==20){
                System.out.println("it will execute when both condition will be true");
            }

        }
        else{
            if(x==5){
                System.out.println("it will execute when this condition will be true");
            }
        }
        //ladder form
        if(x==15){
            System.out.println("it will be execute when condition will be true");
        }
        else if(x==25){
            System.out.println("it will be execute when condition will be true");

        }
        else if(x==5){
            System.out.println("it will be execute when condition will be true");
        }
        else{
            System.out.println("it will execute when all condition is wrong");
        }
        
    }
    
}
