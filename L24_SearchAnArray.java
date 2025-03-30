
// ============= Search an Array ===============

import java.util.Scanner;

public class L24_SearchAnArray {
    public static void main(String[] args){

        int[] numbers = { 2 , 4 , 5, 1, 8, 9, 7};        
        int target = 0;
        boolean isFound = false;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the element do you want to find : ");
        target = sc.nextInt();
        sc.nextLine();

        for(int i = 0 ; i < numbers.length ; i++ ){

            if (numbers[i] == target) {
                System.out.println("index is "+ i);
                isFound = true;
                break;
                
            }
        }

        if (!isFound) {
            System.out.print("Element cannot find in the array");
            
        }

//========================================================================================

        String[] foods = {"apple" , "pizza", "nuts", "kiwi", "rice"};

        String target1 ;

        System.out.println("Enter the food do you want to find : ");
        target1 = sc.nextLine();


        for( int i = 0 ; i < foods.length ; i++){

            if (foods[i].equals(target1)) {
                System.out.println("Element found index at : " + i);
                isFound = true;
                break;
                
            }
        }

        if (! isFound) {
            System.out.println("Element cannot find in the food array");
            
        }

        sc.close();
    }
    
}
