// Data Types

public class dtypes{
    static public void main(String[] args){

        // 1 String : letters, symbols, number in double quotes
        String myCourse = "Object Oriented Programming";
        String mySemester = "2nd";
        System.out.println(myCourse);
        System.out.println(mySemester);

        // 2 char : caharacter : a single letter in single quote
        char myGrade = 'A';
        char yourGrade = 'B';
        System.out.println("My Grade:" + " " + myGrade );
        System.out.println("Your Grade: " + yourGrade );


        // 3. Numbers : two types

          // 1.Integer types : int , short , long, byte 

                // (1) The int data type can store whole numbers from -2147483648 to 2147483647. In general, and in our tutorial, the int data type is the preferred data type when we create variables with a numeric value.
                int num1 = 12000;
                System.out.println(num1);

            
                // (2) The short data type can store whole numbers from -32768 to 32767:
                short num2 = 5000;
                System.out.println(num2);


                // (4) The byte data type can store whole numbers from -128 to 127. This can be used instead of int or other integer types to save memory when you are certain that the value will be within -128 and 127:
                byte num3 = -123;
                System.out.println(num3);  
        

              
                // (5) The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. This is used when int is not large enough to store the value. Note that you should end the value with an "L":
                long num5 = 15000000000L;
                System.out.println(num5);


            // 2. Float: Two types : You should use a floating point type whenever you need a number with a decimal, such as 9.99 or 3.14515


                // (1): flaot and 2 (double) : The float and double data types can store fractional numbers. Note that you should end the value with an "f" for floats and "d" for doubles:
    
                float fNum1 = 5.75f;
                System.out.println(fNum1);

                double fNum2 = 19.99d;
                System.out.println(fNum2);


        
        // 4. Boolean : TRUE | FALSE 
            boolean isJavaFun = true;
            boolean isFishTasty = false;
            System.out.println(isJavaFun);     // Outputs true
            System.out.println(isFishTasty);   // Outputs false

    }
}