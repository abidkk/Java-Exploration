//  Logical Operators ( AND, OR, NOT )

public class logical{
    static public void main(String args[]){
        

 
        int x = 10;
        int y = 20;
        int z = 30;


       // AND : && operator: all condition must be to True 
        System.out.println(x<y && z>x ); // true
        System.out.println(x<y && z<x ); // false


        // OR || Operator : any one condition should be true
        System.out.println(x > 30 || x > 5 ); // true
        System.out.println(x > 30 || x > 20 ); // false


        // Not ! Operator: Opposite of condition
        System.out.println(z > x); // true : without not operator
        System.out.println(!(z > x)); // false : with not operator
    }
}