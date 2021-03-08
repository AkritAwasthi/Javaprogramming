interface Paralemda{

    public void sname(String name);
}

public class Lemda1args {
    public static void main(String[] args) {
      Paralemda  o1 = (name) -> {
             System.out.println("Student name =" + name);

        };
        o1.sname("AkritAwasthi");
    }
    
}
