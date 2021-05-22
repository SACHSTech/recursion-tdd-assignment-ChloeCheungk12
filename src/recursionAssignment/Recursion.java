package recursionAssignment;

public class Recursion{
    /**
    * A method count7(int n) takes an integer 
    * and returns the number of digits equal to 7
    * 
    * @param n the integer
    * @return the number of 7's in the integer
    * @author: Chloe Cheung
    *
    */

    public static int count7(int n){

        // Base case
        if (n == 0){
            return 0;
        }

        // Recursive Cases

        // if last digit is 7
        else if (n % 10 == 7){
            return(count7(n / 10) + 1);
        }
        
        // If last digit is not 7
        else {
            return(count7(n / 10));
        }
    }

    /**
    * A method changePi(String str) takes a string 
    * and returns a string with every instance of "pi" replaced with 3.14
    * 
    * @param str the String parameter
    * @return the new string with pi replaced with 3.14
    * @author: Chloe Cheung
    *
    */
    public static String changePi(String str) {
        // base case
        if (str.length() < 2) {
            return str;
        }
        // recursive step
        else if (str.substring(0,2).equals("pi")) {
            return (
                "3.14" + changePi(str.substring(2)));
        }
        else {
            return str.substring(0,1) + changePi(str.substring(1));
        }
       
    }

    /**
    * A method stringClean(String str) takes a string 
    * and returns a string with adjacent letters that are the same replaced with the letter
    * appearing once
    * 
    * @param str the String parameter
    * @return the new string with duplicated adjacent letters reduced to one letter
    * @author: Chloe Cheung
    *
    */
    
    public static String stringClean(String str){
        // base case
        if (str.length() < 2) {
            return str;
        }
        // recursive step
        else if (str.substring(0,1).equals(str.substring(1,2))) {
            return stringClean(str.substring(1));
        }
        else {
            return str.substring(0,1) + stringClean(str.substring(1));
        }


        
    }



    



    
    




}
