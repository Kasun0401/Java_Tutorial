
//==========>> Break & Continue <<==============


public class L17_BreakContinue {
    public static void main(String[] args) {
        
        // breack   = break out of a loop(STOP)

        // continue = skip current iteration of a loop (SKIP)

        int i; 

        for(i = 0;i < 10; i++){
            if (i == 5) {
                break;                
            }
            System.out.println(i + "");          //break out of a loop(STOP) 0 1 2 3 4
            
        }

        System.out.println(" ");
            
//===================================================================

        int a;

        for(a= 0 ; a < 10 ; a++ ){
            if (a == 5) {
                continue;               
            }
            System.out.println(a+" ");       // skip current iteration of a loop (SKIP) 0 1 2 3 4  6 7 8 9 
        }                                   // except 5

    }
    
}
