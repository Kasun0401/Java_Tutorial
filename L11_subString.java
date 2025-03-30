
// ----------------Substring-----------------

import java.util.Scanner;

public class L11_subString {
    public static void main(String args[]){

        // .substring() = A method use to extract a portion of a string
        //                .substring(start, end)

        String email = "kasun123@gmail.com";
        String username = email.substring(0,8);
        String domain = email.substring(9);

        System.out.println(username); // kasun123
        System.out.println(domain);  // gmail.com

        /*  If we have different email , we dont know exact end point of username
         that kind of situation using this method
        */

        String email1 = "Amare123@gmail.com";
        String username1 = email1.substring(0, email.indexOf('@'));
        String domain1 = email.substring(email.indexOf("@") + 1);

        System.out.println(username1);
        System.out.println(domain1);

        //----------------------------------------------------------------->>>>>>>>>>

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your email address : ");
        String email2 = sc.nextLine();

        if(email2.contains("@")){

            System.out.println("User name is : " + email2.substring(0, email2.indexOf("@")));
            System.out.println("Domain is : " + email2.substring(email2.indexOf("@")+ 1));
        }

        else{
            System.out.println("This not a email address");
        }


        sc.close();




    }
    
}
