public class Constructor {
    int x = 10;
    /*
    constructor similar to method
    constructor name and class name both are same 
     constroctor is called at the time we create an object, it allocates memory for the object 
     it is a special type of method used to initialize the object
     type of constroctor:- default(no parameter) parameterised
     constroctor name and class name are same .
     no return type
     cna not be abstract, static , final
    */

    Constructor (){
        System.out.println("Default Constructor");
    }

    
    public static void main(String[]args){
        Constructor obj = new Constructor();
        System.out.println(obj.x);
    }

    
}
