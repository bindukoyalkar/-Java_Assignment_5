package bindu.assignment.main;

import bindu.assignment.data.DefaultInitializationAssignment;
import bindu.assignment.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        DefaultInitializationAssignment defaultInitializationObject= new DefaultInitializationAssignment();
        defaultInitializationObject.accessMembersOfClass();
        defaultInitializationObject.classMethod();
        Singleton obj=Singleton.method("hello world");
        obj.printString();
    }
}
