package recursionAssignment;

public class Recursion{
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

    public static String changePi(String str) {
        // base case
        if (str.equals("")){
            return ("");
        }

        // recursive step
        else if (str.length() < 2) {
            return str;
        }
        else if (str.substring(0,2).equals("pi")) {
            return (
                "3.14" + changePi(str.substring(2)));
        }
        else {
            return str.substring(0,1) + changePi(str.substring(1));
        }
       
    }

    



    
    




}
