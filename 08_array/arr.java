//  Array

public class arr{
    static public void main(String args[]){
       
        // Array
        String[] colors={"Red", "Green", "Blue", "White"};

        System.out.println(colors); // -------

        // Assess array value by index
        System.out.println(colors[2]); // Blue

        // modify array by index

        colors[2] = "Orange";
        System.out.println(colors[2]); // Orange

        // Array length

        System.out.println(colors.length); // 4
    }
}