
//---------Ternary Operator-----------------

public class L12_ternaryOperator {
    public static void main(String args[]){
         
        // ternary operator? = Return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;


        //========>>>>>>This is a traditional way for use if statement

        int score = 75;

        if (score >= 70) {
            System.out.println("PASS");
            
        }
        else{
            System.out.println("FAIL");

        }

        //========>>>>>>> Using ternary operator we can write this code using one line ====

        int mark = 56;

        String passORfail = (mark >= 70) ? "PASS" : "FAIL";

        System.out.println(passORfail);

        //========= Find ODD or EVEN ===============

        int number = 23;

        String oddOReven = (number % 2 ==0) ? "Even" : "Odd";

        System.out.println(oddOReven);
    }
    
}
