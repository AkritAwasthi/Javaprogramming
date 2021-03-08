public class P2Method{
    public static void main(String[]args){
        P2Method obj = new P2Method();
        obj.maths("My Physics And Math Marks ", 94, 86);
        obj.maths(" English marks", 94.5);

    }
    public void maths(String s, int x, int y){
        System.out.println(s +" = "+ "" + x + "," + y);

    }
   public void maths(String p, double f){
        System.out.println( p +" = " + f);

    }
}