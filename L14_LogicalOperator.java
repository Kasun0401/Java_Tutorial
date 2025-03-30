 
//=====>> LOGICAL OPERATOR <<============

import java.util.Scanner;

public class L14_LogicalOperator {
    public static void main(String args[]){

        //  && = AND
        //  || = OR
        //  !  = NOT

/*      double temp = 20 ;
        boolean isSunny = true;

        if (temp >= 0 && temp <= 30 && isSunny) {
            System.out.println("The weather is good");
            System.out.println("It is Sunny outside");
            
        }
        else if (temp >= 0 && temp <= 30 && ! isSunny) {
            System.out.println("The weather is good");
            
        }
        else if (temp >= 30 || temp <= 0) {
            System.out.println("The weather is not good");
         
        }

*/
        Scanner sc = new Scanner(System.in);

        String username;
        int length;
        

        System.out.print("Enter your username : ");
        username = sc.nextLine();

        length = username.length();

        if (username.contains(" ") || username.contains("_")  ) {
            System.out.println("Username must not contain spaces or underscores");
            
        }
        else if (length <= 4 || length >= 12) {
            System.out.println("Username must between 4-12 characters");

            
        }
        else{
            System.out.println("Your username is "+ username);
        }

        sc.close();


    }
    
}
