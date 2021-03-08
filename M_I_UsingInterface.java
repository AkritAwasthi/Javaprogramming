
interface Add {
    public void add();// declaring function
}

interface Div {
    public void div();
}
public class M_I_UsingInterface {
    public static void main(String[] args) {
        Uses obj = new Uses();
        obj.add();
        obj.div();

    }

}

class Uses implements Add, Div {
    public void add() {
        int x, y, z;
        x = 10;
        y = 25;
        z = x + y;
        System.out.println("Sum = " + z);

    }

    public void div() {
        int x, y, z;
        x = 50;
        y = 25;
        z = x / y;
        System.out.println("Division = " + z);

    }

}

