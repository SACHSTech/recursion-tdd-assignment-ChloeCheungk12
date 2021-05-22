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
        
    }

    



    
    




}
