// If, else , else if

public class ifElse{
    static public void main(String args[]){

        String myName = "Abid";
        int pin = 1002;



        // IF condition
        if (myName == "Abid") {
            System.out.println("Welcome");
        }


        // IF-ELSE

        if (myName == "Amir") {
            System.out.println("Hello");
        }else{
            System.out.println("Incorrect");
        }


        // IF , ELSE-IF , ELSE

        if (myName == "Asif") {
            System.out.println("Hi");
        } else if (pin == 1002) {
            System.out.println("Hello, Welcome");
        }else{
            System.out.println("Incorrect name & Pin");
        }

    }
}