
//----------------String method--------------------

public class L10_stringMethod {
    public static void main(String args[]){

        String name = "Bro code";


 /*      
        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("r");
        int lastIndex = name.lastIndexOf("o");

        System.out.println(length);   // 7
        System.out.println(letter);   // B
        System.out.println(index);    // 1
        System.out.println(lastIndex); // 5

        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim();
        name = name.replace("o","a");
*/
        System.out.println(name);


/*   //-------------------------------------------------------------     
        if(name.isEmpty()){

            System.out.println("Your name is empty");
        }

        else{
            System.out.println("your name is "+name);

        }

*/ //------------------------------------------------------------------

/* //------------------------------------------------------------------

        if(name.contains("B")){

            System.out.println("your name contain with that character");
        }

        else{

            System.out.println("your name not contain with that character");
        }

*/ //----------------------------------------------------------------------

        if (name.equals("password")) {
            System.out.println("Your name can't be password");
            
        }

        else{
            System.out.println("Hello " + name);

        }


    }
    
}
