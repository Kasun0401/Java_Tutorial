
//============>>> For Loop <<<===================

import java.util.Scanner;

public class L16_ForLoop {
    public static void main(String args[]) throws InterruptedException{

        // for loop = execute some code a CERTAIN amount of time !!!!!!

        int i;
        int a;

        for( i = 1; i <= 10; i++){
            System.out.println(i +" Pizza");
            
        }
        System.out.println("");

//=============================================================================
        
        for(a = 1;a < 20; a+=3){
            System.out.println(a +" ");
            

        }
        System.out.println("");

//===============================================================================

        Scanner sc = new Scanner(System.in);

        int second;

        System.out.print("How many seconds you need to countdown : ");
        second = sc.nextInt();

        for( int b = second; b > 0 ; b--){

            System.out.println(b);
            Thread.sleep(1000);                  // Thread.sleep(___); -----> use for the programme will sleep for seconds
        }

        System.out.println("!!!!!!! HAPPY NEW YEAR !!!!!!");

        sc.close();


    }
    
}
