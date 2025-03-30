
// ==================== Vrargs =====================



public class L25_Varargs {
    public static void main(String[] args){

        // vargs = allow method to accept a varying # of arguments
        //         makes methods more flexible, no need for overloaded methods
        //         Java will pack the argument into an array
        //          ... (ellipsis)

        System.out.println(add(1,3,4));

        System.out.println(average(12,34,23,1));

    }
    
    static int add(int... numbers){

        int sum = 0;

        for(int number : numbers){

            sum += number;
        }

        return sum;
    }

    static double average(double... counts){

        double sum = 0;

        for(double count : counts){

            sum += count;
        }

        return sum / counts.length;

        


    }



}
