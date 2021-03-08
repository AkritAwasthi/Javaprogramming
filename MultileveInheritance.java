public class MultileveInheritance {
public static void main(String[] args) {
     division obj = new division();
     obj.add();
     obj.mult();
     obj.div();

    
}
    
}
class sums{
    int x, y, z;
    public void add(){
        x = 50;
        y = 100;
        z = x + y;
        System.out.println("sum = " + z);
    }
}
class multiple extends sums{
    int i, j, k;
    public void mult(){
        i = 5;
        j = 10;
        k = i * j;
        System.out.println("multiplication = " + k);

    }
}
class division extends multiple{
    float p, q, r;
    public void div(){
     p = 5;
    q = 10;
    r = p / q;
    System.out.println("division = " + r);
    }
    
}
