 
//===========>>>Enhanced switch <<<==============


import java.util.Scanner;

public class L13_EnhanceSwitch {
    public static void main(String args[]){

        // Enhanced switch = A replacement to many else if statements
        //                   (java14 feature)

        

        Scanner sc = new Scanner(System.in);

        String day;
        String month;

        System.out.print("Enter the day : ");
        day = sc.nextLine().toUpperCase();

        System.out.print("Enter the month : ");
        month = sc.nextLine().toUpperCase();



       /* 

        if (day.equals("Monday")) {
            System.out.println("It is a weekday");
            
        }
        else if (day.equals("Tuesday")) {
            System.out.println("It is a weekday");
            
        }
        else if (day.equals("Wednesday")) {
            System.out.println("It is a weekday");

        }
        else if (day.equals("Thursdayy")) {
            System.out.println("It is a weekday");

        }
        else if (day.equals("Friday")) {
            System.out.println("It is a weekday");

        }
        else if (day.equals("Saturday")) {
            System.out.println("It is not a weekday");

        }
        else if (day.equals("Sunday")) {
            System.out.println("It is not a weekday");

        }
        else{
            System.out.println("It is not a day");
        }

        */

        switch (day) {
            case "MONDAY" -> System.out.println("It is weekday");
            case "TUESDAY" -> System.out.println("It is weekday");
            case "WEDNESDAY" -> System.out.println("It is weekday");
            case "THURSDAY" -> System.out.println("It is weekday");
            case "FRIDAY" -> System.out.println("It is weekday");
            case "SATURDAY" -> System.out.println("It is not a weekday");
            case "SUNDAY" -> System.out.println("It is not a weekday");
            default -> System.out.println(day + " is not a day");                
            
        }

        switch (month) {
            case "JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE" -> 
            System.out.println("First 6 month ");

            case "JULY","AUGUST","SEPTEMBER","NOVEMBER","DECEMBER","OCTOBER" -> 
            System.out.println("Last 6 month ");

            default -> System.out.println(day + " is not a month");
        }



        sc.close();
    }

    
}
