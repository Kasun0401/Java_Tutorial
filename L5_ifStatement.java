 
 // 🟧 if statement = perform a block of code if its condition true

 // 🟪 Java Comparison Operators

 /*  Operator       Name
  * ---------     ----------
      ==	      Equal to	                x == y	
      !=	      Not equal	                x != y	
       >	      Greater than	             x > y	
       <	      Less than	                 x < y	
      >=	      Greater than or equal to	x >= y	
      <=	      Less than or equal to	    x <= y

  */

  // 🟦 Java Logical Operators

  /* Operator     Name                            Description                                       Example
  -----------  -------------        --------------------------------------------------------   ------------------
       && 	    Logical and	         Returns true if both statements are true	                x < 5 &&  x < 10	
       || 	    Logical or	         Returns true if one of the statements is true	            x < 5 || x < 4	
       !        Logical not	         Reverse the result, returns false if the result is true	!(x < 5 && x < 10)
   */

import java.util.Scanner;

public class L5_ifStatement {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
    

        int age;
        String name;
        boolean isStudent;

        System.out.print("Enter your name : ");
        name = sc.nextLine();

        System.out.print("Enter your age : ");
        age = sc.nextInt();

        System.out.print("Are you student (true/false) : ");
        isStudent = sc.nextBoolean();

    
        //Group1
        if (name.isEmpty()) {                                   // If you didn't enter value in name variable 💥isEmpty()💥 method can use for check.
            System.out.println("\nYou didn't enter yor name");   
        }
        else{
            System.out.println("\nyour name is " + name);
        }


        //Group2
        if (age >= 65) {
            System.out.println("You are a senior!");
            
        }
        else if (age >= 18) {
            System.out.println("you are a adult");
            
        }
        else if (age == 0) {
            System.out.println("You are a baby!");
            
        }
        else if (age <= 0) {
            System.out.println("You are not born yet");
            
        }
        else{
            System.out.println("You are a child");
        }


        //Group 3
        if (isStudent) {
            System.out.println("You are a student");
            
        }
        else{
            System.out.println("You are not the student");
        }


        sc.close();

    }
    
}