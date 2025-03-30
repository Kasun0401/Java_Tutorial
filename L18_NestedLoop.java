
//========= Nested Loop =================

import java.util.Scanner;

public class L18_NestedLoop {
    public static void main(String args[]){

        // nested loop = A loop inside another loop
        //             = used often with matrix and DS&A

        int row;
        int column;
        char symbol;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of Rows : ");
        row = sc.nextInt();

        System.out.println("Enter the no of Column : ");
        column = sc.nextInt();

        System.out.println("Enter the Symbol : ");
        symbol = sc.next().charAt(0);



        for(int i = 0; i < row; i++){
            for(int j = 0 ; j < column ; j++){
                System.out.print(symbol);
            }

            System.out.println("");
        }

        sc.close();

    }
    
}
