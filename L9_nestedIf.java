public class L9_nestedIf {
    public static void main(String args[]){

        boolean isStudent = false;
        boolean isSenior = true;
        double price = 9.99;

        if (isStudent) {

            if (isSenior) {
                System.out.println("You get a discount of student 10%");
                System.out.println("You get a discount of senior 20%");
                price *= 0.7;
                
            }
            else{
                System.out.println("You get a discount of student 10%");
                price *= 0.9;
            }
            
        }

        else{

            if (isSenior) {
                System.out.println("You get a discount of student 20%");
                price *= 0.8;

            }

            else{
                System.out.println("You are not a student");
                price *= 1;
            }

            ;
        } 

            
        

        System.out.printf("The price of book is $ %.2f ",price);
    }
    
}
