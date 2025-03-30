
// ======================= Overloaded method =======================


public class L20_overloadedMethod {
    public static void main(String args[]){

        // overloaded method = method that share the same name
        //                   = but different parameters
        //                   = signature = name + parameters

        System.out.println(add(1,2,3));
    
    }
    
    static double add(double a, double b){
        return a + b;
    }

    static double add(double a, double b, double c){       // method can be same name but it should be additional parameters 
        return a + b + c;                                  // if 2 methods having same name and parameters it is not valid
    }

    static double add(double a, double b, double c, double d){
        return a + b + c + d;
    }

}
