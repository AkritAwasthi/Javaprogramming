public class AbstractClasses {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.display();

    }
}
abstract class show {
    abstract void display();// Abstract

}

class Student extends show {
    void display() {
        System.out.println("not Abstract method");
    }
}

