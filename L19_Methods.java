
//============ methods =================


public class L19_Methods {
    public static void main(String[] args) {

        // method = a block of reusable code that executed when called ()

        /*
             When a parameter is passed to the method, 
             it is called an argument. So, from the example above: name & age are a parameters,
             while Kasun and 25 are arguments. 

         */

 //=======================================================================       

        
        
        happyBirthday("Kasun", 25);
        happyBirthday("Kasun", 25);   // kasun and 25 are argument

 //=======================================================================      

        double result1 = squre(3);
        System.out.println(result1);

 //=======================================================================      

        double result = cube(2);
        System.out.println(result);

 //=================================================================================      

        String fullName = getFullName("Kasun", "Amaraweera");
        System.out.println(fullName);
        System.out.println("");


 //==================================================================================

        int age1 = 21;

        if(ageCheck(age1)){
            System.out.println("You are Sign up!!!!!!");

        }
        else{
            System.out.println("You must be 18+ to sign up!!!!!");
        }




    }
    
    static void happyBirthday(String name , int age){                // name and age are parameters

        System.out.println("Happy birthday to you");
        System.out.printf("Happy birthday dear %s \n", name);
        System.out.printf("You are %d years old \n" , age);
        System.out.println("Happy birthday to you \n");
    }  
    
    static double squre(double number1){
        return number1 * number1;
    }
    
    static double cube(double number){
        return  number*number*number;
    }
    
    static String getFullName(String firstName,String lastName){
        return firstName + " " + lastName;


    }

    static boolean ageCheck(int age1){

        if(age1 > 18){
            return true;
        }
        else{
            return false;
        }
    }


}

    
