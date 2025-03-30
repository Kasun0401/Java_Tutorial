public class L2_Variable {
    public static void main(String[] args) {
       
        // 🟥variable = a reusable container for value
        //               a variable behave as if it was the value it contains

        // 🟦primitive = simple value stored derectly in memory (stack)
        // 🟪Reference = memory address (stack) that point to the (heap)

        // 🟧Primitive vs 🟨Reference
        //----------    ---------
        /* int              string
         * double           array
         * char             object
         * boolean
         */

         // 2 steps to creating a variable
         //-------------------------------
         // 1. Decleration
         // 2. assignment


        /*  🟥byte	    Stores whole numbers from ..............-128 to 127
            🟥short	    Stores whole numbers from ..............-32,768 to 32,767
            🟧int	    Stores whole numbers from ..............[-2,147,483,648 to 2,147,483,647]
            🟪long	    Stores whole numbers from ..............-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
            🟦float	    Stores fractional numbers. ..............Sufficient for storing 6 to 7 decimal digits
            🟥double	Stores fractional numbers. ..............Sufficient for storing 15 to 16 decimal digits
            🟦boolean	Stores true or false values
            🟨char	    Stores a single character/letter or ASCII values, The character must be surrounded by single quotes 'a' , '@'
             */

        int age = 21;
        int year = 2024;

        double price = 19.99;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '!';

        boolean forSale = false;
        boolean isOnline = true;

        
        System.out.println(age);
        System.out.println("This is year : " + year);

        System.out.println(temperature);
        System.out.println("$ : "+ price);

        System.out.println(grade +","+ symbol+" These are my char variable example" );

        if (isOnline) {
            System.out.println("you are online");
         }
        else{
            System.out.println("you are offline");
        }

        System.out.println(forSale);

        //Declare many variable 
        /*To declare more than one variable of the 
         same type, you can use a comma-separated list:
         */

        int x=3, y=5, z=9;
        System.out.println(x+y+z);

        // One value to multiple variable
        /* you can also assign the same value to multiple 
         * variable in one line
         */
        int a, s, d;
        a= s= d =28;
        System.out.println(a+s+d);

        /* Non-primitive data types are called reference types because they refer to objects.
        The main differences between primitive and non-primitive data types are:

        🟪Primitive types in Java are predefined and built into the language, 
        while non-primitive types are created by the programmer 

        🟨Primitive types start with a lowercase letter (like int), 
        while non-primitive types typically starts with an uppercase letter (like String).
        */

        String name = "Kasun amaraweera";
        String food = "pizza";
        
        System.out.println(name +" likes to eat "+ food);

    }
    
}
