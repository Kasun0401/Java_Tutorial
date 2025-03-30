
//============ Variable Scope ===================

// In Java, variables are only accessible inside the region they are created. This is called scope

// First focus on the inside variable and then focuse others

public class L21_VariableScope {


    static int x = 3;          // Class Scope

    public static void main(String args[]){

        //  variable scope = where a variable can be accessed

        //int x = 1;                 // Local variable            [main() and doSomething() is act like differnt homes]
        System.out.println(x);

        doSomething();
    }

    
    static void doSomething(){

        int x = 2;                 // Local variable
        System.out.println(x);
    }
}
