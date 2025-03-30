

// 💥How to us printf

// printf() = is a method used to format output

// %[flags][width][.precision][specifier-character]

//----------------------------------------------------------------

// [specifier-character]

// String -------------> %s
// char   -------------> %cs
// int    -------------> %d
// double -------------> %f
// boolean-------------? &b

//----------------------------------------------------------------

// [Flags]

// + = output a plus
// , = comma grouping seperator
// ( = negative numbers are enclosed in()
// space = display a minus if negative, space if positive

//-----------------------------------------------------------------

// [width]

// 0 = zero padding
// number          = right justified padding
// negative number = left justified padding



public class L8_Printf {
    public static void main(String args[]){

        String name = "David";
        char firstLetter = 'S';
        int age = 30;
        double height = 5.7;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("My name is start with %c \n", firstLetter);
        System.out.printf("I am %d years old\n", age);
        System.out.printf("My height is %f feet\n", height);
        System.out.printf("Yeah i am Employed : %b\n\n", isEmployed);

        System.out.printf("%s is %d years old and his hieght is %f feet. And his name start with %c...",name,age,height,firstLetter);

        double price1 = 13.56;
        double price2 = 100.1;
        double price3 = -54.678;

        System.out.printf("%.5f\n", price1);
        System.out.printf("%f\n", price2);
        System.out.printf("%f\n", price3);




    }
    
}
