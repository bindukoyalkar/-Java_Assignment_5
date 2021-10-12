package bindu.assignment.singleton;

public class Singleton {
    public String str;
    private static Singleton singleInstance = null;
    public static Singleton method(String s){
        //error occurs here
        /*str=s;
        if (singleInstance == null)
            singleInstance = new Singleton();
        return singleInstance; */
        //correct code
        if (singleInstance == null)
            singleInstance = new Singleton();
        singleInstance.str=s;
        return singleInstance;
    }
    public void printString(){
        System.out.println(str);
    }
}
/* Static Methods can access class variables(static variables) without using object(instance)
of the class, however non-static methods and non-static variables can only be accessed using objects.
Hence in method(String s) , str variable of class cannot be accessed as str is a not static variable and
this causes an error which can only be solved by creating object of Singleton in method and assigning its
string value to the given parameter.
Singleton is a design pattern.
 */