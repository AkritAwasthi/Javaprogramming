interface Addition{

    public void sum();
}

public class LemdaExpression{
    public static void main(String[]args){
        int a = 15;
        int b = 20;
        int c;
        c = a + b;
        Addition a1 = ()->{
            
            System.out.println(c);
        };
        a1.sum();

    }
}
