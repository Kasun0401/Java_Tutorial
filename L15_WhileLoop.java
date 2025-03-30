
//========>>> While Loop <<<============

import java.util.Scanner;

public class L15_WhileLoop {
    public static void main(String args[]){

        // While loop = repeat some code forever
        //              While some condition remains true

        Scanner sc = new Scanner(System.in);

        String name = "";

        
        while (name.isEmpty()) {
            System.out.println("Enter your name : ");
            name = sc.nextLine();                             // 💥In while() method until condition remain true, this will be loop
        }
        
        System.out.println("Hello "+ name);

        

 /*     //🟨Stuck in this loop forever

        while(1 == 1){

            System.out.println("Help! you stuck in this loop forever")
        
 */          
        
        String response = "";
 
        while ( ! response.equals("Q")) {

            System.out.println("You are playing game !!!");

            System.out.println("Press q to quit : ");
            response = sc.next().toUpperCase();
         
        }

        System.out.println("You have quit the game");

 //============================================================================
 
        int age = 0;

        System.out.println("Enter your age : ");
        age = sc.nextInt();

        while (age < 0){
            System.out.println("Your age cannot be negative");
            System.out.println("Enter your age : ");
            age = sc.nextInt();
            
            
        }

        System.out.println("Your age is " + age);

//============= If we use Do-While ==================================

        int age1 = 0;

        do{
            System.out.println("Your age cannot be negative");
            System.out.println("Enter your age : ");
            age1 = sc.nextInt();

        }
        while( age1 < 0);

        System.out.println("New age is :" + age1);

//====================================================================
        int i;

        i = 1;

        while(i < 4){

            System.out.println("Hello world!");
            i++;
        }



        sc.close();









    }
    
}
