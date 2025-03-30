//======= User input into array ==========

import java.util.Scanner;

public class L23_UserInputArray {
    public static void main(String[] args){

    /*  
        String[] fruits;
        int size; 

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of food do you want : ");
        size = sc.nextInt();
        sc.nextLine();

        fruits = new String[size];

        for(int i=0 ; i < fruits.length ; i++){

            System.out.println("Enter the food : ");
            fruits[i] = sc.nextLine();


        }

        for(String fruit : fruits){

            System.out.print(fruit);
        }

        
    
*/
        
        String[] foods;
        int size;
     
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of foods do you want : ");
        size = sc.nextInt();
        sc.nextLine();

        foods = new String[size];

        for(int i = 0; i < foods.length; i++){
            System.out.println("Enter the food : ");
            foods[i] = sc.nextLine();

        }

        for(String food : foods){

            System.out.print(food);
         }
        
        sc.close();

    }


    
}
