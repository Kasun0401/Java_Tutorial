
//============== Arrays =====================

// 🟨 array  =  Arrays are used to store multiple values in a single variable, 
//           =  To declare an array, define the variable type with square brackets:


import java.util.Arrays;

public class L22_Arrays {

    public static void main(String[] args){

        String[] fruits = {"apple" , "orange", "banana" , "coconut"};
//                          0          1         2           3

        int[] numbers = {1 , 4 , 34 , 65};


        fruits[3] = "kiwi";               // Change the value of array

        int numOfFruits = fruits.length;


        System.out.println(fruits[0]);
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);

        System.out.println(numOfFruits);


//==============>>>>>>> Method 1 <<<<<<<<<<<<==========================

        String[] names = {"dasun", "kasun" , "amal", "chan"};

        for(int i = 0; i < names.length ; i++ ){

            System.out.print(names[i] + " ");

        }

        System.out.println("  ");

//==============>>>>>>>> Method 2 <<<<<<<<<<<<<==========================     
// ============== Official method ===================   

        for(String name : names){

            System.out.print(name + " ");

        }

        System.out.println(" ");


        for(int number : numbers){
            System.out.print(number+ " ");
        }

        System.out.println(" ");


       
//==================================================================

    //    Arrays.sort(names);               // sort the value 

        Arrays.fill(names , "imal");

        for(String name : names){

            System.out.print(name + " ");

        }

        

            


    }
    
}
