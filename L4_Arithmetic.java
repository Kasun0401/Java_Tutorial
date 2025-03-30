public class L4_Arithmetic {

    public static void main(String args[]){
        
        // 🟦Arithmetic Operators

        int x = 10;
        int y = 2;
        int z;

        z = x + y;      //---12
        z = x - y;      //---8
        z = x * y;      //---20
        z = x / y;      //---5
        z = x % y;      //---0 (how much left)

        // 🟧Augmented Assignment operators

        x += y; // x = x + y----------12
        x -= y; // x = x - y----------8
        x *= y; // x = x * y----------20
        x /= y; // x = x / y----------5
        x %= y; // x = x % y----------0

        System.out.println(z);

        // 🟥Increment and Decrement Operators

        int a = 1;

        a++; //------------2
        a++; //------------3

        System.out.println(a);

        int b = 1;

        b--; //------------0
        b--; //------------(-1)

        System.out.println(b);
    /*--------------------------------------------------------------------------------------------------
    * 🟨Special Case
    */
        int num1 = 5;

        int result = ++num1;         // first increment and then fetch the value to the result
        System.out.println(result); // 6 

        int num2 = 5;

        int result1 = num2++;         // first  fetch the value and then increment value to the result1
        System.out.println(result1); // 5 

        //but take it as a individually  num++ and ++num do the same thing.. in the programme.

     //---------------------------------------------------------------------------------------------------

        // 🟧Order Of Operation  [P-E-M-D-A-S] 
        /* P- Parentheses
         * E- Exponent
         * M- Multiplication
         * D- Division
         * A- Addition
         * S- Subtraction
         */

        




    }
  
}
