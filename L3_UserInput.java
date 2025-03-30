import java.util.Scanner;   // Import the Scanner class


public class L3_UserInput {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);  // Create a Scanner object

        System.out.print("Enter your name: "); 
        String name = sc.nextLine();// Read user input, 

        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        System.out.print("What is your gpa : ");
        double gpa = sc.nextDouble();

        System.out.print("Are you a student? (true/false) : ");
        boolean isStudent = sc.nextBoolean();


        System.out.println("Hello " + name);   // Output user input
        System.out.println("I am "+ age + " years old");
        System.out.println("Your gpa is : "+ gpa); 

        if (isStudent) {
            System.out.println("You are student of this college");   
        }
        else{
            System.out.println("you are not a student of this college");
        }

        // Common issue

        System.out.print("Enter your birth year: ");     
        int year = sc.nextInt(); //1997/n
        sc.nextLine();

        /* after hit the enter  1997/n will create but the below mentioned 
        nextLine character take that new line character as their input then [color= /n] 
        So solve this matter we can use anothe nextLine method below nextInt()
        */

        System.out.print("Enter your favourite color : ");
        String color = sc.nextLine();

        System.out.println("I born in "+ year);
        System.out.println("My favourite color is : "+ color);


        // calculate the area of the rectangle.

        double width, height, area;
        
        System.out.println("Enter the width : ");
        width = sc.nextDouble();

        System.out.println("Enter the height : ");
        height = sc.nextDouble();

        area = width*height;

        System.out.println("The area of the rectangle is : " + area + "cm²" );   // for cm² = Numlock+Alt+0178



        sc.close();
    }

}