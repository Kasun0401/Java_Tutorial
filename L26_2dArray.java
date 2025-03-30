
//========= 2D array ===================

public class L26_2dArray {
    public static void main(String[] args){
        
        String[] foods = {"pizza", "bun", "rice"};
        String[] fruits = {"kiwi", "apple", "banana"};
        String[] meats = {"chicken", "pork", "beef"};

        String[][] groceries = {foods , fruits, meats};    // 2d array

        for(String[] items : groceries){
            for(String item : items){

                System.out.print(item + " ");
            } 
            
            System.out.println();
            
        }

//==============================================================================        

        char[][] telephone =   {{'1', '2', '3'},
                                {'4', '5', '6'},
                                {'7', '8', '9'},
                                {'*', '0', '#'}};

        for( char[] row : telephone){
            for(char number : row){

                System.out.print(number+ " ");
            }
            System.out.println();
        }                        



        
    }

    
    
}
