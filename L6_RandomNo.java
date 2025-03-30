// 🟧 Random numbers

import java.util.Random;

public class L6_RandomNo {
    public static void main(String args[]){

        Random random = new Random();

        int num1;
        double num2;
        int num3;
        boolean isHead;

        num1 = random.nextInt(1,7);     //First number is inclusive second number is exclusive (1,2,3,4,5,6)
        num2 = random.nextDouble(1,101);   //(1,2,3.....,50,..,100)
        num3 = random.nextInt(100,150); //(100,101,...125,..149)
        isHead = random.nextBoolean();

    
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        if (isHead) {
            System.out.println("It i Heads");
            
        }
        else{
            System.out.println("It is tails");
        }



    }
    
}
