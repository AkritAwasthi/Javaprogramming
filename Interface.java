interface firstone{
    void myfun();
}

public class Interface{
    public void myfun(){
        System.out.println("Defined in class & called interface");
    }
    public static void main(String[]args){
        System.out.println("java");
        Interface obj = new Interface();
        obj.myfun();
    }
}