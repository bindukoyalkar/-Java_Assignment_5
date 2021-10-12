package bindu.assignment.data;

public class DefaultInitializationAssignment {
    private int number;
    private char letter;
    public void accessMembersOfClass(){
        System.out.println(number);
        System.out.println(letter);
    }
    public void classMethod(){
        // uninitialized local variables
        /*int localVar1;
        float localVar2; */
        int localVar1=10;
        float localVar2=100.5f;
        System.out.println(localVar1);
        System.out.println(localVar2);
    }
}
//Explanation for error
/* The local variables declared in classMethod() are not initialized in the method , hence print lines
 in method reports as errors. In order for the errors to be resolved in classMethod(), the local variables
 should be initialized during/after declaration. */